//Julia da Silva Belchior
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("digite o primeiro número iteiro:");
        n1 = entrada.nextInt();

        System.out.println("digite o segundo número inteiro:");
        n2 = entrada.nextInt();

        System.out.println("digite o terceirio número");
        n3 = entrada.nextInt();

        if ((n1 == n2) && (n2 == n3)) {
            System.out.println("os números são iguais");
        } else if ((n1 >= n2) && (n1 >= n3)) {
            System.out.println("o maior número é: " + n1);
        } else if ((n2 >= n1) && (n2 >= n3)) {
            System.out.println("o maior número é: " + n2);
        } else {
            System.out.println("o maior numero é: " + n3);

        }
        entrada.close();

    }
}
