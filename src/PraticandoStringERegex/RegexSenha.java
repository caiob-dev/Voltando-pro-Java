package PraticandoStringERegex;

import java.util.Scanner;

public class RegexSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha: (Deve conter uma letra Maiuscula, um número, e um caractere especial) ");
        String senha =  input.nextLine();

        String regex= "^(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[!@#$%&*])[A-Za-z\\d!@#$%&*]{8,}$";

        if(senha.matches(regex)){
            System.out.println("Senha é valida!");
        } else {
            System.out.println("Senha não é válida.");
        }
    }
}
