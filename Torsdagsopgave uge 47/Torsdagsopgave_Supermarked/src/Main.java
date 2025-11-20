import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        LoadProducts loader = new LoadProducts();

        ProductCatalog allProducts = loader.loadFromFile("data/varer.csv");
        ProductCatalog salesProducts = loader.loadFromFile("data/tilbud.csv");

        System.out.println("Loaded: " + allProducts.size() + " products...");
        System.out.println("Loaded: " + salesProducts.size() + " products on sale...");

        Robot robot = new Robot();
        Collection<Product> kurv = robot.fyldIKurv(allProducts.getAllProducts());

        CashRegister register = new CashRegister(allProducts, salesProducts, 0.25);

        register.printReceipt(kurv);
    }
}
