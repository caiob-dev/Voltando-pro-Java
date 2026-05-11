package PraticandoStringERegex;

import java.util.Scanner;

public class StringUpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = sc.nextLine();

        String maiuscula = texto.toUpperCase();
        String minuscula = texto.toLowerCase();

        System.out.println("Maiuscula: " + maiuscula);
        System.out.println("Minuscula: " + minuscula);
    }
}
