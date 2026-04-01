public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(int temperatura) {
        double calculo = (temperatura * 1.8) + 32;
        System.out.println("Celsius para fahrenheit: " + (int) calculo);
    }

    @Override
    public void fahrenheitParaCelsius(int temperatura) {
        double calculo = (temperatura -32 ) / 1.8;
        System.out.println("Celsius para fahrenheit: " + (int) calculo);
    }
}
