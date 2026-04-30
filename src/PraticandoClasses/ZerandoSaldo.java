package PraticandoClasses;

public class ZerandoSaldo {
    //Crie um programa que:
    //
    //Defina uma classe com o atributo saldo.
    //Implemente um método que redefine o valor do saldo para 0.0.
    //Implemente um método que mostra o saldo atual formatado.
    //Exemplo de entrada:
    //
    //conta.saldo = 1579.42;
    //
    //conta.exibirSaldo();
    //conta.zerarSaldo();
    //conta.exibirSaldo();

    //Saída esperada:
    //Saldo atual: R$ 1579.42
    //Saldo atual: R$ 0.00

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.printf("\nSaldo atual: R$ %.2f", getSaldo());
    }

    public void zerarSaldo() {
        this.saldo = 0.00;
    }
}
