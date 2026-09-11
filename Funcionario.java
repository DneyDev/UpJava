import java.util.List;

public abstract class Funcionario implements Pagavel {
    
    private final String name;
    private final String cargo;
    private double salary;

    public Funcionario(String name, String cargo, double salary) {
        this.name = name;
        this.cargo = cargo;
        this.salary = salary; 
    }

    public String getName() { return name; }
    public String getCargo() { return cargo; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        if(salary < 0){
            throw new IllegalArgumentException("Valor invalido!");
        } 
        this.salary = salary;
    }

    @Override
    public abstract double calcularSalarioTotal();

    public void exibirInfo() { 
        System.out.printf("\nNome: %s", name);
        System.out.printf("\nCargo: %s", cargo);
        System.out.printf("\nSalário Base: %.2f \n", salary);
    }

    public static double calcularFolhaPagamento(List<Funcionario> equipe) {
        double total = 0;
        for (Funcionario f : equipe) {
            if (f != null) {
                total += f.calcularSalarioTotal(); 
            }
        }
        return total;
    }
}