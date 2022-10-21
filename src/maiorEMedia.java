import java.util.Scanner;

public class maiorEMedia {
    public static void main(String[] args) {
        int nMaior = 0;
        int nMedio = 0;
        int contador = 0;
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Digite um número");
            int numero = leitor.nextInt();
            nMedio += numero;
            if (nMaior < numero) {
                nMaior = numero;
            }

            ++contador;
        } while(contador < 5);

        nMedio /= 5;
        System.out.println("A média dos números digitados é " + nMedio);
        System.out.println("O maior número digitado foi o " + nMaior);
    }
}
