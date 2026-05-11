package PraticandoStringERegex;

import java.util.Scanner;

public class StringTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome com espaço: ");
        String nome = sc.nextLine();

        System.out.println("Nome sem espaços: " + nome.trim());
        sc.close();
    }
}
