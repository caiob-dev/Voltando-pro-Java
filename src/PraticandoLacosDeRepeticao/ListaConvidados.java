package PraticandoLacosDeRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {
    public static void main(String[] args) {
        //Maria está preparando um evento de aniversário e quer organizar a lista de convidados. Ela precisa de um sistema que:
        //Exiba a lista de convidados já cadastrados caso o usuário digite "ver".
        //Adicione novos nomes à lista, caso o nome não esteja lá.
        //Caso o nome já esteja na lista, o programa deve informar que o nome já foi registrado.
        //O programa deve permitir que Maria continue a adicionar nomes até ela digitar "sair".
        //Ajude Maria e faça o código para este sistema.
        //
        //Saída esperada:
        //
        //Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Ana
        //Ana foi adicionado à lista de convidados.
        //Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Bruno
        //Bruno foi adicionado à lista de convidados.
        //Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ana
        //O nome ana já está na lista de convidados.
        //Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Jaqueline
        //Jaqueline foi adicionado à lista de convidados.
        //Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ver
        //Lista atualizada de convidados: [Ana, Bruno, Jaqueline]
        //Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): sair
        //Programa finalizado.

        Scanner leitura = new Scanner(System.in);

        ArrayList<String> convidados = new ArrayList<>();

       while(true) {
           System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
           String nomes = leitura.nextLine();

           if (nomes.equalsIgnoreCase("sair")) {
               System.out.println("Programa finalizado");
               break;
           }

           if (nomes.equalsIgnoreCase("ver")) {
               System.out.println("Lista atualizada de convidados: " + convidados);
               continue;
           }

           boolean jaTem = false;

           for(String convidado : convidados) {
               if (convidado.toLowerCase().equals(nomes.toLowerCase())) {
                   jaTem = true;
                   break;
               }
           }

           if (jaTem) {
               System.out.println("O nome " + nomes + " já está na lista de convidados.");
           } else {
               convidados.add(nomes);
               System.out.println(nomes + " foi adicionado a lista de convidados.");
           }
       }
    }
}
