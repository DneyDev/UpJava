public class Main {
    public static void main(String[] args) {
        //Exercício para treinamento de implementar classe Produto com construtor, this e setters validados
        Produto produto = new Produto("Teclado Mecânico", 250.0, 5);
        produto.exibirInfo();

        produto.venderUnidade();
        produto.venderUnidade();
        produto.exibirInfo();

        try {
            produto.setPrice(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}