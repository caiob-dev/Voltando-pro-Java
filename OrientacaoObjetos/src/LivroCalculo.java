public class LivroCalculo extends Produtos implements Calculavel {

    private double autor;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
