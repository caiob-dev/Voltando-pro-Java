package PraticandoStringERegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCodigo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o código de referência: ");
        String codigo = input.nextLine();

        Pattern regex = Pattern.compile("^[A-Z]{3}-\\d{4}");
        Matcher matcher = regex.matcher(codigo);

        if (matcher.find()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência não está válido.");
        }
    }
}
