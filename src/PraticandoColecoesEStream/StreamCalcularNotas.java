package PraticandoColecoesEStream;

//Criar uma lista contendo as notas dos alunos.
//Utilizar reduce() para calcular a soma total das notas.
//Calcular a média das notas.
//Determinar a menor e a maior nota da lista. Dica: use a função max e min da classe Stream.
//Exibir os resultados no console.
//Exemplo de entrada:
//
//List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
//Saída esperada:
//
//A média das notas é: 8.2
//A menor nota foi: 6.5
//A maior nota foi: 10.0

import java.util.List;

public class StreamCalcularNotas {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
        Double calcularNotas = notas.stream()
                .reduce(0.0, Double::sum);

        double calcularMedia = calcularNotas / notas.size();
        double menorNota = notas.stream().min(Double::compareTo).get();
        double maiorNota = notas.stream().max(Double::compareTo).get();

        System.out.println("A média das notas é: " + calcularMedia);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A maior nota é: " + maiorNota);
    }
}
