package PraticandoStringERegex;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = sc.nextLine();
        System.out.println("Digite a palavra a ser substituída: ");
        String palavra = sc.nextLine();

        if (!texto.contains(palavra)) {
            System.out.println("Palavra não está no texto");
            sc.close();
            return;
        }

        System.out.println("Digite a nova palavra: ");
        String novaPalavra = sc.nextLine();

        String textoModificado = texto.replace(palavra, novaPalavra);

        System.out.println("Texto modificado: " + textoModificado);
    }
}
