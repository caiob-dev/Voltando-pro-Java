public class Produto implements Vendavel{
    private String nome;
    private double preco;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
       preco-= preco * (percentualDesconto / 100.0);
    }

    //Desenvolva uma classe Produto com os atributos privados nome e preco.
    // Utilize métodos getters e setters para acessar e modificar esses atributos.
    // Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

//    private String produto;
//    private double preco;
//
//    public String getProduto() {
//        return produto;
//    }
//
//    public void setProduto(String produto) {
//        this.produto = produto;
//    }
//
//    public double getPreco() {
//        return preco;
//    }
//
//    public void setPreco(double preco) {
//        this.preco = preco;
//    }
//
//    double aplicarDesconto(double valorPercentual) {
//        double valorDesconto = (valorPercentual / 100) * preco;
//        double novoPreco =  preco - valorDesconto;
//        return novoPreco;
//    }
}
