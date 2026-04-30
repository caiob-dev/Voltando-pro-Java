package PraticaRepeticaoCondicionaisDataHoraExceptions.MetodosValidacoes;

import java.util.Scanner;

public class LerQtdHorasFesta {
    public static int lerQtdHorasFesta (Scanner leitura, String mensagem) {
        while(true) {
            try {
                System.out.println(mensagem);

                int valor = Integer.parseInt(leitura.nextLine());

                if(valor <= 0) {
                    System.out.println("A quantidade de horas da festa deve ser maior que 0");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e ) {
                System.out.println("Digite a quantidade de horas da festa correto!");
            }
        }
    }
}
