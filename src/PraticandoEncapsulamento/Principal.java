package PraticandoEncapsulamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CadastrarVeiculos carro1 = new CadastrarVeiculos("Gol", "ABC-1234", 2020);

        System.out.println("Veículo cadastrado: \n" + "Modelo: " + carro1.getModelo() + "\n" + "Placa: " + carro1.getPlaca() + "\n" + "Ano: " + carro1.getAno());

        ArrayList<AgendaContatos> contatos = new ArrayList<>();

        contatos.add(new AgendaContatos("João Silva", "(11) 99999-0000"));
        contatos.add(new AgendaContatos("Luana Santos", "(21) 98888-0000"));
        contatos.add(new AgendaContatos("Pedro Oliveira", "(31) 97777-0000"));

        int indice = 1;
        System.out.println("Lista contatos");

        for(AgendaContatos contato: contatos) {
            System.out.printf("%d. %s - %s\n", indice++, contato.getNome(), contato.getTelefone());
        }

        CadastroProdutosValidacao produto1 = new CadastroProdutosValidacao();
        produto1.setNome("Mouse");
        produto1.setPreco(-59.90);
        produto1.validarPreco();

        CadastroProdutosValidacao produto2 = new CadastroProdutosValidacao();
        produto2.setNome("Mouse");
        produto2.setPreco(59.90);
        produto2.validarPreco();

        ControleSenha user = new ControleSenha("123456");
        user.setSenha("123456", "12345");

        NivelBateria bateria = new NivelBateria();
        bateria.setBateria(80);
        bateria.exibirBateria();

        ControleSaldoBancario bancario = new ControleSaldoBancario("Ana");
        bancario.depositar(1000);
        bancario.sacar(1000);
        bancario.exibirSaldo();

        ArrayList<AvaliacaoFilmes> filmes = new ArrayList<>();

        AvaliacaoFilmes matrix = new AvaliacaoFilmes("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        System.out.printf("Média de avaliações para %s: %.2f\n", matrix.getTitulo(), matrix.calcularMedia());

        ValidacaoLogin aluno = new ValidacaoLogin("aluno2025","escola@123");

//        Scanner leitura =  new Scanner(System.in);
//        int tentativas = 3;
//
//        while (tentativas > 0) {
//            System.out.println("Login: ");
//            String login = leitura.next();
//            System.out.println("Senha: ");
//            String senha = leitura.next();
//
//           if (aluno.validarLogin(login, senha)) {
//               System.out.println("Login bem-sucedido");
//               break;
//           } else {
//               tentativas--;
//               System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
//           }
//
//           if (tentativas == 0) {
//               System.out.println("Conta bloqueada!");
//           }
//        }

        PontosAlunos alunos = new PontosAlunos("Fernanda");
        alunos.ganharPontos(200);
        alunos.exibirStatus();

        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);

        System.out.println("Total de notas válidas: " + matematica.listarNotas());
        System.out.printf("Média em  %s"+ ": %.2f\n", matematica.getDisciplina(), matematica.calcularMedia());
    }
}
