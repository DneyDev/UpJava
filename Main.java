import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> equipe = new ArrayList<>();

        equipe.add(new Funcionario("Carlos", "Analista", 3500.0));
        equipe.add(new Gerente("Sidney", 6000.0, 1500.0));
        equipe.add(new Estagiario("Julia", 300.0));

        for (Funcionario f : equipe) {
            double folha = calcularFolhaPagamento(equipe);
            f.exibirInfo();
            System.out.println("---");
            System.out.printf("Folha de pagamento: %.2f%n", folha);
        }

        /*
        O que esse exercício testa:

        extends + super(...) — o construtor da subclasse é obrigado a chamar (explícita ou implicitamente) um construtor da superclasse, e super(...) também só pode ser a primeira linha, igual o this(...) que você já viu.
        A diferença entre composição (o que você fez em Pedido, que tem um Cliente) e herança (Gerente é um Funcionario) — repare que equipe dentro de Gerente é composição, mas a relação Gerente/Funcionario é herança. As duas convivem na mesma classe.
        @Override + super.metodo() — sobrescrever sem jogar fora o comportamento original.
        */
    }
}