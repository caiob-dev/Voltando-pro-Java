public class ContaBancaria {
    //Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado),
    // saldo (privado) e titular (publico).
    // Implemente métodos getters e setters para os atributos privados.

//    private int numeroConta;
//    private double saldo;
//    public String titular;
//
//    public int getNumeroConta() {
//        return numeroConta;
//    }
//
//    public void setNumeroConta(int numeroConta) {
//        this.numeroConta = numeroConta;
//    }
//
//    public double getSaldo() {
//        return saldo;
//    }
//
//    public void setSald

    //Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
    // Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse,
    //  como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

    private String titular;
    protected double saldo;

    public void depositar(double valor) {
         this.saldo += valor;
        System.out.println("Depósito no valor de " + valor + " realizado. " + "Saldo atual: " + saldo);
    }

    public void sacar (double valor) {
        if(valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque no valor de " + valor + " realizado. " + " Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a transação");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + saldo);
    }


}
