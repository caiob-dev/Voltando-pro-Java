package PraticaHeracaPolimorfismoInterfaces.Interface;

public abstract class OperacaoBancaria implements AcaoBancaria {
    //Crie um programa que:
    //Tenha uma interface AcaoBancaria com o método executar(), que representa o contrato que
    // toda operação bancária deve seguir.
    //Tenha uma classe abstrata OperacaoBancaria, que implementa essa interface e contém:
    //O atributo valor
    //Um construtor para inicializar esse valor

    //Tenha duas subclasses** que estendem OperacaoBancaria:
    //Deposito: deve imprimir "Depósito de R$[valor] realizado"
    //Saque: deve imprimir "Saque de R$[valor] realizado"

    //Exemplo de entrada:
    //OperacaoBancaria deposito = new Deposito(200.0);
    //OperacaoBancaria saque = new Saque(50.5);
    //deposito.executar();
    //saque.executar();

    //Saída esperada:
    //Depósito de R$200,00 realizado
    //Saque de R$50,50 realizado

    private double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void executar() {}
}
