package PraticandoDataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEvento {
    public static void main(String[] args) {
        //Crie um programa que:
        //Receba uma data de evento previamente cadastrada.
        //Compare essa data com a data atual.
        //Exiba a data do evento e a data atual no formato dd-MM-yyyy.
        //Informe se o evento já ocorreu ou ainda está por vir.
        //Saída esperada:
        //
        //Se a data do evento for 10 de março de 2025 e a data atual for 15 de março de 2025, a saída deve ser:
        //Data do evento: 10-03-2025
        //Data atual: 15-03-2025
        //O evento já ocorreu.

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dataEvento = LocalDate.of(2025,03,10);
        LocalDate dataAtual = LocalDate.of(2025,03,15);

        String dataAtualFormatada = dataAtual.format(formatter);
        String dataEventoFormatada = dataEvento.format(formatter);

        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatada);

        if (dataAtual.isAfter(dataEvento)) {
            System.out.println("O evento já ocorreu!");
        } else {
            System.out.println("O evento acontecerá em breve!");
        }

    }
}
