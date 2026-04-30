package PraticaRepeticaoCondicionaisDataHoraExceptions.MetodosValidacoes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LerHora {
    public static LocalTime lerHora (Scanner leitura, DateTimeFormatter formatter) {
        while(true) {
            try {
                System.out.println("Digite a hora da festa (HH:mm)");
                return LocalTime.parse(leitura.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato da hora inválido! Digite no formato certo (HH:mm)");
            }
        }
    }
}
