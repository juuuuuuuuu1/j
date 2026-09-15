//Julia da Silva Belchior
import java.util.Scanner;

public class ex3 {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      int n1;
      int n2;
      int diferenca;

      System.out.println("digite o primeiro número inteiro:");
      n1 = entrada.nextInt();

      System.out.println("Digite o segundo número");
      n2 = entrada.nextInt();

      if (n1 == n2) {
         System.out.println("números iguais");

      } else if (n1 > n2) {
         diferenca = n1 - n2;
         System.out.println("A diferença é:" + diferenca);
      } else {
         diferenca = n2 - n1;
         System.out.println("A diferença é:" + diferenca);
      }
      entrada.close();

   }

}