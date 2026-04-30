package PraticandoCondicionais;

import java.util.Scanner;

public class DoacaoDeSangue {
    //Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue.
    // Para ser compatível, o doador deve atender aos seguintes critérios:
    //Ter entre 18 e 65 anos.
    //Pesar mais de 50 kg.

    //Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar sangue.
    // Se não for, o programa deve indicar qual critério não foi atendido.
    //Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando se ele é compatível ou não,
    // além de informar o critério não atendido, se for o caso?
    //Exemplo de entrada:
    //Digite a idade do doador: 17
    //Digite o peso do doador (em kg): 55

    //Saída esperada:
    //O doador não é compatível.
    //Motivo: Deve ter entre 18 e 65 anos.

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a idade do doador: Deve ter entre 18 e 65 anos ");
        int idadeDoador = leitura.nextInt();
        System.out.println("Digite o peso do doador (em kg): Deve pesar mais de 50 kg");
        int pesoDoador = leitura.nextInt();

        boolean idadeValida = idadeDoador >= 18 & idadeDoador <= 65;
        boolean pesoValido = pesoDoador > 50;

        if (idadeValida & pesoValido) {
            System.out.println("Doador é compatível, e pode ir para sala do médico para receber os documentos ");
        } else {
            System.out.println("O doador não é compatível.");
            if (!idadeValida) {
                System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("Motivo: Deve ter mais de 50kg.");
            }
        }
        leitura.close();

    }
}
