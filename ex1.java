//Julia da Silva Belchior
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("digite um número inteiro:");
        numero = entrada.nextInt();

        if (numero > 20) {
            double metade = numero / 2.0;
            System.out.println("A metade do número e: " + metade);
        }

        entrada.close();

    }
}