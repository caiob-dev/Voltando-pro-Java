package PraticandoClasses;

public class CorrigindoCadastro {
    //Crie uma classe que:
    //Represente um colaborador com os atributos nome, cargo e nivel de acesso.
    //Implemente um método que permita alterar o cargo e o nível de acesso.
    //Exiba no console as informações antes e depois da atualização.
    //Exemplo de entrada:
    //
    //Nome: Júlia Oliveira
    //Cargo atual: Pessoa Desenvolvedora Júnior
    //Novo cargo: Pessoa Desenvolvedora Plena
    //Nível de acesso atual: 1
    //Novo nível de acesso: 2

    //Saída esperada:
    //--- Antes da atualização ---
    //Nome: Júlia Oliveira
    //Cargo: Pessoa Desenvolvedora Júnior
    //Nível de acesso: 1
    //
    //--- Após atualização ---
    //Nome: Júlia Oliveira
    //Cargo: Pessoa Desenvolvedora Plena
    //Nível de acesso: 2

    private String nome;
    private String cargo;
    private int nivelDeAcesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(int nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public void alterarCargo(String novoCargo, int novonivelDeAcesso) {

        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Nível de acesso: " + getNivelDeAcesso());

        System.out.println("--- Após atualização ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + novoCargo);
        System.out.println("Nivel de Acesso: " + novonivelDeAcesso);
    }
}
