package PraticaRepeticaoCondicionaisDataHoraExceptions.MetodosValidacoes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LerData {
    public static LocalDate lerData(Scanner leitura, DateTimeFormatter formatter) {
        while (true) {
            try {
                System.out.println("Digite a data da festa: (dd/MM/yyyy)");
                return LocalDate.parse(leitura.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida! Digite no formato certo (dd/MM/yyyy)");;
            }
        }
    }
}
