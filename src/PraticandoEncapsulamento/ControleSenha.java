package PraticandoEncapsulamento;

public class ControleSenha {
    //Crie uma classe que:
    //Armazene com segurança a senha do usuário
    //Permita alterar a senha apenas com a confirmação da senha atual
    //Forneça feedback sobre o resultado da operação

    //Exemplo de entrada:
    //Usuario user = new Usuario("123456");
    //user.setSenha("123456", "abc123");

    //Saída esperada:
    //Em caso de sucesso:
    //Senha alterada com sucesso!
    //Em caso de falha:
    //Senha atual incorreta. A senha não foi alterada.

   private String senha;

    public ControleSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha, String novaSenha) {
        if (this.senha.equals(senha)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha incorreta! A senha não foi alterada.");
        }
    }
}
