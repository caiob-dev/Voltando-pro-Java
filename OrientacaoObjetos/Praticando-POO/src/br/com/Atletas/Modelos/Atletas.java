package br.com.Atletas.Modelos;

public class Atletas {
    private String nome;
    private String esportePraticado;
    private int totalVezesNaSemana;
    private int classificacao;
    private boolean patrocionio;

    public void praticadoNaSemana() {
        totalVezesNaSemana++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    public boolean isPatrocionio() {
        return patrocionio;
    }

    public void setPatrocionio(boolean patrocionio) {
        this.patrocionio = patrocionio;
    }

    public int getTotalVezesNaSemana() {
        return totalVezesNaSemana;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
