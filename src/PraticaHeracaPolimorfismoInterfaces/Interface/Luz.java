package PraticaHeracaPolimorfismoInterfaces.Interface;

public class Luz implements Controlavel {
    //Crie um programa que:
    //Defina uma interface Controlavel com dois métodos:
    //ligar()
    //desligar()
    //Tenha duas classes: Luz e ArCondicionado, que implementam essa interface.
    //Cada classe deve conter um atributo booleano ligado, iniciado como false,
    //que representa o estado atual do dispositivo.

    //Ao chamar os métodos:
    //Se o dispositivo estiver desligado e o método ligar() for chamado,
    // ele deve mudar o estado para ligado e exibir a mensagem: "Luz ligada." ou "Ar-condicionado ligado."
    //Se já estiver ligado, e ligar() for chamado novamente, exibir: "Luz já está ligada." ou "Ar-condicionado já está ligado."
    //O mesmo vale para o método desligar(), com as mensagens correspondentes.
    //Exemplo de entrada:
    //
    //Luz luz = new Luz();
    //ArCondicionado ar = new ArCondicionado();
    //
    //luz.ligar();
    //luz.ligar();
    //luz.desligar();
    //
    //ar.desligar();
    //Saída esperada:
    //
    //Luz ligada.
    //Luz já está ligada.
    //Luz desligada.
    //Ar-condicionado já está desligado.

    private boolean ligado = false;

    @Override
    public void ligar() {
        if(!ligado) {
            ligado = true;
            System.out.println("Luz ligada.");
        } else {
            System.out.println("Luz já está ligada");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Luz desligada.");
        } else {
            System.out.println("Luz já está desligada.");
        }
    }
}
