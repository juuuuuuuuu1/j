//Julia da Silva Belchior

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("digite o primeiro número");
        n1 = entrada.nextDouble();

        System.out.println("digite o segundo número");
        n2 = entrada.nextDouble();

        if (n1 > n2) {
            System.out.println("ordem decrescente: " + n1 + " e " + n2);
        } else {
            System.out.println("ordem decrescente: " + n2 + " e " + n1);

        }

        entrada.close();

    }

}
