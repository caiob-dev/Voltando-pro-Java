package PraticaHeracaPolimorfismoInterfaces.Reservas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    //Tenha uma classe Reserva com três versões sobrecarregadas do método reservar():
    //Uma sem parâmetros, que imprime: "Reserva realizada"
    //Uma com data como parâmetro, que imprime: "Reserva feita para o dia [data]"
    //Uma com data e quantidade de pessoas, que imprime: "Reserva feita para o dia [data] para [X] pessoas"
    //Tenha uma subclasse ReservaVip, que herda de Reserva e sobrescreve o método reservar() sem parâmetros,
    // imprimindo uma mensagem exclusiva: "Reserva VIP confirmada com atendimento exclusivo"
    //Exemplo de entrada:
    //Reserva r = new Reserva();
    //r.reservar();
    //r.reservar("10/04");
    //r.reservar("12/04", 4);
    //Reserva vip = new ReservaVip();
    //vip.reservar();

    //Saída esperada:
    //Reserva realizada
    //Reserva feita para o dia 10/04
    //Reserva feita para o dia 12/04 para 4 pessoas
    //Reserva VIP confirmada com atendimento exclusivo

    public void reservar() {
        System.out.println("Reserva realizada com sucesso!");
    }

    public void reservar(LocalDate data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM");
        System.out.println("Reserva feita para o dia " + data.format(dtf));
    }

    public void reservar(LocalDate data, int qtdPessoas) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM");
        System.out.println("Reserva feita para o dia " + data.format(dtf) + " para " + qtdPessoas + " pessoas");
    }
}
