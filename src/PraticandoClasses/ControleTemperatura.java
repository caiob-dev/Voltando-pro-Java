package PraticandoClasses;

public class ControleTemperatura {
    //Crie uma classe que:
    //
    //Possua os atributos local, indicando o setor monitorado, e temperatura atual,
    // armazenando a última medição.
    //Implemente um método que mostre:
    //O local do sensor.
    //A temperatura formatada com uma casa decimal.
    //Um alerta se a temperatura ultrapassar 37.5ºC.
    //Exemplo de entrada:
    //local = "Setor A"
    //temperaturaAtual = 39.2

    //Saída esperada:
    //Sensor no local: Setor A
    //Temperatura: 39,2 ºC
    //Alerta: Temperatura acima do limite!

    private String local;
    private double temperaturaAtual;

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void alertaTemperatura () {
        System.out.println("\nSensor no Local: " + getLocal());
        System.out.printf("Temperatura: %.1f ºC\n", getTemperaturaAtual());

        if (getTemperaturaAtual() > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
