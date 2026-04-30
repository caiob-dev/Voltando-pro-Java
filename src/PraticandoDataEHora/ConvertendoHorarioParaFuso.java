package PraticandoDataEHora;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertendoHorarioParaFuso {
    public static void main(String[] args) {
        //Você trabalha em uma empresa global e precisa agendar reuniões com colegas da Austrália. Como os horários variam de acordo com o fuso horário,
        // você precisa de um sistema que converta automaticamente o horário local para o horário de Sydney.
        //
        //Crie um programa que converta o horário atual do sistema (fuso horário padrão) para o fuso horário de Sydney (Australia/Sydney) e
        // exiba apenas as horas e os minutos. Dica: Utilize o método withZoneSameInstant() para realizar a conversão.
        //
        //Saída esperada:
        //Horário atual no sistema: 12:00
        //Horário atual em Sydney: 22:00

        ZonedDateTime fusoBR = ZonedDateTime.now();
        ZonedDateTime fusoAU = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: " + formatter.format(fusoBR));
        System.out.println("Horário atual em Sydney: " + formatter.format(fusoAU) );

    }
}
