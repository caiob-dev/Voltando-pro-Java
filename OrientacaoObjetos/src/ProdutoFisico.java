public class ProdutoFisico extends Produtos implements Calculavel{
    @Override
    public double calcularPrecoFinal() {
        return preco * 1.5;
    }
}
