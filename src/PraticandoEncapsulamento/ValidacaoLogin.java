package PraticandoEncapsulamento;

public class ValidacaoLogin {
    //Crie uma classe que:
    //Armazene o login e a senha de forma encapsulada.
    //Um método validarSenha() que receba as credenciais digitadas e retorne se o login foi bem-sucedido.
    //Uma lógica no arquivo principal que utilize a classe Scanner para ler o login e senha digitados,
    // controlando as tentativas com um loop.
    //Bloqueie o acesso após 3 falhas consecutivas.
    //Exiba mensagens informando o resultado da tentativa e quantas restam.

    //Exemplo de entrada:
    //Login: aluno2025
    //Senha correta: escola@123
    //Tentativas: "senhaerrada", "123456", "escola@123"

    //Saída esperada:
    //Senha incorreta. Tentativas restantes: 2
    //Senha incorreta. Tentativas restantes: 1
    //Login bem-sucedido!

    private String login;
    private String senha;

    public ValidacaoLogin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }
}
