package PraticandoVariaveisETipos;

public class DeclarandoValoresAVariaveis {
    //Escreva um programa que declare variáveis para o seu nome, idade, altura e
    // se você é estudante, utilizando os tipos apropriados, e depois exiba os valores armazenados.

    public static void main(String[] args) {
        String nome = "Caio";
        int idade = 22;
        double altura = 1.70;
        boolean isEstudante = true;

        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Altura: " + String.format("%.2f", altura) + ", É estudante? " + isEstudante);
    }
}
