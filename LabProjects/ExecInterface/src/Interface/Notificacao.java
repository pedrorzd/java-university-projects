package Interface;

import java.time.LocalTime;
import java.util.Date;

public interface Notificacao {

    static void envioSms(String numeroRemetente, String nomeRemetente, String numeroDestinatario, String nomeDestinatario, String mensagem) {
        System.out.println("Número de remetente: " + numeroRemetente);
        System.out.println("Nome remetente: " + nomeRemetente);
        System.out.println("Numero de destinatario: " + numeroDestinatario);
        System.out.println("Nome destinatario: " + nomeDestinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println();
    }

    static void envioEmail(String emailRemetente, String nomeRemetente, String emailDestinatario, String nomeDestinatario, String assuntoEmail, String corpoMensagem){
        System.out.println("Email remetente: " + emailRemetente);
        System.out.println("Nome remetente: " + nomeRemetente);
        System.out.println("Email destinatario: " + emailDestinatario);
        System.out.println("Nome destinatario: " + nomeDestinatario);
        System.out.println("Assunto email: " + assuntoEmail);
        System.out.println("Corpo mensagem: " + corpoMensagem);
        System.out.println();
    }

    static void envioPush(String tituloMensagem, String horario, String corpoMensagem){
        System.out.println("Titulo da mensagem: " + tituloMensagem);
        System.out.println("Horario da mensagem: " + horario);
        System.out.println("Corpo mensagem: " + corpoMensagem);
        System.out.println();
    }

}
