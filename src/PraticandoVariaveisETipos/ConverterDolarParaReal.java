package PraticandoVariaveisETipos;

public class ConverterDolarParaReal {
    //Você está organizando uma viagem internacional e precisa converter uma quantia em reais (R$) para dólares americanos (US$)
    // com base na taxa de câmbio atual. A taxa utilizada no momento é de R$ 5,25 para cada US$ 1.
    //Crie um programa que realize a conversão para dólares usando a taxa de câmbio e exiba o valor convertido.
    public static void main(String[] args) {
        double valorReais = 451.50;

        double cotacaoDolarHoje = 5.25;

        double conversao = valorReais / cotacaoDolarHoje;

        System.out.println("O valor em dólares é: US$ " + conversao);
    }
}
