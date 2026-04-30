package br.com.Atletas.Modelos;

public class Atletas {
    private String nome;
    private String esportePraticado;
    private int totalVezesNaSemana;
    private int classificacao;
    private String descricao;

    public void praticadoNaSemana() {
        totalVezesNaSemana++;
    }

    public String getDescricao() {
        return "O atleta: " + nome + " pratica: " + esportePraticado;
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

    public int getTotalVezesNaSemana() {
        return totalVezesNaSemana;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
