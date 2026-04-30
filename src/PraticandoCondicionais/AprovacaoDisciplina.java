package PraticandoCondicionais;

//Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado na disciplina. A regra da escola é:
//O estudante é aprovado se média final é maior ou igual a 7.0.
//Se a média for entre 5.0 e 6.9, está de recuperação.
//Se for abaixo de 5.0, está reprovado.
//Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as regras da escola.

//Saída esperada:
//O estudante teve média 8.2 e foi aprovado.
//Ou
//O estudante teve média 5.8 e está de recuperação.
//Ou
//O estudante teve média 4.3 e foi reprovado.

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        double nota1 =  10.0;
        double nota2 = 7.0 ;
        double nota3 = 8.5 ;

        double calcularMediaNotas = (nota1 + nota2 + nota3) / 3;

        if (calcularMediaNotas >= 7.0) {
            System.out.println("O estudante teve média " + String.format("%.2f", calcularMediaNotas) + " e foi aprovado.");
        } else if (calcularMediaNotas >= 5.0 & calcularMediaNotas <= 6.9) {
            System.out.println("O estudante teve média " + String.format("%.2f", calcularMediaNotas) + " e está de recuperação.");
        } else if (calcularMediaNotas < 5.0) {
            System.out.println("O estudante teve média " + String.format("%.2f", calcularMediaNotas) + " e foi reprovado.");
        }
    }
}
