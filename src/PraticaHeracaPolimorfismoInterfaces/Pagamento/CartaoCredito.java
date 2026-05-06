package PraticaHeracaPolimorfismoInterfaces.Pagamento;

public class CartaoCredito extends Pagamento {

    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        double taxa = 3;
        double calcularTaxa = getValor() * (taxa / 100);
        System.out.println("Pagamento de R$" + String.format("%.2f", getValor()) + " confirmado no Cartão de Crédito (Taxa: R$" + String.format("%.2f", calcularTaxa ) +")");
    }
}
