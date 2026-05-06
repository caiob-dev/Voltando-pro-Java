package PraticandoEncapsulamento;

public class ControleSaldoBancario {
    //Crie uma classe que:
    //Permita criar contas com titular e saldo inicial.
    //Realize depósitos com valores positivos.
    //Autorize saques apenas quando houver saldo suficiente.
    //Exiba o saldo atualizado após cada operação.
    //Exemplo de entrada:
    //
    //Conta conta = new Conta("Ana");
    //conta.depositar(1000.00);
    //conta.sacar(1200.00);
    //conta.exibirSaldo();

    //Saída esperada:
    //Saldo insuficiente para saque.
    //Saldo atual de Ana: 1000,00
    //Ou, caso Ana deposite 1000,00 e saque 200,00 a mensagem será:
    //Saldo atual de Ana: 800,00

        private String titular;
        private double saldo;

    public ControleSaldoBancario(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar (double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito no valor de: " + this.saldo + " realizado");
        } else {
            System.out.println("Insira um valor maior que 0 para depositar!");
        }
    }

    public void sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            this.saldo -= valor;
            System.out.println("Saque no valor de: " + valor + " realizado");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de: %s: %.2f\n", this.titular, this.saldo);
    }
}
