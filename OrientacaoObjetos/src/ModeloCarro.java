public class ModeloCarro extends Carro2 {

    private int quantidadeDePortas;

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
        System.out.println("Quantidade portas do carro: " + quantidadeDePortas);
    }
}
