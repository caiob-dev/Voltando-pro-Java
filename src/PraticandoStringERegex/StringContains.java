package PraticandoStringERegex;

import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        System.out.println("Digite a palavra para verificar se está ou não no texto: ");
        String palavra = sc.nextLine();

        if (texto.contains(palavra)) {
            System.out.println("A palavra " + palavra + " está presente no texto");
        } else {
            System.out.println("A palavra " + palavra + " não está presente no texto");
        }
    }
}
