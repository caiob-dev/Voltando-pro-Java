package br.com.Atletas.Modelos;

public class Pro extends Atletas implements Patrocinavel {
    private String treinador;
    private boolean patrocinio;

    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }

    public void setPatrocinio(boolean patrocinio) {
        this.patrocinio = patrocinio;
    }

    @Override
    public int getClassificacao() {
        if (getTotalVezesNaSemana() >= 7) {
            return 10;
        } else {
            return 7;
        }
    }

    @Override
    public boolean temPatrocionio() {
        return patrocinio;
    }


    @Override
    public String getDescricao() {
        if (temPatrocionio()) {
            return "O atleta " + getNome() + " pratica: " + getEsportePraticado() + ", tem patrocínio";
        } else {
            return super.getDescricao();
        }
    }
}
