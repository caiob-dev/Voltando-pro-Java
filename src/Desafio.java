import java.util.Scanner;

public class Desafio {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        String nome = "Caio Bomfim Pantoja";
        String tipoConta = "Corrente";
        double saldoInicial = 250.00;

        int escolha = 0;
        double valorReal;

        while (escolha != 4) {
            System.out.println("Operações");
            System.out.println("\n");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada:");
            escolha = sc.nextInt();

        if(escolha == 1){
            System.out.println("Dados:");
            System.out.println("Nome:" + nome);
            System.out.println("Conta: " + tipoConta);
            System.out.println("Saldo: " + saldoInicial);
            System.out.println("\n");
        } else if(escolha == 2) {
            System.out.println("Digite o valor a receber:");
            valorReal = sc.nextDouble();

            if(valorReal > 0) {
                saldoInicial+= valorReal;
                System.out.println("Saldo atualizado: " + saldoInicial );
            } else {
                System.out.println("Digite um valor maior que 0");
            }

        } else if(escolha == 3) {
                System.out.println("Digite o valor a transferir:");
                valorReal = sc.nextDouble();

            if (valorReal <= saldoInicial) {
                saldoInicial-= valorReal;
                System.out.println("Transferência realizada, valor na conta: " + saldoInicial );
            } else {
                System.out.println("Saldo insuficiente para completar a transferência");
            }
        } else if(escolha == 4) {
            System.out.println("Programa Encerrado");
        } else {
            System.out.println("Opção inválida, tente novamente");
            System.out.println("\n");

        }



        }

    }
}
