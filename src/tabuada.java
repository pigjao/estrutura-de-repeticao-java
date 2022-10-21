import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int multiplicadorAuto = 0;
        int contador = 0;
        System.out.println("Digite um número de 0 a 10 para gerarmos a tabuada dele");
        int multiplicadorIn = leitor.nextInt();

        do {
            if (multiplicadorIn < 0 || multiplicadorIn > 10) {
                System.out.println("O valor inserido está fora dos padrões, o programa será encerrado");
                break;
            }

            ++multiplicadorAuto;
            int resultado = multiplicadorAuto * multiplicadorIn;
            System.out.println("" + multiplicadorIn + " X " + multiplicadorAuto + " = " + resultado);
            ++contador;
        } while(contador < 10);

    }
}
