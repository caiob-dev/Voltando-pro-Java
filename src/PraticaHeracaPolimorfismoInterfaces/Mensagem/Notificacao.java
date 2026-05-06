package PraticaHeracaPolimorfismoInterfaces.Mensagem;

public class Notificacao {
    //Crie um programa que utilize sobrecarga de métodos para implementar as seguintes variações:
    //Enviar uma mensagem padrão para todos os contatos, como Olá!.
    //Enviar uma mensagem personalizada para um contato específico, como Bom dia para João.
    //Reforçar uma mensagem enviando-a mais de uma vez para o mesmo contato, como: "Atenção!" para Maria,
    // enviada duas vezes.
    //Exemplo de entrada:
    //
    //notificacao.enviarMensagem("Olá!");
    //notificacao.enviarMensagem("João", "Bom dia!");
    //notificacao.enviarMensagem("Maria", "Atenção!", 2);
    //Saída esperada:
    //
    //Mensagem enviada para todos: Olá!
    //Mensagem para João: Bom dia!
    //Mensagem para Maria: Atenção!
    //Mensagem para Maria: Atenção!

    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem(String nome, String mensagem) {
        System.out.println("Mensagem para " + nome +": " + mensagem);
    }

    public void enviarMensagem(String nome, String mensagem, int qtdRepeticoes) {
        for (int i = 0; i < qtdRepeticoes; i++) {
            System.out.println("Mensagem para " + nome + ": " + mensagem);
        }
    }
}
