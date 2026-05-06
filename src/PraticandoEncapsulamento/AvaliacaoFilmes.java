package PraticandoEncapsulamento;

import java.util.ArrayList;

public class AvaliacaoFilmes {
    //Crie uma classe que:
    //Armazene o título do filme e suas avaliações. As avaliações são armazenadas em uma lista
    //Permita adicionar novas avaliações (apenas entre 1 e 5)
    //Calcule e exiba a média das avaliações com precisão decimal
    //Exemplo de entrada:
    //Filme matrix = new Filme("Matrix");
    //matrix.adicionarAvaliacao(5);
    //matrix.adicionarAvaliacao(4);
    //matrix.adicionarAvaliacao(5);
    //matrix.adicionarAvaliacao(3);
    //matrix.adicionarAvaliacao(4);
    //Saída esperada:
    //
    //Média de avaliações para Matrix: 4,20

    private String titulo;
    private ArrayList<Integer> avaliacao;

    public AvaliacaoFilmes(String titulo) {
        this.titulo = titulo;
        this.avaliacao = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarAvaliacao(int nota) {
        if(nota >= 1 && nota <= 5) {
            avaliacao.add(nota);
        } else {
            System.out.println("Nota inválida, insira uma nota maior que 0 e menor que 6");
        }
    }

    public double calcularMedia() {
        int soma = 0;
        for(int nota : avaliacao) {
            soma += nota;
        }
        return (double) soma / avaliacao.size();
    }
}
