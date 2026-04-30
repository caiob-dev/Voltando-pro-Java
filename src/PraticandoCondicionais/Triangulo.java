package PraticandoCondicionais;

//Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo.
// Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado.
// Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.
//Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.
//
//Exemplo de entrada:
//
//Digite o primeiro lado: 3
//Digite o segundo lado: 4
//Digite o terceiro lado: 5

//Saída esperada:
//Os lados podem formar um triângulo.

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        int lado1 = leitura.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = leitura.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int lado3 = leitura.nextInt();

        if (lado1 + lado2 > lado3) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }

    }
}
