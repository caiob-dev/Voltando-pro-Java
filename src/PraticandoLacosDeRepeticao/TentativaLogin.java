package PraticandoLacosDeRepeticao;

import java.util.Scanner;

public class TentativaLogin {
    public static void main(String[] args) {
        //Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os usuários tenham um número limitado
        // de tentativas para inserir a senha corretamente.
        // Se o usuário errar a senha 3 vezes seguidas, sua conta deve ser bloqueada temporariamente.
        //
        //Com base nesse cenário, crie um programa que peça uma senha ao usuário e permita até 3 tentativas de erro antes de bloquear o acesso.
        // Se o usuário digitar corretamente antes disso, o sistema deve conceder o acesso imediatamente.
        //
        //Exemplo de entrada:
        //
        //Digite sua senha: 1234
        //Saída esperada:
        //Senha Correta! Acesso concedido!
        //ou
        //Exemplo de entrada:
        //Digite sua senha: 1111
        //Senha incorreta. Você tem 2 tentativas restantes.
        //Digite sua senha: 2222
        //Senha incorreta. Você tem 1 tentativa restante.
        //Digite sua senha: 3333

        //Saída esperada:
        //Conta bloqueada temporariamente.

        Scanner leitura = new Scanner(System.in);
        String SENHA_CORRETA = "1234";

        for (int tentativas = 3; tentativas > 0 ; tentativas --) {
            System.out.println("Digite sua senha: ");
            String senha = leitura.nextLine();

            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativas -1) + " tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
    }
}
