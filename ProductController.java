// GRASP: CONTROLLER
// Esta classe atua como o "controlador" do sistema,
// ou seja, ela é responsável por receber as solicitações externas
// (como as chamadas feitas pelo Main) e coordenar as ações necessárias.
// Isso evita que o Main fique sobrecarregado com lógica,
// promovendo BAIXO ACOPLAMENTO e ALTA COESÃO.
public class ProductController {
    // O controller delega o armazenamento e recuperação ao repositório.
    // Isso mantém o controller focado na coordenação, não nos dados.
    private ProductRepository repository = new ProductRepository();

    // GRASP CREATOR (indiretamente):
    // Embora o controller não crie o produto diretamente,
    // ele delega a criação para o repositório, que tem as informações
    // e estrutura necessárias para fazer isso corretamente.

    public void createProduct(String name, double price) {
        repository.addProduct(name, price);
    }
    
   // O controller coordena a operação de listar,
   // mas não sabe como os produtos são armazenados.
   // Isso reduz acoplamento e mantém a responsabilidade bem distribuída 

    public void listProducts() {
        for (Product p : repository.getProducts()) {
            System.out.println(p);
        }
    }
}

