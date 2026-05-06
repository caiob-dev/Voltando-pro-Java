package PraticaHeracaPolimorfismoInterfaces.Biblioteca;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public void exibirInfo() {
        System.out.println("Código : " + gerarCodigo() + " | Revista: " + getTitulo() + " | Edição: " + edicao);
    }
}
