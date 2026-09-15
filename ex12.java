//Julia da Silva Belchior
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double s;
        double d;

        System.out.println("digite o salario:");
        s = entrada.nextDouble();

        if (s <= 600.00) {
            d = 0;
        } else if (s <= 1200.00) {
            d = s * 0.20;
        } else if (s <= 2000.00) {
            d = s * 0.25;
        } else {
            d = s * 0.30;
        }
        System.out.printf("desconto do INSS: R$ %.2f%n", d);
        entrada.close();
    }

}
