package PraticandoColecoesEStream;

import java.util.ArrayList;

public class CollectionAdicionandoElementos {
    public static void main(String[] args) {

        //Sua tarefa é criar uma lista de strings e adicionar os nomes dos funcionários "João", "Maria", " Vitor" e “Ana” a essa lista.
        // Depois, imprima a lista para verificar se os nomes foram adicionados corretamente.
        //Saída esperada:
        // Lista de funcionários: [João, Maria, Vitor, Ana]
        ArrayList<String> listaFuncionarios = new ArrayList<String>();
        listaFuncionarios.add("João");
        listaFuncionarios.add("Maria");
        listaFuncionarios.add("Vitor");
        listaFuncionarios.add("Ana");

        System.out.println("Lista de funcionários: " + String.join(", ", listaFuncionarios));
        listaFuncionarios.remove(2);
        System.out.println("Lista de funcionários após a remoção: " + String.join(", ", listaFuncionarios));
    }
}
