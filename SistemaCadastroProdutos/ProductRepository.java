import java.util.ArrayList;
import java.util.List;

// GRASP: Creator
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, double price) {
        products.add(new Product(name, price));
    }

    public List<Product> getProducts() {
        return products;
    }
}
