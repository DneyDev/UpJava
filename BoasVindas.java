import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = leitor.nextInt();

        int idade = 2026 - anoNascimento;
        System.out.printf("Olá, %s! Você tem aproximadamente %d anos.%n", nome, idade);

        System.out.println("informe um numero: ");
        double numero1 = leitor.nextDouble();
        double numero2 = leitor.nextDouble();

        double calculoSoma = numero1 + numero2;
        double calculoSubtrair = numero1 - numero2;
        double calculoMultiplica = numero1 * numero2;
        double calculoDivisao = numero1 / numero2;

        System.out.printf("Soma resultado: "+ calculoSoma);
        System.out.printf("\nSubtrair resultado: "+ calculoSubtrair);
        System.out.printf("\nMultiplica resultado: "+ calculoMultiplica);
        System.out.printf("\nDividir resultado: "+ calculoDivisao);


        leitor.close();
    }
}