package PraticandoCondicionais;
//Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança dos acessos ao sistema interno.
// Os funcionários utilizam uma senha fixa para acessar suas contas, e o sistema deve verificar se a senha inserida está correta.
//Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456, verifique se o que o usuário digitou está correto ou não.
// O programa deve comparar a tentativa com a senha correta e exibir se o acesso foi permitido ou negado.

//Saída esperada:
//Digite a senha: 123456
//Acesso permitido!

//Ou
//Digite a senha: 123
//Acesso negado!

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        String senha = "123456";
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String tentativaSenha = leitura.nextLine();

        leitura.close();

        if (tentativaSenha.equals(senha)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado! Senha inválida.");
        }
    }
}
