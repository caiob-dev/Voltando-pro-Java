package PraticaHeracaPolimorfismoInterfaces.Interface;

public class Relatorio implements Imprimivel{


    //Crie um programa que:
    //Defina uma interface Imprimivel com o método imprimir()
    //Implemente uma classe Relatorio que siga este contrato
    //Permita que o relatório seja criado com título e conteúdo
    //Exiba as informações no console
    //Exemplo de entrada:
    //
    //Relatorio rel = new Relatorio(
    //  "Relatório 2025",
    //  "Tudo funcionando conforme esperado."
    //);
    //rel.imprimir();
    //Saída esperada:
    //Título: Relatório 2025
    //Conteúdo: Tudo funcionando conforme esperado.

    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Conteúdo: " + getConteudo());
    }
}
