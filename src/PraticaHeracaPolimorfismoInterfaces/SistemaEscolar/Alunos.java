package PraticaHeracaPolimorfismoInterfaces.SistemaEscolar;

public class Alunos extends Pessoa {
    private double nota;

    public Alunos(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public void exibirDados() {
        System.out.println(getNome() + " - Idade: " + getIdade() + " - " + "Nota: " + nota);
    }
}
