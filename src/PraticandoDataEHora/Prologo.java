package PraticandoDataEHora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Prologo {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPrimeiraParcela = LocalDate.of(2026,05 ,10);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataPrimeiraParcela.isEqual(LocalDate.now())) {
            System.out.println("Data de vencimento é hoje");
        } else {
            System.out.println("Hoje não é o dia do vencimento");
        }

        if (dataCompra.isBefore(dataPrimeiraParcela)) {
            System.out.println("O dia de pagar a primeira parcela está chegando!");
        } else {
            System.out.println("Já passou do dia de pagar!");
        }

        System.out.println("Data de compra: " + dataCompra.format(formatter));
        System.out.println("Primeira parcela: " + dataPrimeiraParcela.format(formatter));
        System.out.println("Segunda parcela: " + dataSegundaParcela.format(formatter));

        ZonedDateTime compraBR = ZonedDateTime.now();
        System.out.println("Conclusão de compra no BR: " + compraBR);

        ZonedDateTime compraNYC = compraBR.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Conclusão de compra em New York: " + compraNYC);

        LocalTime inicio = LocalTime.of(9, 0) ;
        LocalTime fim = LocalTime.of(17,30);

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração do expediente é: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");

        LocalDate pagamento = LocalDate.parse("2026-05-08");
        Period periodo = Period.between(LocalDate.now(), pagamento);
        System.out.println("Faltam " + periodo.getDays() + " dias para o pagamento! ");

        LocalDate pagamentoFuturo = LocalDate.parse("2026-10-08");
        Period period = Period.between(LocalDate.now(), pagamentoFuturo);
        System.out.println("Faltam " + period.getMonths() + " meses e " + period.getDays() + " dias para o pagamento ! ");
    }
}
