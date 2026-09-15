//Julia da Silva Belchior
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i;
        char br;
        char sx;
        char tm = 's';
        char al;
        char tr;
        char dp;

        System.out.println("Digite a idade da pessoa na eleição:");
        i = entrada.nextInt();
        System.out.println("Digite se a pessoa possui nacionalidade brasileira (s/n):");
        br = entrada.next().charAt(0);
        System.out.println("Digite o sexo da pessoa (m/f):");
        sx = entrada.next().charAt(0);

        if (sx == 'm' && i >= 18) {
            System.out.println("Digite se a pessoa possui serviço militar obrigatorio (s/n):");
            tm = entrada.next().charAt(0);
        }
        System.out.println("Digite se a pessoa é alfabetizada (s/n):");
        al = entrada.next().charAt(0);
        System.out.println("Digite se a pessoa possui titulo de eleitor (s/n):");
        tr = entrada.next().charAt(0);
        System.out.println("Digite se a pessoa esta com os direitos politicos ativos (s/n):");
        dp = entrada.next().charAt(0);

        if (i < 16) {
            System.out.println("a pessoa não pode votar");
        } else if (br != 's') {
            System.out.println("a pessoa não pode votar");
        } else if (sx == 'm' && i >= 18 && tm == 'n') {
            System.out.println("a pessoa não pode votar");
        } else if (al != 's') {
            System.out.println("a pessoa não pode votar");
        } else if (tr != 's') {
            System.out.println("a pessoa não pode votar");
        } else if (dp != 's') {
            System.out.println("a pessoa não pode votar");
        } else if (i >= 18 && i <= 70 && al == 's') {
            System.out.println("a pessoa é obrigada a votar");
        } else {
            System.out.println("a pessoa pode votar");
        }

        entrada.close();
    }

}
