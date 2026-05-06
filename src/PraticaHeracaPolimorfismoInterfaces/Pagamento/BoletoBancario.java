package PraticaHeracaPolimorfismoInterfaces.Pagamento;

public class BoletoBancario extends Pagamento {

    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        double taxa = 1;
        double calcularTaxa = getValor() * (taxa / 100);
        System.out.println("Boleto de R$" + String.format("%.2f", getValor()) + " gerado com sucesso (Taxa: R$" + String.format("%.2f", calcularTaxa ) +")");
    }
}
