//Julia da Silva Belchior
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double sb;
        double p;
        double lp;

        System.out.println("digite o salario bruto:");
        sb = entrada.nextDouble();

        System.out.println("digite o valor da prestação:");
        p = entrada.nextDouble();

        lp = sb * 0.30;

        if (p <= lp) {
            System.out.println("emprestimo concedido.");
        } else {
            System.out.println("emprestimo negado.");
        }
        entrada.close();

    }
}
