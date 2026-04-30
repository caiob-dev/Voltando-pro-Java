package PraticandoCondicionais;

import java.util.Scanner;

//Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros,
// compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.
//Exemplo de entrada:
//Digite o primeiro número: 10
//Digite o segundo número: 25
//Saída esperada:
//
//O maior número é 25.
public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if(numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }
        sc.close();
    }
}
