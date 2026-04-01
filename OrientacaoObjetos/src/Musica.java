public class Musica {
    //Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
    // e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica () {
        System.out.println("Nome da música " + titulo);
        System.out.println("Nome do artista " + artista);
        System.out.println("Ano de lançamento " + anoLancamento);
    }

    void avaliar(double nota) {
        avaliacao+= nota;
        numAvaliacoes++;
    }

    double mediaDasNotas() {
        return avaliacao / numAvaliacoes;
    }
}
