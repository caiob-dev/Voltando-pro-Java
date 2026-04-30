package PraticandoCondicionais;

import java.util.Scanner;

public class DiaUtil {
    //Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não.
    //
    //Exemplo de Entrada:
    //
    //Digite o dia da semana (em letras minúsculas): quarta
    //Copiar código
    //Saída esperada:
    //
    //Quarta é um dia útil.

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        String diaUtil = leitura.nextLine();
        leitura.close();

        if (diaUtil.equals("segunda") || diaUtil.equals("terça") || diaUtil.equals("quarta") || diaUtil.equals("quinta") || diaUtil.equals("sexta")) {
            System.out.println(diaUtil + " é um dia útil");
        } else {
            System.out.println(diaUtil + " não é um dia útil");
        }

    }
}
