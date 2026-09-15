//Julia da Silva Belchior
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double s;
        double b;
        int at;

        System.out.println("digite o salario:");
        s = entrada.nextDouble();

        System.out.println("digite os anos trabalhados:");
        at = entrada.nextInt();

        if (at >= 5) {
            b = s * 20;
        } else {
            b = s * 10;
        }

        System.out.printf("valor do bonus: R$ %.2f%n ", b);
        entrada.close();

    }
}
