public class Estagiario extends Funcionario {
    final private double auxilioTransporte;

    public Estagiario(String name, double auxilioTransporte){
        super(name, "Estagiario", 1200); //super(name, cargo: "use as aspas para chamar o parametro fixo", salary: *só digitar o número)
        this.auxilioTransporte = auxilioTransporte; //sempre chamar com this no construtor quando criado dentro da classe
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Auxílio transporte: %.2f%n", auxilioTransporte);
    }
}
