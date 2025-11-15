# grasp-java

Sistema de Cadastro de Produtos
--------------------------------------------

Descrição
--------------------------------------------
Sistema simples desenvolvido em Java para cadastro e listagem de produtos.
O objetivo principal é demonstrar na prática a aplicação dos princípios GRASP na arquitetura do código.

O sistema foi projetado com:
- responsabilidades bem definidas
- baixo acoplamento
- alta coesão
- aplicação dos padrões GRASP Creator, Controller e Information Expert

--------------------------------------------
Estrutura do Projeto
--------------------------------------------
SistemaCadastroProdutos/

  
    Main.java
    
    Product.java
    
    ProductRepository.java
    
    ProductController.java
    

--------------------------------------------
Descrição das Classes
--------------------------------------------

Product.java
- Representa um produto com nome e preço.

ProductRepository.java
- Gerencia a criação e armazenamento dos produtos.

ProductController.java
- Controla o fluxo principal do sistema (cadastro e listagem).

Main.java
- Executa o programa e mostra os produtos cadastrados.

--------------------------------------------
Princípios GRASP Aplicados
--------------------------------------------

1. Creator
Classe aplicada: ProductRepository
O repositório é responsável por criar e armazenar objetos Product.
Isso centraliza a criação e reduz dependências externas.

2. Controller
Classe aplicada: ProductController
Gerencia as ações principais do sistema.
Evita que a classe Main fique sobrecarregada com regras de negócio.

3. Information Expert
Classe aplicada: Product
O produto conhece seus próprios dados e sabe como apresentá-los.

4. Low Coupling
Cada classe depende minimamente das outras.
Isso facilita manutenção e evolução do sistema.

5. High Cohesion
Cada classe realiza apenas sua responsabilidade:
- Product → dados
- ProductRepository → armazenamento
- ProductController → operações
- Main → execução

--------------------------------------------
Como Executar
--------------------------------------------

1. Compile os arquivos:
   javac *.java

2. Execute o programa:
   java Main

--------------------------------------------
Exemplo de Saída
--------------------------------------------
Produtos cadastrados:
Caderno - R$ 12.5
Lápis - R$ 2.0


--------------------------------------------
Objetivo Acadêmico
--------------------------------------------
Projeto desenvolvido para a disciplina de Programação Orientada a Objetos,
com foco na aplicação prática dos princípios GRASP.

