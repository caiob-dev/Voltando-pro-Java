public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double calculoArea = altura * largura;
        System.out.println("A área é: " + calculoArea);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double calculoPerimetro = 2 * (altura + largura);
        System.out.println("O perímetro é: " + calculoPerimetro);
    }
}
