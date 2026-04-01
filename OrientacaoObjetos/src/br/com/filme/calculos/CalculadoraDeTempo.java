package br.com.filme.calculos;

import br.com.filme.modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui (Title t) {
        System.out.println("Adicionando duração em minutos: " + t);
        this.tempoTotal+= t.getDuracaoEmMinutos();
    }
}
