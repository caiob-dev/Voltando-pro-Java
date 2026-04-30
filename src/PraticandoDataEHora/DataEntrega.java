package PraticandoDataEHora;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEntrega {
    public static void main(String[] args) {
        //Você precisa criar um programa que:
        //Receba uma data de início.
        //Adicione o prazo em dias ao início do projeto.
        //Exiba a data final formatada corretamente.
        //Saída esperada:
        //
        //Se a data de início for 15 de março de 2025 e o prazo for 15 dias, a saída deve ser:
        //Data de entrega: 30-03-2025

        LocalDate data = LocalDate.parse("2025-03-15");
        LocalDate prazoEntrega = data.plusDays(15);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data de entrega: " + prazoEntrega.format(formatter));

    }
}
