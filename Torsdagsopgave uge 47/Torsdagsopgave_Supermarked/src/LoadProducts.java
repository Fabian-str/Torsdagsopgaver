import java.util.ArrayList;

public class LoadProducts {

    private FileIO fileIO = new FileIO();

    public ProductCatalog loadFromFile(String path) {
        ArrayList<String> lines = fileIO.readData(path);
        ProductCatalog catalog = new ProductCatalog();

        for (String line : lines) {
            String[] parts = line.split(";");
            if (parts.length < 10) {
                System.out.println("Invalid line: " + line);
                continue;
            }

            long id = Long.parseLong(parts[0]);
            String name = parts[1];
            String priceData = parts[2];
            double price = Double.parseDouble(parts[3]);
            boolean isBudgetBrand =  Boolean.parseBoolean(parts[4]);
            double quantity = Double.parseDouble(parts[5]);
            String unit =  parts[6];
            boolean isWeighted = Boolean.parseBoolean(parts[7]);
            boolean isBio = Boolean.parseBoolean(parts[8]);
            boolean isAvailable = Boolean.parseBoolean(parts[9]);

            Product product = new Product(id, name, priceData, price, isBudgetBrand, quantity, unit, isWeighted, isBio, isAvailable);

            catalog.addProduct(product);
        }

        return catalog;
    }
}
