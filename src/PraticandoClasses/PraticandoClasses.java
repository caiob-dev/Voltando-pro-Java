package PraticandoClasses;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.List;

public class PraticandoClasses {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setNome("Mouse");
        produto1.setPreco(159.90);
        produto1.setQuantidade(25);

        produto1.descricaoProduto();

        ResumoLivro livro1 = new ResumoLivro();
        livro1.setTitulo("O Guia do Mochileiro das Galáxias");
        livro1.setAutor("Douglas Adams");
        livro1.setPaginas(208);

        livro1.descricaoLivro();

        ZerandoSaldo saldo1 = new ZerandoSaldo();
        saldo1.setSaldo(1579.42);

        saldo1.exibirSaldo();
        saldo1.zerarSaldo();
        saldo1.exibirSaldo();

        ControleTemperatura temperatura1 = new ControleTemperatura();
        temperatura1.setLocal("Setor A");
        temperatura1.setTemperaturaAtual(39.2);

        temperatura1.alertaTemperatura();

        CalcularMedia media = new CalcularMedia();
        media.setNome("João Silva");
        media.setNota1(6.5);
        media.setNota2(7.5);

        media.calcularNotasComMedia();

        CorrigindoCadastro cadastro1 = new CorrigindoCadastro();
        cadastro1.setNome("Júlia Oliveira");
        cadastro1.setCargo("Pessoa Desenvolvedora Júnior");
        cadastro1.setNivelDeAcesso(1);

        cadastro1.alterarCargo("Pessoa Desenvolvedora Plena", 2);

        Tarefas tarefa1 = new Tarefas();
        tarefa1.setDescricao("Estudar Java");
        tarefa1.setConcluida(true);

        Tarefas tarefa2 = new Tarefas();
        tarefa2.setDescricao("Fazer exercícios");
        tarefa2.setConcluida(true);

        List<Tarefas> listaTarefas = new ArrayList<Tarefas>();
        listaTarefas.add(tarefa1);
        listaTarefas.add(tarefa2);

        for(Tarefas t : listaTarefas) {
            t.descricaoTarefaComStatus();
        }

        Estoque item =  new Estoque();
        item.setNome("Camiseta");
        item.setQuantidade(10);

        item.vender(3);
        item.vender(8);

        MultaPorAtraso item1 = new MultaPorAtraso();
        item1.setTitulo("Livro: Dom Casmurro");
        item1.setDiasDeAtraso(3);

        item1.cobrarMultaPorAtraso();

        CarrinhoDeCompras i1 = new CarrinhoDeCompras();

        i1.setNome("Teclado");
        i1.setPreco(120.0);
        i1.setQuantidade(1);

        CarrinhoDeCompras i2 = new CarrinhoDeCompras();
        i2.setNome("Mouse");
        i2.setPreco(60.0);
        i2.setQuantidade(2);

        List<CarrinhoDeCompras> carrinho =  new ArrayList<CarrinhoDeCompras>();
        carrinho.add(i1);
        carrinho.add(i2);

        double totalCompras = 0;

        for(CarrinhoDeCompras c : carrinho) {
            totalCompras+= c.totalCompra();
        }

        System.out.println("Total da compra: " + totalCompras);
    }
}
