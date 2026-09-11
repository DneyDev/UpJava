public class Gerente extends Funcionario implements Demissivel{
    
    private final double bonus;

    // Construtor: o "super" repassa os dados para a classe pai (Funcionario)
    public Gerente(String name, double salary, double bonus) {
        super(name, Cargo.GERENTE, salary); 
        this.bonus = bonus;
    }
    @Override
    public double calcularSalarioTotal() {
        return getSalary() + bonus;
    }
    @Override
    public void demitir(String motivo) {
        System.out.println(getName() + " foi demitido. Motivo: " + motivo);
    }
    // Sobrescrevendo a exibição para incluir o bônus
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o exibirInfo() da classe pai
        System.out.printf("Bônus: %.2f \n", bonus);
        System.out.printf("Salário Total: %.2f \n", calcularSalarioTotal());
    }
}