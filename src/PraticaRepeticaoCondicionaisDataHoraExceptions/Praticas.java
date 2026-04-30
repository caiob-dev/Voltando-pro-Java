package PraticaRepeticaoCondicionaisDataHoraExceptions;

import PraticaRepeticaoCondicionaisDataHoraExceptions.MetodosValidacoes.LerData;
import PraticaRepeticaoCondicionaisDataHoraExceptions.MetodosValidacoes.LerHora;
import PraticaRepeticaoCondicionaisDataHoraExceptions.MetodosValidacoes.LerQtdHorasFesta;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Praticas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String horasAPagar = "";
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");

        ArrayList<String> convidados = new ArrayList<>();

        LocalDate dataFesta = LerData.lerData(leitura, dataFormatada);

        LocalTime horaComecoFesta = LerHora.lerHora(leitura, horaFormatada);

        int horasDeFesta = LerQtdHorasFesta.lerQtdHorasFesta(leitura,"Digite quantas horas serão de festa:");

        System.out.println("Digite que horas a festa realmente acabou: (HH:mm)");
        LocalTime horaAcabada = LocalTime.parse(leitura.nextLine(), horaFormatada);

        LocalTime horaAcabarPrevisto = horaComecoFesta.plusHours(horasDeFesta);

        LocalDateTime inicio = LocalDateTime.of(dataFesta, horaComecoFesta);
        LocalDateTime fimReal = LocalDateTime.of(dataFesta, horaAcabada);

        if (horaAcabada.isBefore(horaComecoFesta)) {
            fimReal = fimReal.plusDays(1);
        }

        LocalDateTime fimPrevisto = inicio.plusHours(horasDeFesta);

        Duration duracao = Duration.between(fimPrevisto, fimReal);

        long horasRestantes = duracao.toHours();
        long minutosRestantes = duracao.toMinutesPart();

        if (horasRestantes <= 0 && minutosRestantes <= 0) {
            horasAPagar = "0h 0min";
        } else {
            String sinal;

            if (horasRestantes > 0 || minutosRestantes > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            horasAPagar = "Horas devendo a pagar: " + sinal + Math.abs(horasRestantes) + "h" + Math.abs(minutosRestantes) + "min";
        }

        while (true) {
            System.out.println("Digite o nome dos convidados presentes (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String nomes = leitura.nextLine();

            if (nomes.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado");
                break;
            }

            if (nomes.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            boolean jaTem = false;

            for (String convidado : convidados) {
                if (convidado.toLowerCase().equals(nomes.toLowerCase())) {
                    jaTem = true;
                    break;
                }
            }

            if (jaTem) {
                System.out.println(nomes + " ja foi convidado ");
            } else {
                convidados.add(nomes);
                System.out.println(nomes + " foi adicionado a lista de convidados.");
            }
        }
        System.out.println("Convidados: ");
        convidados.forEach(nome -> System.out.println(nome));
        System.out.println("Dia da festa: " + dataFesta.format(dataFormatada));
        System.out.println("Hora que a festa começa: " + horaComecoFesta.format(horaFormatada));
        System.out.println("Horas de festa: " + horasDeFesta);
        System.out.println("Horário previsto para acabar: " + horaAcabarPrevisto);
        System.out.println("Horário que acabou de verdade: " + horaAcabada);
        System.out.println(horasAPagar);


    }
}

