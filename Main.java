public class Main {
    public static void main(String[] args) {
        //Exercício para treinamento de implementar classe Produto com construtor, this e setters validados
        Funcionario f1 = new Funcionario("Sidney", "Desenvolvedor Java", 4500.0);
        Funcionario f2 = new Funcionario("Daniel", "Estagiário de Desenvolvimento");
        Funcionario f3 = new Funcionario("Pedro");

        f1.exibirInfo();
        f2.exibirInfo();
        f3.exibirInfo();
    }
}