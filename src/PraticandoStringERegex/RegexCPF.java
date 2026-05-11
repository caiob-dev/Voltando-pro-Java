package PraticandoStringERegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCPF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu CPF:");
        String cpf = input.nextLine();

        Pattern regex = Pattern.compile("\\d{3}.\\d{3}.\\d{3}-\\d{2}");
        Matcher matcher = regex.matcher(cpf);

        if(matcher.find()) {
            System.out.println("O CPF " + cpf + " está no formato válido.");
        } else {
            System.out.println("O CPF " + cpf + " não está no formato válido.");
        }
    }
}
