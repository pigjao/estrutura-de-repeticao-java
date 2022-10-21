import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreve uma nota de 0 a 10");

        int nota;
        for(nota = leitor.nextInt(); nota < 0 || nota > 10; nota = leitor.nextInt()) {
            System.out.println("Nota " + nota + " inválida, insira novamente uma nota de 0 a 10:");
        }

        System.out.println("Obrigado, nota: " + nota + " guardada com sucesso");
    }
}
