package PraticandoStringERegex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto com # nas palavras chaves: ");
        String texto = sc.nextLine();

        ArrayList<String> hashtags = new ArrayList<>();

        Pattern regex = Pattern.compile("#\\w+");
        Matcher matcher = regex.matcher(texto);

        while(matcher.find()) {
            hashtags.add(matcher.group());
        }

        System.out.println("Hashtags encontradas: " + String.join(", ",hashtags));
    }
}
