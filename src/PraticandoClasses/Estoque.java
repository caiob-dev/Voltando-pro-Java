package PraticandoClasses;

public class Estoque {
    //Crie um programa que
    //Defina uma classe com os atributos nome e quantidade.
    //Implemente um método que:
    //Subtraia a quantidade vendida do estoque se houver disponibilidade.
    //Exiba uma mensagem formatada com o saldo atual usando printf
    //Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.

    //Exemplo de entrada:
    //item.nome = "Camiseta";
    //item.quantidade = 10;
    //item.vender(3);
    //item.vender(8);

    //Saída esperada:
    //Venda realizada. Estoque restante de Camiseta: 7
    //Estoque insuficiente

    private String nome;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeParaVender) {
        if (quantidadeParaVender > quantidade) {
            System.out.println("Estoque insuficiente");
        } else {
            quantidade -= quantidadeParaVender;
            System.out.println("Venda realizada. Estoque restante de Camiseta: " + quantidade);
        }
    }
}
