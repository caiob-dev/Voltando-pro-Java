package PraticaHeracaPolimorfismoInterfaces.Biblioteca;

public class Midia {
    //Crie um programa que:
    //Defina uma classe Midia com os atributos título e ano de publicação.
    //Defina um método que gere um código no formato “LIB- + os três primeiros caracteres do título + ano de publicação”, por exemplo:

    //Código: LIB-O H1937 | Livro: "O Hobbit" - Autor: J.R.R. Tolkien
    //Crie as classes Livro, Revista e Ebook, todas herdando de Midia, adicionando:
    //Livro: atributo autor.
    //Revista: atributo edição.
    //Ebook: atributo formato.
    //Cadastre uma mídia de cada tipo.
    //Exiba o código e os detalhes de cada mídia usando o método exibirInfo.
    //Exemplo de entrada:
    //
    //livro.exibirInfo();
    //revista.exibirInfo();
    //ebook.exibirInfo();
    //Saída esperada:
    //
    //Código: LIB-O G1979 | Livro: "O Guia do Mochileiro das Galáxias" - Autor: Douglas Adams
    //Código: LIB-Nat2023 | Revista: "National Geographic" - Edição: 245
    //Código: LIB-Cle2008 | Ebook: "Clean Code" - Formato: PDF

    private String titulo;
    private int anoPublicacao;

    public Midia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String gerarCodigo() {
        return "LIB-" + getTitulo().substring(0,3) + getAnoPublicacao();
    }
}
