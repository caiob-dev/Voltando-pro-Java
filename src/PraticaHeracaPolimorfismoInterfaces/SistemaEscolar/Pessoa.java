package PraticaHeracaPolimorfismoInterfaces.SistemaEscolar;

public class Pessoa {
    //Crie um programa que:
    //    //Defina uma classe Pessoa com os atributos nome e idade.
    //    //Crie as classes Aluno e Docente, ambas herdando de Pessoa, adicionando:
    //    //Para Aluno: um atributo nota.
    //    //Para Docente: um atributo disciplina.
    //    //Instancie dois objetos Aluno e dois objetos Docente
    //    //Exiba as informações no terminal.
    //    //Exemplo de entrada:
    //    //aluno1.exibirDados();
    //    //aluno2.exibirDados();
    //    //docente1.exibirDados();
    //    //docente2.exibirDados();
    //
    //    //Saída esperada:
    //    //Aluno: Julia - Idade: 16 - Nota: 8.5
    //    //Aluno: Caio - Idade: 17 - Nota: 7.2
    //    //Docente: Marta - Idade: 40 - Disciplina: Matemática
    //    //Docente: Roberto - Idade: 38 - Disciplina: História

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
