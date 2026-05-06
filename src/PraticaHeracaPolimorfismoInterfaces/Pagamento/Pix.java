package PraticaHeracaPolimorfismoInterfaces.Pagamento;

public class Pix extends Pagamento{

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Pagamento via Pix de R$" + String.format("%.2f",getValor()) + " confirmado");
    }
}
