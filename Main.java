import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercício para treinamento de condicionais, array e loops

       try(Scanner leitor = new Scanner(System.in)){ //usando try-with-resources para otimizar o Scanner e evitar erro do compilador Java

            System.out.println("Informe quantas notas vai digitar: ");
            int quantidade = leitor.nextInt();

            double[] notas = new double[quantidade]; //cria array notas que limita as notas informadas pelo valor da var quantidade.
            double soma = 0;
            int i;

            for (i = 0; i < quantidade; i++){ //criando um índice "i" para percorrer as notas informadas
                System.out.println("Nota "+ (i + 1)+ ": ");
                notas[i] = leitor.nextDouble();
                soma += notas[i];
            }

            double media = soma / quantidade;
            String status;

            if(media >=0 && media <= 2){
                status = "Reprovado";
                System.out.println(status);
            }
            else if(media < 6){
                status = "Recuperar";
                System.out.println(status);
            }
            else{
                status = "Aprovado!!";
                System.out.println(status);
            }
            for (int j = 0; j < notas.length; j++) {
                System.out.printf("Nota %d: %.2f%n", j + 1, notas[j]);
            }
            System.out.printf("Media: %.2f", media);
        }
    }
}