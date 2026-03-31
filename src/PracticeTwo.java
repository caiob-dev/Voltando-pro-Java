import java.util.Scanner;
import java.util.Random;

public class PracticeTwo {
    public static void main() {
        double nota1 = 9.5;
        double nota2 = 9.0;
        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        int castingToInt = (int) media;
        System.out.println("Fazendo o casting para int: " + castingToInt);

        String saudacao = "Olá seja bem vindo";
        char charr = '!';
        String msg = saudacao + charr;
        System.out.println(msg);

        double precoProduto = 8.50;
        int quantidade = 100;

        String total = "Total: R$" + quantidade * precoProduto;
        System.out.println(total);

        double valorEmDolares = 50;
        double dolarHoje = 4.94;
        double totalDolar = valorEmDolares * dolarHoje;

        System.out.println(String.format("Total em reais %.2f", totalDolar));

        double precoOriginal = 320.50;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;
        System.out.println("Novo preço com desconto: R$" + novoPreco);


        // Gerando número aleatório
        Scanner sc = new Scanner(System.in);

        int numRandom = new Random().nextInt(10);
        int tentativas = 0;
        int numDigitado = 0;

        while (tentativas < 5) {
           System.out.println("Digite um número entre 0 a 10: ");
           numDigitado = sc.nextInt();
           tentativas++;

           if (numDigitado == numRandom) {
               if(tentativas == 1) {
                   System.out.println("Parabéns você acertou o número na " + tentativas + " tentativa!");
               } else {
               System.out.println("Parabéns você acertou o número em " + tentativas + " tentativas!");
               }
               break;
           } else if(numDigitado < numRandom) {
               System.out.println("O número aleatório é maior do que o número digitado");
           } else {
               System.out.println("O número aleatório é menor do que o número digitado");
           }
       }

        if (tentativas == 5 && numDigitado != numRandom) {
            System.out.println("Você não conseguiu acertar em 5 tentativas! O número era: " + numRandom);
        }
    }
}
