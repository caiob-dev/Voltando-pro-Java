package PraticandoEncapsulamento;

import java.util.ArrayList;

public class Disciplina {
    //Crie um programa que:
    //Defina uma classe que armazene o nome da disciplina e a lista das notas dos alunos
    //Valide se cada nota está entre 0 e 10
    //Calcule a média apenas das notas válidas
    //Informe quantas notas foram registradas com sucesso e quantas foram ignoradas

    //Exemplo de entrada:
    //Disciplina matematica = new Disciplina("Matemática");
    //matematica.adicionarNota(7.5);
    //matematica.adicionarNota(11.0);
    //matematica.adicionarNota(8.0);
    //matematica.adicionarNota(-3.0);
    //matematica.adicionarNota(9.5);

    //Saída esperada:
    //Nota inválida ignorada: 11.0
    //Nota inválida ignorada: -3.0
    //Total de notas válidas: 3
    //Média em Matemática: 8,33

    private String disciplina;
    private ArrayList<Double> notas;

    public Disciplina(String disciplina) {
        this.disciplina = disciplina;
        this.notas = new ArrayList<>();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void adicionarNota(double nota) {
        if(nota >= 0 && nota <= 10) {
            this.notas.add(nota);
        } else {
            System.out.println("Nota invalida ignorada! " + nota );
        }
    }

    public int listarNotas () {
        return notas.size();
    }

    public double calcularMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }
}
