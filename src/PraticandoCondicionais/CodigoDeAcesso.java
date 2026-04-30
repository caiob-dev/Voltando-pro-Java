package PraticandoCondicionais;

import javax.xml.transform.Source;
import java.util.Scanner;

public class CodigoDeAcesso {
    public static void main(String[] args) {
        //João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema, o usuário precisa fornecer:
        //Um código de acesso numérico (o código correto é 2023).
        //Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).
        //O sistema só permitirá o acesso se:
        //O código de acesso estiver correto.
        //O nível de permissão for válido (1, 2 ou 3).
        //Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto, nível de permissão inválido ou ambos).

        //Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando se o acesso foi permitido ou negado,
        // além do motivo,se for o caso.

        //Exemplo de entrada:

        //Digite o código de acesso: 2023
        //Digite o nível de permissão: 2

        //Saída esperada:
        //Acesso permitido. Bem-vindo ao sistema!
        Scanner leitura = new Scanner(System.in);

        int codigoCorreto = 2023;
        int nivelPermissaoMinimo = 1;
        int nivelPermissaoMaximo = 3;

        System.out.println("Digite o código de acesso: ");
        int codigo = leitura.nextInt();
        System.out.println("Digite o nível de permissão: ");
        int nivel = leitura.nextInt();

        boolean codigoValido = codigo == codigoCorreto;
        boolean nivelPermitido = nivel >= nivelPermissaoMinimo && nivel <= nivelPermissaoMaximo;

        if (codigoValido & nivelPermitido ) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            if(!codigoValido) {
                System.out.println("Acesso negado. Motivo: Código inválido");
            }
            if(!nivelPermitido) {
                System.out.println("Acesso negado. Motivo nível de permissão não é válido.");
            }
        }
    }


}
