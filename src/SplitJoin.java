public class SplitJoin {
    public static void main(String[] args) {
        String frase = "Java;JavaScript;Python";
        String [] lista = frase.split(";");

        for(String item : lista) {
            System.out.println(item);
        }

        String resultado = String.join("-", "2026","04","29");
        System.out.println(resultado);
    }
}
