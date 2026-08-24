public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Sidney", 6000.0, 1500.0);

        Funcionario dev1 = new Funcionario("Ana", "Desenvolvedora", 4000.0);
        Funcionario dev2 = new Funcionario("Pedro", "Desenvolvedor", 4200.0);

        gerente.adicionarMembro(dev1);
        gerente.adicionarMembro(dev2);

        gerente.exibirInfo();

        /*
        O que esse exercício testa:

        extends + super(...) — o construtor da subclasse é obrigado a chamar (explícita ou implicitamente) um construtor da superclasse, e super(...) também só pode ser a primeira linha, igual o this(...) que você já viu.
        A diferença entre composição (o que você fez em Pedido, que tem um Cliente) e herança (Gerente é um Funcionario) — repare que equipe dentro de Gerente é composição, mas a relação Gerente/Funcionario é herança. As duas convivem na mesma classe.
        @Override + super.metodo() — sobrescrever sem jogar fora o comportamento original.
        */
    }
}