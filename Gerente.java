public class Gerente extends Funcionario {
    
    private final double bonus;

    // Construtor: o "super" repassa os dados para a classe pai (Funcionario)
    public Gerente(String name, double salary, double bonus) {
        super(name, "Gerente", salary); 
        this.bonus = bonus;
    }
    @Override
    public double calcularSalarioTotal() {
        return getSalary() + bonus;
    }
    // Sobrescrevendo a exibição para incluir o bônus
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o exibirInfo() da classe pai
        System.out.printf("Bônus: %.2f \n", bonus);
        System.out.printf("Salário Total: %.2f \n", calcularSalarioTotal());
    }
}