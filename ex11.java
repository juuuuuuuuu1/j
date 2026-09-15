//Julia da Silva Belchior
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i;
        System.out.println("digite a idade do nadador:");
        i = entrada.nextInt();
        if (i >= 5 && i <= 7) {
            System.out.println("infantil A");
        } else if (i >= 8 && i <= 10) {
            System.out.println("infantil B");
        } else if (i >= 11 && i <= 13) {
            System.out.println("juvenil A");
        } else if (i >= 14 && i <= 17) {
            System.out.println("juvenil B");
        } else if (i >= 18) {
            System.out.println("categoria adulto");
        } else {
            System.out.println("idade sem categoria");
        }
        entrada.close();

    }
}