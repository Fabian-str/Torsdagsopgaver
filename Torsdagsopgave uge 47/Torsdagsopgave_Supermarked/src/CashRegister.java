import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CashRegister {

    private ProductCatalog reglCatalog;
    private ProductCatalog saleCatalog;
    private double vatRate;

    public CashRegister(ProductCatalog reglProducts, ProductCatalog saleProducts,  double vatRate) {
        this.reglCatalog = reglProducts;
        this.saleCatalog = saleProducts;
        this.vatRate = vatRate;
    }

    public void printReceipt(Collection<Product> cart) {
        Map<Long, Integer> quantityById = new HashMap<>();
        for (Product p : cart) {
            long id = p.getProductID();
            int oldQuantity = quantityById.getOrDefault(id, 0);
            quantityById.put(id, oldQuantity + 1);
        }

        double total = 0.0;
        double totalDiscount = 0.0;

        System.out.println("========== KASSEBON ==========");

        for (Map.Entry<Long, Integer> entry : quantityById.entrySet()) {
            long id = entry.getKey();
            int quantity = entry.getValue();

            Product normal = reglCatalog.getById(id);
            Product sale = saleCatalog.getById(id);

            if (normal == null) {
                System.out.println("Warning: Product " + id + " not found");
                continue;
            }

            double unitPrice;
            double discountPerUnit = 0.0;

            if (sale != null) {
                unitPrice = sale.getPrice();
                discountPerUnit = normal.getPrice() - sale.getPrice();
            }  else {
                unitPrice = normal.getPrice();
            }

            double lineTotal = unitPrice * quantity;
            double lineDiscount = discountPerUnit * quantity;

            total += lineTotal;
            totalDiscount += lineDiscount;

            String name = normal.getProductName();

            System.out.printf("%-30s %3d x %7.2f = %8.2f%n", name, quantity, unitPrice, lineTotal);

            if (sale != null && lineDiscount > 0) {
                double normalLinePrice = normal.getPrice() * quantity;
                System.out.printf("  Normalpris:          %8.2f%n", normalLinePrice);
                System.out.printf("  RABAT:               %8.2f%n", - lineDiscount);
            }
        }

        double vatPart = calculateVatPart(total);

        System.out.println("------------------------------");
        System.out.printf("TOTAL:             %10.2f%n", total);
        System.out.printf("Heraf moms:        %10.2f%n", vatPart);
        if (totalDiscount > 0) {
            System.out.printf("Du har sparet:     %10.2f%n", totalDiscount);
        }
        System.out.println("==============================");
    }

    private double calculateVatPart(double totalPrice) {
        return totalPrice * vatRate / (1.0 +  vatRate);
    }
}