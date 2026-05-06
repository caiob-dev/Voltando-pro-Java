package PraticaHeracaPolimorfismoInterfaces.Biblioteca;

public class Livro extends Midia{

    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public void exibirInfo() {
        System.out.println("Código : " + gerarCodigo() + " | Livro: " + getTitulo() + " | Autor: " + autor);
    }
}
