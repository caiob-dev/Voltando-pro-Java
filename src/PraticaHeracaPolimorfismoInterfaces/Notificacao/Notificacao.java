package PraticaHeracaPolimorfismoInterfaces.Notificacao;

public class Notificacao {
    //Crie um programa que:
    //
    //Defina uma classe base Notificacao com atributos destinatário e mensagem.
    //Crie classes específicas (Email, SMS, Push) que herdem de Notificacao.
    //Cada uma deve implementar o seu próprio método enviar(), exibindo como cada notificação é disparada.
    // Lembre-se de sobrescrever o método utilizando a anotação @override.
    //Exemplo de entrada:
    //
    //email.enviar();
    //sms.enviar();
    //push.enviar();

    //Saída esperada:
    //Enviando Email para: cliente@exemplo.com
    //Assunto: Promoção especial!
    //Corpo: Aproveite nossos descontos esta semana.
    //
    //Enviando SMS para: (11) 98765-4321
    //Mensagem: Sua fatura foi paga com sucesso.
    //
    //Enviando Push para: usuario_app
    //Título: Novidade!
    //Conteúdo: Você tem uma nova mensagem não lida.

    private String destinatario;
    private String mensagem;

    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void enviar() {};
}
