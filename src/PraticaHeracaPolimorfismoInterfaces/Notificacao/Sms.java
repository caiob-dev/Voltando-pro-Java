package PraticaHeracaPolimorfismoInterfaces.Notificacao;

public class Sms extends Notificacao {
    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
}
