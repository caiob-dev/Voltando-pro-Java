package PraticandoEncapsulamento;

public class CadastroProdutosValidacao {
    //Crie um programa que:
    //Defina uma classe para representar um produto com nome e preço.
    //Valide se o preço é um valor não negativo antes de atualizá-lo.
    //Se o valor for negativo, então deverá ser redefinido para 0.00.
    //Exiba uma mensagem quando a validação falhar.

    //Por fim, exiba uma mensagem com os dados do produto.
    //Exemplo de entrada:
    //nome = "Mouse"
    //preco = -59.90
    //Saída esperada:
    //
    //Preço inválido.
    //Produto: Mouse
    //Preço: 0,00

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void validarPreco() {
        if (getPreco() <= 0) {
            System.out.println("Preço inválido");
        } else {
            System.out.println("Produto: " + getNome() + "\n" + "Preço: " + String.format("%.2f",getPreco()));
        }
    }
}
