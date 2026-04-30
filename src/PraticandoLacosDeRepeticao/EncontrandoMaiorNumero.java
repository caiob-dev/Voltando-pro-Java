package PraticandoLacosDeRepeticao;

import java.util.Scanner;

public class EncontrandoMaiorNumero {
    public static void main(String[] args) {
        //Carlos tem uma lista de números e quer descobrir qual é o maior valor. Para isso, ele decidiu percorrer a lista comparando cada número
        // com o maior encontrado até o momento. Crie um programa que receba uma lista de números e encontre o maior número.
        //
        //Exemplo de entrada:
        //
        //Digite os números separados por espaço: 3 7 2 9 5
        //Saída esperada:
        //O maior número é: 9

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite os números separados por espaço: ");
        String [] nmrsString = leitura.nextLine().trim().split("\\s+");

        int maiorNumero = Integer.MIN_VALUE;

        for (String nmrs : nmrsString) {
            int num = Integer.parseInt(nmrs);

            if (num > maiorNumero) {
                maiorNumero = num;
            }
        }

        System.out.println("O maior número é: " + maiorNumero);
    }
}
