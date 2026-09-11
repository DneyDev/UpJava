import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> equipe = new ArrayList<>();

        // Agora usamos a classe concreta Analista no lugar do Funcionario abstrato
        equipe.add(new Analista("Carlos", 3500.0));
        equipe.add(new Gerente("Sidney", 6000.0, 1500.0));
        equipe.add(new Estagiario("Julia", 300.0));

        System.out.println("--- DADOS DA EQUIPE ---");
        for (Funcionario f : equipe) {
            f.exibirInfo();
            System.out.println("-----------------------");
        }

        // A folha de pagamento é calculada UMA única vez após exibir a equipe
        double folha = Funcionario.calcularFolhaPagamento(equipe);
        System.out.printf("\nCusto Total da Folha de pagamento: %.2f%n", folha);
    }
}