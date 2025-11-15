/ GRASP: Information Expert
// A classe Product concentra as informações relacionadas a um produto,
// como nome e preço. Pelo princípio do Especialista em Informação (Information Expert),
// faz sentido que ela mesma armazene e forneça seus dados,
// pois é quem possui o conhecimento necessário sobre eles.
//
// GRASP: Creator (indiretamente)
// Mesmo a classe Product não crie outros objetos,
// ela é criada de forma consistente no ProductRepository,
// que tem os dados necessários. A classe Product em si segue o padrão
// de ser uma entidade simples do domínio, com alta coesão e baixa complexidade.
public class Product {
    private String name;
    private double price;
    
    // Construtor: responsável por inicializar o estado do produto
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Método toString: especialista em apresentar as informações do produto.
    // Isso reforça o GRASP Information Expert,
    // já que o próprio produto sabe como deve ser exibido
    @Override
    public String toString() {
        return name + " - R$ " + price;
    }
}

