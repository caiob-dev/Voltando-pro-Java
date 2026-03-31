import java.util.Scanner;

public class ForeWhile {
   public static void main () {
//        Scanner leitura = new Scanner(System.in);
//
//        double nota = 0;
//        double mediaNotas = 0;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Digite as notas: ");
//            nota = leitura.nextDouble();
//            mediaNotas += nota;
//        }
//
//        System.out.println("Média das notas " + mediaNotas / 3);
//
//    }

       Scanner leitura = new Scanner(System.in);

       double nota = 0;
       double mediaNotas = 0;
       int totalNotas = 0;

       while (nota != -1) {
           System.out.println("Digite a avaliação pro filme e -1 para sair");
           nota = leitura.nextDouble();

           if (nota != -1) {
            mediaNotas += nota;
            totalNotas++;
           }
       }
       System.out.println("A média das notas para o filme é: " + mediaNotas/totalNotas);
   }
}