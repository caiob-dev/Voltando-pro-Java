package PraticandoLacosDeRepeticao;

import java.util.Scanner;

public class NumeroPositivosENegativos {
    public static void main(String[] args) {
        //Ana é professora de matemática e está sempre curiosa sobre as respostas de seus alunos.
        // Hoje, ela propôs um exercício no qual os alunos devem contar quantos números positivos e negativos
        // existem em uma sequência de números fornecida por ela.
        //Ela quer que os alunos criem um programa que permita **inserir vários números, um por vez, e que pare quando o número "fim" for digitado. **
        //Exemplo de entrada:
        //Digite um número (ou 'fim' para encerrar): 3
        //Digite um número (ou 'fim' para encerrar): -1
        //Digite um número (ou 'fim' para encerrar): 7
        //Digite um número (ou 'fim' para encerrar): fim

        //Saída esperada:
        //Números positivos: 2
        //Números negativos: 1

        Scanner leitura = new Scanner(System.in);
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        while (true) {
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String busca = leitura.nextLine();
            if (busca.equalsIgnoreCase("fim")) {
                System.out.println("Programa finalizado.");
                break;
            }

            int numero = Integer.parseInt(busca);

            if (numero > 0) {
                numerosPositivos++;
            } else if(numero < 0) {
                numerosNegativos++;
            }

        }
            System.out.println("Números positivos: " + numerosPositivos);
            System.out.println("Números negativos: " + numerosNegativos);
    }
}
