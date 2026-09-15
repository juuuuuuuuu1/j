//Julia da Silva Belchior
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String s;

        System.out.println("Digite a senha:");
        s = entrada.nextLine();

        if (s.equals("j1j2")) {
            System.out.println("acesso concedido");
        } else {
            System.out.println("acesso negado");
        }
        entrada.close();
    }

}
