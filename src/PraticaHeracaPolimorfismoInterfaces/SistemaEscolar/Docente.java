package PraticaHeracaPolimorfismoInterfaces.SistemaEscolar;

public class Docente extends Pessoa {
    private String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.println(getNome() + " - Idade: " + getIdade() + " - " + "Disciplina: " + disciplina);
    }
}
