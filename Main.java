import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercício para treinamento de implementar Validador de senha com metodos estaticos e manipulacao de String

        try(Scanner leitor = new Scanner(System.in)){
            System.out.print("Digite uma senha: ");
            String senha = leitor.nextLine();

            System.out.println("Força da senha: " + ValidadorDeSenha.avaliarForca(senha));//aqui fazemos a chamada da Classe do validador e usamos o método avaliarForca, o mesmo ocorre nas operações abaixo
            System.out.println(
                "Tamanho mínimo: " +
                ValidadorDeSenha.temTamanhoMinimo(senha)
            );
            System.out.println(
                "Possui número: " +
                ValidadorDeSenha.temNumero(senha)
            );
            System.out.println(
                "Possui letra maiúscula: " +
                ValidadorDeSenha.temLetraMaiuscula(senha)
            );
            System.out.println(
                "Possui caractere especial: " +
                ValidadorDeSenha.temCharEspecial(senha)
            );
        }
    }
}