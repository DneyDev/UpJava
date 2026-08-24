import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    final private double bonus;
    final private List<Funcionario>equipe;

    public Gerente(String name, double salary, double bonus){ //construtor de Gerente
        super(name, "Gerente", salary); //o "super" refere-se a Father Class "Funcionario"
        this.bonus = bonus;
        this.equipe = new ArrayList<>();
    }

    public void adicionarMembro(Funcionario funcionario){
        equipe.add(funcionario);
    }
    public double calcularSalarioTotal(){
        return getSalary()+ bonus;
    }

    @Override

    public void exibirInfo(){
        super.exibirInfo();//usnado novamente Super para puxar método da classe-pai

        System.out.println("Bônus: " + bonus);
        System.out.println("Equipe: " + equipe.size() + " membro(s)");
        System.out.printf("Salário total: %.2f%n", calcularSalarioTotal());
    }
}
