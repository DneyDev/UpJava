public class Produto{

    final private String name;
    private double price;
    private int quantidadeEstoque;

    public Produto(String name, double price, int quantidadeEstoque){ //construtor para poder acessar o as variáveis
        this.name = name; //atribuindo o parâmetro para as variáveis 
        this.price = price; 
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean venderUnidade(){ //método de comportamento da classe Produto
        if (quantidadeEstoque > 0) {
            quantidadeEstoque--;
            return true;
        } return false;
    }
    public void exibirInfo(){ //método de informações do produto
        System.out.println("\nProduct: "+ name);
        System.out.printf("Price: %.2f", price);
        System.out.printf("\nEstoque atual: %d", quantidadeEstoque);
    }

    public String getName() { //getter construído com o nome do parâmetro;
        return name;
    }
    public double getPrice() { 
        return price;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    //criar os setters
    public void setPrice(double price) {

        if (price <= 0) {
           throw new IllegalArgumentException("Preço deve ser maior que zero"); //lançar excessão para o usuário por valor errado
        } this.price = price;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {

        if(quantidadeEstoque < 0){
           throw new IllegalArgumentException("Quantidade deve ser maior!!");
        } this.quantidadeEstoque = quantidadeEstoque;
    }
}