import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // GRASP CONTROLLER:
        // Aqui criamos o ProductController, que será responsável por coordenar as ações
        // do sistema. Em vez de o Main manipular produtos diretamente,
        // delegamos essa responsabilidade ao Controller.
        ProductController controller = new ProductController();
        Scanner sc = new Scanner(System.in);

        // GRASP CREATOR aplicado dentro do ProductController:
        // O Main não cria produtos diretamente, ele apenas solicita ao controller,
        // mantendo o baixo acoplamento.

        controller.createProduct("Caderno", 12.50);
        controller.createProduct("Lápis", 2.00);

        System.out.println("Produtos cadastrados:");
        
        // Chamamos o controller para listar produtos,
        // garantindo que o Main continua simples (alta coesão).
        controller.listProducts();
    }
}

