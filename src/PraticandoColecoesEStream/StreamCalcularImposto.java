package PraticandoColecoesEStream;

//Calculando o total com imposto
//Imagine que você trabalha no setor financeiro de uma empresa e precisa calcular o valor total gasto na compra de produtos.
// No entanto, a empresa precisa considerar um imposto de 8% sobre o valor total para definir corretamente o preço final dos produtos.

//Crie um programa que:
//Crie uma lista contendo os preços dos produtos.
//Utilize reduce() para calcular o total gasto.
//Calcule o valor do imposto (8%) sobre o total.
//Exiba o valor total antes e depois da aplicação do imposto, com duas casas decimais.
//Exemplo de entrada:
//List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

import java.util.List;

//Saída esperada:
//Valor total antes do imposto: 195.23
//Valor total com imposto de 8%: 210.85
public class StreamCalcularImposto {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        Double totalGasto = precosProdutos.stream()
                        .reduce(0.0, Double::sum);

        double calcularImposto = totalGasto * 0.08;
        double totalComImposto = calcularImposto + totalGasto;

        System.out.println("Valor total antes do imposto: " + totalGasto);
        System.out.println("Valor total depois do imposto: " + String.format("%.2f", totalComImposto));
    }
}
