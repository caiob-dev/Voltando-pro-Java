public class ConverterTemperatura {
    public static void main() {
        int temperatura = 20;
        double conversaoFahrenheit = (temperatura * 1.8) + 32;
        System.out.println("20 graus celsius em fahrenheit é: " + conversaoFahrenheit);

        int semNumerosDecimais = (int) conversaoFahrenheit;
        System.out.println(semNumerosDecimais);
    }
}
