import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        Scanner sc = new Scanner(System.in);

        controller.createProduct("Caderno", 12.50);
        controller.createProduct("Lápis", 2.00);

        System.out.println("Produtos cadastrados:");
        controller.listProducts();
    }
}
