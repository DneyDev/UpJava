public class Analista extends Funcionario {

    public Analista(String name, double salary) {
        super(name, Cargo.ANALISTA, salary);
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalary(); // O analista ganha apenas o salário base neste exemplo
    }
}