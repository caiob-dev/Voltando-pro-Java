package PraticandoClasses;

public class CalcularMedia {
    //Crie uma classe que:
    //
    //Represente os alunos com os atributos nome, nota 1´ e nota 2`.
    //Implemente um método que:
    //Calcule a média das notas.
    //Exiba o nome do aluno, suas notas e a média (com uma casa decimal).
    //Indique se o aluno foi aprovado (média >= 7) ou reprovado.
    //Exemplo de entrada:
    //
    //nome = "João Silva"
    //nota1 = 6.5
    //nota2 = 7.5
    //Saída esperada:
    //Aluno: João Silva
    //Nota 1: 6.5
    //Nota 2: 7.5
    //Média: 7,0
    //Situação: Aprovado

    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calcularNotasComMedia() {
        double media = (getNota1() + getNota2()) / 2;
        System.out.println("Nome aluno(a) " + getNome());
        System.out.println("Nota 1: " + getNota1());
        System.out.println("Nota 1: " + getNota2());

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}


