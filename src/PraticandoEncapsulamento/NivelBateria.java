package PraticandoEncapsulamento;

public class NivelBateria {
    //Crie um programa que:
    //
    //Defina uma classe que armazene o nível da bateria.
    //Permita definir o nível apenas se estiver entre 0 e 100.
    //Forneça uma forma de exibir o status da bateria com base no nível atual:
    //Até 20%: “Bateria fraca”
    //Entre 21% e 79% : “Bateria ok”
    //Igual ou acima de 80%: “Bateria cheia”
    //Instancie essa classe, defina um nível e exiba o status.
    //Exemplo de entrada:
    //
    //Bateria b = new Bateria();
    //b.setNivel(85);
    //Saída esperada:
    //
    //Status: Bateria cheia

    int bateria;

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void exibirBateria(){
        if (getBateria() <= 20 ) {
            System.out.println("Bateria fraca");
        } else if (getBateria() > 20 && getBateria() <= 79) {
            System.out.println("Bateria ok");
        } else {
            System.out.println("Bateria cheia");
        }
    }
}
