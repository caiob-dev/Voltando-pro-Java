package br.com.Atletas.Modelos;

public class Treinar extends Atletas {
    public void treino(Atletas atletas) {
        if (atletas.getClassificacao() >= 9) {
                System.out.println(atletas.getDescricao() + " e é pro");
            } else {
                System.out.println(atletas.getDescricao() + " está no processo para virar pro");
            }
        }
    }

