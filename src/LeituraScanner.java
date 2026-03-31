import java.util.Scanner;

public class LeituraScanner {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = sc.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = sc.nextInt();

        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        System.out.println("Filme favorito: " + filme + ", ano: " + anoLancamento + ", nota: " + nota);
    }
}
