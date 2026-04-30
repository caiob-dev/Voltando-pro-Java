package PraticandoLacosDeRepeticao;

import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        //Pedro quer calcular o fatorial de um número. O fatorial de um número é o produto de todos os números inteiros positivos de 1 até o próprio número.
        // Por exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120. Crie um programa que receba um número e calcule seu fatorial.
        //
        //Exemplo de entrada:
        //
        //Digite um número: 5

        //Saída esperada:
        //O fatorial de 5 é: 120

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeros = leitura.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeros ; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeros + " é: " + fatorial);


    }
}
