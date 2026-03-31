public class Condicionais {
    public static void main() {
    int anoDeLancamento = 2022;
    boolean taNoStreaming = true;
    String tipoPlano = "plus";
    double rating = 9.5;

    if (anoDeLancamento >= 2022 && tipoPlano.equals("plus")) {
        System.out.println("Lançamentos que os clientes plus estão curtindo");
    } else {
        System.out.println("Deve impulsionar seu plano!");
    }
    }
}
