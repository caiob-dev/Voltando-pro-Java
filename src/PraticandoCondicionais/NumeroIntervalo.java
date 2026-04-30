package PraticandoCondicionais;

import java.util.Scanner;

public class NumeroIntervalo {
    //Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não
    // vai de 1000 a 5000 reais.
    //Exemplo de entrada:
    //Digite o valor do empréstimo: 750
    //Saída esperada:
    //O valor 750, não está dentro do intervalo permitido para empréstimo.
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo: ");
        double valor = leitura.nextDouble();


        if (valor >= 1000 & valor <= 5000 ) {
            System.out.println("O valor está dentro do intervalo permitido para empréstimo: " + valor);
        } else {
            System.out.println("O valor " + valor + ", não está dentro do intervalo permitido para empréstimo ");
        }

    }
}
