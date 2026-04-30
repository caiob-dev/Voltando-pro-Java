package PraticandoDataEHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataVencimento {
    public static void main(String[] args) {
        //Crie um programa que:
        //Receba uma data de vencimento original.
        //Adicione um número de meses ao vencimento.
        //A data ajustada deve ser exibida no formato dd-MM-yyyy.

        //Saída esperada:
        //Se a data de vencimento original for 20 de março de 2025 e o adiamento for de 1 mês, a saída deve ser:
        //Nova data de vencimento: 20-04-2025

        LocalDate dataVencimento = LocalDate.parse("2025-03-20");
        LocalDate novoDataVencimento = dataVencimento.plusMonths(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data de vencimento anterior: " + dataVencimento.format(formatter));
        System.out.println("Nova data de vencimento: " + formatter.format(novoDataVencimento));
    }
}
