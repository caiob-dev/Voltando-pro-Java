package PraticaHeracaPolimorfismoInterfaces.Interface;

public class Deposito extends OperacaoBancaria{

    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Deposito de R$" + String.format("%.2f",getValor()) + " realizado");
    }
}
