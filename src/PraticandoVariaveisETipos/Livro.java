package PraticandoVariaveisETipos;

public class Livro {
    public static void main(String[] args) {
        String titulo = "Pequeno príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int numeroDePaginas = 96;
        double precoLivro = 39.90;
        char categoria = 'F';

        String categoriaDescricao = "";

        if (categoria == 'F') {
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        }

        System.out.println("Livro cadastrado: " + titulo + ", de " + autor+"."+ " Ele possui " + numeroDePaginas + " páginas" + ", custa R$" + precoLivro + " e pertence à categoria " + categoriaDescricao + ".");
    }
}
