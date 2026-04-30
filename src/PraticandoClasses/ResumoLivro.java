package PraticandoClasses;

public class ResumoLivro {
    //Crie um programa que:
    //Defina uma classe com os atributos título, autor e páginas.
    //Implemente um método que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.
    //Exemplo de entrada:
    //
    //l.titulo = "O Guia do Mochileiro das Galáxias";
    //l.autor = "Douglas Adams";
    //l.paginas = 208;

    //Saída esperada:
    //"O Guia do Mochileiro das Galáxias" de Douglas Adams com 208 páginas

    private String titulo;
    private String autor;
    private int paginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void descricaoLivro () {
        System.out.printf("\n%s de %s com %d páginas.", getTitulo(), getAutor(), getPaginas());
    }
}
