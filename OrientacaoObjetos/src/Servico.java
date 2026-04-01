public class Servico implements Vendavel{
    private String nome;
    private double preco;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        preco -= preco * (percentualDesconto / 100.0);
    }
}
