public class Tipos {
    public static void main() {
        System.out.println("Here we go again");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        boolean taNoStreaming = true;
        double rating = 9.5;
        System.out.println("O filme foi lançado em: " + anoDeLancamento + ", tem nota de: " + rating  + " e está no streaming? " + taNoStreaming);

        double media = (9.5 + 9.0) / 2;
        System.out.println("Média: " + media);

        String sinopse = "Continuação do filme top gun";
        System.out.println("Sinopse: " + sinopse);
        //Ou

        String sinopsee;
        sinopsee = """
                O filme top gun Maverick é a continuação do top gun, etc... e foi lançado em                
                """ + anoDeLancamento;

        System.out.println(sinopsee);

        //Casting
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}
