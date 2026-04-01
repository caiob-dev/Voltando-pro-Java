public class Carro {
    //Crie uma classe Carro com atributos modelo, ano, cor e
    // métodos para exibir a ficha técnica e calcular a idade do carro.

    String modelo;
    int anoCarro;

    void exibirFichaTecnica () {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + anoCarro);
    }

    void calcularAnoCarro (int anoAtual) {
        int calculo = anoAtual - anoCarro;
        System.out.println("A idade do carro é: " + calculo);
    }
}
