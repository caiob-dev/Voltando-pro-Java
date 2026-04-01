package br.com.minhasMusicas.Principal;

import br.com.minhasMusicas.Modelos.MinhasPreferidas;
import br.com.minhasMusicas.Modelos.Musica;
import br.com.minhasMusicas.Modelos.Podcast;

public class Principal {
    public void main (String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("Sway");
        musica.setArtista("Michael Bublé");

        for (int i = 0; i < 300 ; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 300; i ++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("English with native");
        podcast.setHost("Conner Pe");

        for (int i = 0; i < 300 ; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 100; i ++) {
            podcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);
    }
}
