package PraticandoClasses;

public class Produto {
    //Sua tarefa é criar uma classe que:
    //Represente um produto com os atributos nome, preço e quantidade.
    //Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void descricaoProduto () {
        System.out.printf("Produto: %s, \n Preço: %.2f, \n Quantidade: %d", getNome(), getPreco(), getQuantidade());
    }
}
