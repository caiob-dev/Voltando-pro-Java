public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.17;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("Valor do dolar para real: " + String.format("%.2f", valorReal));
    }
}
