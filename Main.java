public class Main {
    public static void main(String[] args) {
        //Exercício para treinamento de implementar classe Produto com construtor, this e setters validados
        Cliente cliente = new Cliente("Sidney", "000.000.000-00");
        Pedido pedido = new Pedido(cliente);

        Produto teclado = new Produto("Teclado Mecânico", 250.0, 2);
        Produto mouse = new Produto("Mouse Gamer", 120.0, 0); // sem estoque de propósito

        pedido.adicionarItem(teclado);
        pedido.adicionarItem(mouse); // deve avisar que está sem estoque

        pedido.exibirResumo();
    }
}