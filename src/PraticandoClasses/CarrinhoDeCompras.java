package PraticandoClasses;

public class CarrinhoDeCompras {
    //Crie um programa que:
    //Defina uma classe com os atributos nome, preço e quantidade.
    //Implemente um método que retorne o valor total do item (preço x quantidade).
    //Crie uma lista de item e calcule o valor total da compra.
    //Exemplo de entrada:
    //i1.nome = "Teclado";
    //i1.preco = 120.0;
    //i1.quantidade = 1;
    //i2.nome = "Mouse";
    //i2.preco = 60.0;
    //i2.quantidade = 2;

    //Saída esperada:
    //Total da compra: R$ 240.00

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

    public double totalCompra() {
        return getPreco() * getQuantidade();
    }
}
