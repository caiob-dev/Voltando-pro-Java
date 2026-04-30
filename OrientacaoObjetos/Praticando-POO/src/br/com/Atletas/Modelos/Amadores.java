package br.com.Atletas.Modelos;

public class Amadores extends Atletas {

    @Override
    public int getClassificacao() {
        if (getTotalVezesNaSemana() >=5) {
            return 9;
        } else {
            return 6;
        }
    }
}


