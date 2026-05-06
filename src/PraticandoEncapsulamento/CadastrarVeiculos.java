package PraticandoEncapsulamento;

public class CadastrarVeiculos {
    //Crie um programa que:
    //
    //Defina uma classe com os atributos modelo, placa e ano.
    //Defina uma instancia dessa classe através do método construtor.
    //Exiba as informações do veículo no console.
    //Exemplo de entrada:
    //Carro gol = new Carro("Gol", "ABC-1234", 2020);
    //Saída esperada:
    //Veículo cadastrado:
    //Modelo: Gol
    //Placa: ABC-1234
    //Ano: 2020

    private String modelo;
    private String placa;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public CadastrarVeiculos(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;


    }
}
