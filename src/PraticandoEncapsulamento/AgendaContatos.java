package PraticandoEncapsulamento;

import java.util.ArrayList;

public class AgendaContatos {
    //Crie uma classe que:
    //Armazene contatos com nome e telefone em uma lista
    //Permita visualizar todos os contatos cadastrados
    //Formate a exibição para melhor legibilidade

    //Exemplo de entrada:
    //contatos.add(new Contato("João Silva", "(11) 99999-0000"));
    //contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
    //contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

    //Saída esperada:
    //1. João Silva - (11) 99999-0000
    //2. Luana Santos - (21) 98888-0000
    //3. Pedro Oliveira - (31) 97777-0000


   private String nome;
   private String telefone;

    public AgendaContatos(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
