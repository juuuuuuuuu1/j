//Julia da Silva Belchior
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a;
        double pi;
        char s;

        System.out.println("digite a altura em metros:");
        a = entrada.nextDouble();

        System.out.println("digite M para masculino F para feminino: ");
        s = entrada.next().toUpperCase().charAt(0);

        if (s == 'M') {
            pi = (72.7 * a) - 58;
            System.out.printf("o peso ideal é %.2f kg%n", pi);

        } else if (s == 'F') {
            pi = (62.1 * a) - 44.7;
            System.out.printf("o peso ideal é %2f kg%n", pi);

        } else {
            System.out.println("Sexo invalido");
        }
        entrada.close();

    }
}
