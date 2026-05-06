package PraticaHeracaPolimorfismoInterfaces;

import PraticaHeracaPolimorfismoInterfaces.Biblioteca.Ebook;
import PraticaHeracaPolimorfismoInterfaces.Biblioteca.Livro;
import PraticaHeracaPolimorfismoInterfaces.Biblioteca.Revista;
import PraticaHeracaPolimorfismoInterfaces.Bolsista.Aluno;
import PraticaHeracaPolimorfismoInterfaces.Bolsista.Bolsista;
import PraticaHeracaPolimorfismoInterfaces.Interface.*;
import PraticaHeracaPolimorfismoInterfaces.Mensagem.Notificacao;
import PraticaHeracaPolimorfismoInterfaces.Notificacao.Email;
import PraticaHeracaPolimorfismoInterfaces.Notificacao.Push;
import PraticaHeracaPolimorfismoInterfaces.Notificacao.Sms;
import PraticaHeracaPolimorfismoInterfaces.Pagamento.BoletoBancario;
import PraticaHeracaPolimorfismoInterfaces.Pagamento.CartaoCredito;
import PraticaHeracaPolimorfismoInterfaces.Pagamento.Pagamento;
import PraticaHeracaPolimorfismoInterfaces.Pagamento.Pix;
import PraticaHeracaPolimorfismoInterfaces.Reservas.Reserva;
import PraticaHeracaPolimorfismoInterfaces.Reservas.ReservaVip;
import PraticaHeracaPolimorfismoInterfaces.SistemaEscolar.Alunos;
import PraticaHeracaPolimorfismoInterfaces.SistemaEscolar.Docente;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
//        Aluno aluno = new Aluno("Fernanda", "regular");
//        Bolsista aluno2 = new Bolsista("Lucas");
//
//        aluno.identificar();
//        aluno2.identificar();

        Alunos aluno1 = new Alunos("Julia", 16, 8.5);
        Alunos aluno2 = new Alunos("Caio", 17, 9.5);
        Docente docente1 = new Docente("Marta", 40, "História");
        Docente docente2 = new Docente("Roberto", 38, "História");

        aluno1.exibirDados();
        aluno2.exibirDados();
        docente1.exibirDados();
        docente2.exibirDados();

        Livro livro = new Livro("O Guia do Mochileiro das Galáxias", 1979, "Douglas Adams");
        Revista revista = new Revista("National Geographic", 2023, 245);
        Ebook ebook = new Ebook("Clean Code", 2008, "PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();

        Email email = new Email("cliente@exemplo.com", "Aproveite nossos descontos esta semana.", "Promoção especial!" );
        Sms sms = new Sms("(11) 98765-4321", "Sua fatura foi paga com sucesso.");
        Push push = new Push("usuario_app","Você tem uma nova mensagem não lida.", "Novidade!");

        email.enviar();
        sms.enviar();
        push.enviar();

        Pagamento cartao = new CartaoCredito(250.00);
        Pagamento boleto = new BoletoBancario(500.00);
        Pagamento pix = new Pix(300.00);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

        Notificacao notificacao = new Notificacao();
        notificacao.enviarMensagem("Olá");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção", 2);

        Reserva reserva = new Reserva();
        reserva.reservar();
        reserva.reservar(LocalDate.of(2026, 04,10));
        reserva.reservar(LocalDate.of(2026,04,12), 4);

        Reserva reservaVip = new ReservaVip();
        reservaVip.reservar();

        Relatorio rel = new Relatorio("Relatório 2025", "Tudo funcionando conforme esperado.");
        rel.imprimir();

        OperacaoBancaria deposito = new Deposito(200.0);
        OperacaoBancaria saque = new Saque(50.5);
        deposito.executar();
        saque.executar();

        Luz luz = new Luz();

        ArCondicionado arCondicionado = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        arCondicionado.ligar();
        arCondicionado.desligar();

    }
}
