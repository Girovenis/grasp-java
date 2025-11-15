// GRASP: Controller
public class ProductController {
    private ProductRepository repository = new ProductRepository();

    public void createProduct(String name, double price) {
        repository.addProduct(name, price);
    }

    public void listProducts() {
        for (Product p : repository.getProducts()) {
            System.out.println(p);
        }
    }
}
