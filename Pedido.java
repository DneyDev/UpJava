import java.util.ArrayList;
import java.util.List;

public class Pedido {
    final private Cliente cliente;
    final private List<Produto> itens; //a partir de agora utilizando arraylist<>

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.itens= new ArrayList<>();
    }
    public void adicionarItem(Produto produto){ //método com atribuição para outra Classe
        if(produto.venderUnidade()){
            itens.add(produto);
        }else{
            System.out.println("Produto sem estoque: " + produto.getName());
        }
    }
    public double calcularTotal(){ //método de cálculo de valor
        double total = 0.00;
        for (Produto produto : itens){
            total += produto.getPrice();
        }
        return total;
    }
    public void exibirResumo(){
        System.out.println("===== RESUMO DO PEDIDO =====");
        System.out.println("Cliente: "+ cliente.getName());
        System.out.println();

        System.out.println("Produtos: ");

        for(Produto produto : itens){
            produto.exibirInfo();
        }
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
    }
}
