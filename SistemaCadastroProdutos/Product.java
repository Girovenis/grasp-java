// GRASP: Information Expert e Creator
// A classe Product é especialista em armazenar os dados do produto.
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - R$ " + price;
    }
}
