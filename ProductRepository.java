import java.util.ArrayList;
import java.util.List;

// GRASP CREATOR
// Esta classe é responsável por armazenar e gerenciar objetos do tipo Product.
// Pelo princípio Creator do GRASP, faz sentido que o repositório seja responsável
// por criar (instanciar) novos produtos, pois:
//
//  Ele possui e mantém a coleção de produtos.
//  Ele tem todas as informações necessárias para criar um novo produto.
//  Evita que outras classes precisem saber como os produtos são criados.
//
// Assim, a responsabilidade de criação é centralizada e a aplicação fica mais coesa.
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, double price) {
// GRASP CREATOR:
// Aqui o repositório cria a instância de Product,
// porque ele é quem administra essa coleção.
// Isso mantém o ProductController simples e com baixo acoplamento.
        products.add(new Product(name, price));
    }
// Retorna alista de produtos armazenados
    public List<Product> getProducts() {
        return products;
    }
}

