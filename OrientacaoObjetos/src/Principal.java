import br.com.filme.calculos.CalculadoraDeTempo;
import br.com.filme.calculos.FiltroRecomendacao;
import br.com.filme.modelos.Movie;
import br.com.filme.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Movie meuFilme = new Movie();
        meuFilme.setNome("Avengers End Game");
        meuFilme.setAnoDeLancamento(2019);
        meuFilme.setDuracaoEmMinutos(180);

//      System.out.println(meuFilme.nome);

        meuFilme.exibirDadosFilme();

        meuFilme.avaliar(9);
        meuFilme.avaliar(9);
        meuFilme.avaliar(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A média de notas do filme é: " + String.format("%.2f",meuFilme.pegaMedia()));

//        Não podemos permitir isso
//        meuFilme.somaDasAvaliacoes = 10;
//        meuFilme.totalDeAvaliacoes = 1;
//        System.out.println(meuFilme.mediaDeNotasAvaliadas());

        Serie serie = new Serie();

        serie.setNome("The chosen");
        serie.setAnoDeLancamento(2021);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        serie.exibirDadosFilme();

        Movie outroFilme = new Movie();
        outroFilme.setNome("Spider man");
        outroFilme.setAnoDeLancamento(2002);
        outroFilme.setDuracaoEmMinutos(130);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        //System.out.println("Minutos para maratonar a série: " + serie.getDuracaoEmMinutos() + " minutos");

        System.out.println("Minutos para maratonar tudo: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);

    }
}