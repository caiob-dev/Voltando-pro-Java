package PraticandoStringERegex;

import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor = input.nextDouble();

        System.out.println("Valor formatado: R$" + String.format("%.2f", valor));

    }
}
