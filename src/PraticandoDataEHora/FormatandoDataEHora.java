package PraticandoDataEHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDataEHora {
    public static void main(String[] args) {
        //Para resolver essa tarefa, você deve:
        //Capturar a data e a hora atuais.
        //Formatar a data no padrão dd-MM-yyyy (dia-mês-ano).
        //Formatar a hora no padrão HH:mm (hora e minutos).
        //Exibir o resultado da formatação.
        //Saída esperada:
        //Data formatada: 15-03-2025
        //Hora formatada: 14:30

        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data formatada: " + dataAtual.format(formatter));
        System.out.println("Hora formatada: " + horaAtual.format(horaFormatada));

    }
}
