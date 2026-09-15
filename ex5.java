//Julia da Silva Belchior

import java.util.Scanner;

public class ex5 {
    public static void mains(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("digite um número inteirp:");
        n = entrada.nextInt();

        if ((n >= 50) && (n <= 100)) {
            System.out.println("pertence ao intervalo");

        } else {
            System.out.println("não pertence ao intervalo");
        }

        entrada.close();
    }

}