package PraticandoEncapsulamento;

public class PontosAlunos {
    //Crie uma classe que:
    //Armazene os atributos nome, pontos e nível.
    //Implemente um método ganharPontos() para adicionar pontos ao aluno.
    //O nível do aluno deve subir conforme a pontuação total:
    //Nivel 1: 0 a 99 pontos
    //Nível 2: 100 a 199 pontos
    //Nível 3: 200 a 299 pontos
    //E assim por diante (a cada 100 pontos, sobe de nível)
    //Implemente um método exibirStatus() que mostre o nome, pontos e nível atual.

    //Exemplo de entrada:
    //Aluno aluno = new Aluno("Fernanda");
    //aluno.ganharPontos(120);
    //aluno.exibirStatus();

    //Saída esperada:
    //Nome: Fernanda
    //Pontos: 120
    //Nível: 2

    private String nome;
    private int pontos;
    private int nivel;

    public PontosAlunos(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    public void atualizarNivel() {
        this.nivel = (pontos/ 100) + 1;
    }

    public void ganharPontos(int pontos) {
        this.pontos += pontos;
        atualizarNivel();
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Nivel: " + nivel);
    }
}
