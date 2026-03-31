import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class PracticeThree {
    public static void main() {
        //Crie um programa que solicite ao usuário digitar um número.
        // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

      Scanner leitura = new Scanner(System.in);
//        int number;
//        System.out.println("Digite um número");
//        number = leitura.nextInt();
//
//        if (number > 0) {
//            System.out.println("Número digitado é positivo!");
//        } else {
//            System.out.println("Número digitado é negativo!");
//        }
        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
        // se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

//        int n1;
//        int n2;
//
//        System.out.println("Digite um número");
//        n1 = leitura.nextInt();
//
//        System.out.println("Digite outro número");
//        n2 = leitura.nextInt();
//
//
//        if (n1 == n2) {
//            System.out.println("Os números digitados são iguais");
//        } else if(n1 > n2) {
//            System.out.println("Os números digitados são diferentes, n1 é maior");
//        } else {
//            System.out.println("Os números digitados são diferentes, n2 é maior");
//        }


      //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
        // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

//      int escolha = 0;
//
//        while(escolha != 3) {
//            System.out.println("Menu");
//            System.out.println("1. Calcular área do quadrado");
//            System.out.println("2. Calcular área do círculo");
//            System.out.println("3. Sair");
//            System.out.println("Escolha uma opção");
//            escolha = leitura.nextInt();
//
//
//        if (escolha == 1) {
//            System.out.println("Digite o lado do quadrado:");
//            double lado = leitura.nextDouble();
//            double areaQuadrado = lado * lado;
//            System.out.println("A área do quadrado é: "+ areaQuadrado);
//        } else if (escolha == 2) {
//            System.out.println("Digite o raio do círculo:");
//            double raio = leitura.nextDouble();
//            double areaCirculo = 3.14 * raio * raio;
//            System.out.println("A área do circulo é: "+ areaCirculo);
//        } else if (escolha == 3) {
//            System.out.println("Programa encerrado");
//        } else {
//            System.out.println("Número inválido, digite um número válido");
//        }
//        }

        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

//        int numero;
//
//        System.out.println("Digite um número");
//        numero = leitura.nextInt();
//
//        for (int i = 0; i <= 10 ; i++) {
//            int calculo = numero * i;
//            System.out.println(numero + "x" + i + " = " + calculo);
//        }

        //Crie um programa que solicite ao usuário a entrada de um número inteiro.
        // Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

//        int numberParOuImpar;
//
//        System.out.println("Digite um número");
//        numberParOuImpar = leitura.nextInt();
//
//        if (numberParOuImpar % 2 == 0) {
//            System.out.println("Par");
//        } else {
//            System.out.println("Ímpar");
//        }

        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.



        System.out.println("Digite um número para o cálculo fatorial:");
        int n = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
