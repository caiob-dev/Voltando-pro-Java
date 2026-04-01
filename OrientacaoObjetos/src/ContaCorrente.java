public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
       saldo -= tarifaMensal;
        System.out.println("Tarifa mensal: " + tarifaMensal + " cobrada," +" Saldo atual: " + saldo);
    }
}
