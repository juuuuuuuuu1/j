//Julia da Silva Belchior
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1;
        double n2;
        double r;
        char op;

        System.out.println("Digite o primeiro número");
        n1 = entrada.nextDouble();

        System.out.println("Digite o segundo número");
        n2 = entrada.nextDouble();

        System.out.println("Digite a operação desejada (ex: +, -, * ou /):");
        op = entrada.next().charAt(0);

        if (op == '+') {
            r = n1 + n2;
            System.out.println("O resultado da soma é: " + r);
        } else if (op == '-') {
            r = n1 - n2;
            System.out.println("O resultado da subtração é: " + r);
        } else if (op == '*') {
            r = n1 * n2;
            System.out.println("O resultado da multiplicação é: " + r);
        } else if (op == '/') {
            if (n2 != 0) {
                r = n1 / n2;
                System.out.println("O resultado da divisão é: " + r);
            } else {
                System.out.println("Erro: Divisão impossível.");
            }
        } else {
            System.out.println("sinal inválido.");
        }

        entrada.close();
    }
}
