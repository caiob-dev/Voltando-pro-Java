package br.com.minhasMusicas.Modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é sucesso absoluto");
        } else {
            System.out.println(audio.getTitulo() + " é boa para ouvir daqui a pouco");
        }
    }
}
