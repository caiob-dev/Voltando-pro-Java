package br.com.Atletas.Modelos;

public class Pro extends Atletas{
    private String treinador;

    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }

    @Override
    public int getClassificacao() {
        if(getTotalVezesNaSemana() >= 7) {
            return 10;
        } else {
            return 7;
        }
    }
}
