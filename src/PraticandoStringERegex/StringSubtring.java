package PraticandoStringERegex;

import java.util.Scanner;

public class StringSubtring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String arquivo = sc.nextLine();

        int ponto = arquivo.lastIndexOf(".");

        if (ponto != -1)  {
            String arquivoModificado = arquivo.substring(0, ponto);
            System.out.println("Nome do arquivo sem extensão: " + arquivoModificado);
        } else {
            System.out.println("O arquivo não possui extensão");
        }
    }
}
