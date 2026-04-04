package br.com.Atletas.Principal;

import br.com.Atletas.Modelos.Amadores;
import br.com.Atletas.Modelos.Atletas;
import br.com.Atletas.Modelos.Pro;
import br.com.Atletas.Modelos.Treinar;

public class Principal {
    public static void main (String[] args) {
        Pro caio = new Pro();

        caio.setNome("Caio");
        caio.setEsportePraticado("Musculação");
        caio.setTreinador("Vitor");
        caio.setPatrocionio(true);

        for (int i = 0; i < 7; i++) {
            caio.praticadoNaSemana();
        }

        Amadores jose = new Amadores();

        jose.setNome("José");
        jose.setEsportePraticado("Musculação");

        for (int i = 0; i < 5; i++) {
            jose.praticadoNaSemana();
        }

        Treinar treinos = new Treinar();
        treinos.treino(caio);
        treinos.treino(jose);
    }

}
