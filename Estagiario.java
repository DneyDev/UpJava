public class Estagiario extends Funcionario {
    final private double auxilioTransporte;

    public Estagiario(String name, double auxilioTransporte){
        super(name, Cargo.ESTAGIARIO, 1200); 
        this.auxilioTransporte = auxilioTransporte; 
    }
    @Override
    public double calcularSalarioTotal() {
        return getSalary() + auxilioTransporte;
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Auxílio transporte: %.2f%n", auxilioTransporte);
    }
}