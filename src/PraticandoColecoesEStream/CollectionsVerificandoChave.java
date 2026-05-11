package PraticandoColecoesEStream;

//Verificando se a chave existe
// Próxima Atividade
//
//Você é uma pessoa desenvolvedora que está criando um sistema de gerenciamento de clientes para uma empresa.
// A equipe de atendimento precisa acessar os dados dos clientes cadastrados no sistema através de um ID e conta com sua ajuda para implementar este sistema de busca.

//Sua tarefa é:
//Armazenar os clientes através de um Map<Integer, String>, onde a chave é o ID e o valor é o nome.
//Cadastrar cinco clientes no sistema.
//Verificar se um ID específico existe antes de tentar recuperar o nome do cliente.
//Se a chave existir, você pode acessar o nome associado; caso contrário, exiba uma mensagem informando que o cliente não foi encontrado.
//Exemplo de entrada:
//clientes.put(1, "Maria");
//clientes.put(2, "Marcos");
//clientes.put(3, "Ana");
//clientes.put(4, "Joana");
//clientes.put(5, "Karen");

import java.util.HashMap;
import java.util.Map;

//Saída esperada:
//Caso o cliente exista:
//O nome do cliente com ID 5 é: Karen
//Caso não exista:
// Cliente com ID 6 não encontrado.
public class CollectionsVerificandoChave {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        int idCliente = 6;

        if(clientes.containsKey(idCliente)) {
            String nomeCliente = clientes.get(idCliente);
            System.out.println("O nome do cliente com ID " + idCliente + " é: " + nomeCliente);
        } else {
            System.out.println("Cliente com ID " + idCliente + " não foi encontrado.");
        }
    }
}
