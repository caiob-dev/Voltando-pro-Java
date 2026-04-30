package PraticandoDataEHora;

import java.time.Duration;
import java.time.LocalTime;

public class DiferencaHora {
    public static void main(String[] args) {
        //Para isso, crie um programa que:
        //Receba dois horários representando o início e o término de uma atividade.
        //Calcule a diferença em horas e minutos entre esses dois horários.
        //Exiba o resultado formatado.
        //Saída esperada:
        //
        //Se o primeiro horário for 14:30:00 e o segundo horário for 16:45:00, a saída deve ser:
        //Diferença de tempo: 2 horas e 15 minutos

        LocalTime inicio = LocalTime.of(14,30);
        LocalTime termino = LocalTime.of(16,45);
        Duration duracao = Duration.between(inicio, termino);

        System.out.println("Diferença de tempo: " + duracao.toHours() + " horas " + duracao.toMinutesPart() + " minutos");
    }
}
