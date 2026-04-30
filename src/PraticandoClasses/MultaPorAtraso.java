package PraticandoClasses;

public class MultaPorAtraso {
    //Crie um programa que:
    //Defina uma classe com os atributos título e dias de atraso.
    //Implemente um método que:
    //Cobre R$ 2,50 por dia de atraso.
    //Retorne o valor total da multa.
    //Implemente um método que mostre o título e o valor da multa formatado.
    //Exemplo de entrada:
    //pedido.titulo = "Dom Casmurro";
    //pedido.diasAtraso = 3;
    //
    //pedido.exibirDetalhes();

    //Saída esperada:
    //Livro: Dom Casmurro | Multa por 3 dias de atraso: R$ 7,50

    private String titulo;
    private int diasDeAtraso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDiasDeAtraso() {
        return diasDeAtraso;
    }

    public void setDiasDeAtraso(int diasDeAtraso) {
        this.diasDeAtraso = diasDeAtraso;
    }

    public void cobrarMultaPorAtraso(){
        double multaPorAtraso = 2.50;

        double calculoMultaPorAtraso = multaPorAtraso * getDiasDeAtraso();

        System.out.println(getTitulo() + " | Multa por " + getDiasDeAtraso() + " dias de atraso: R$" + String.format("%.2f", calculoMultaPorAtraso));
    }
}
