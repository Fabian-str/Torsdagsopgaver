import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<Long, Product> productById = new HashMap<>();

    public void addProduct(Product product) {
        productById.put(product.getProductID(), product);
    }

    public Product getById(long id) {
        return productById.get(id);
    }

    public Collection<Product> getAllProducts() {
        return productById.values();
    }

    public int size() {
        return productById.size();
    }
}
