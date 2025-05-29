package Mensageiros;

import Interface.Notificacao;

public class Email implements Notificacao {
    private String emailRemetente;
    private String nomeRemetente;
    private String emailDestinatario;
    private String nomeDestinatario;
    private String assuntoEmail;
    private String corpoMensagem;

    public Email(String emailRemetente, String nomeRemetente, String emailDestinatario, String nomeDestinatario, String assuntoEmail, String corpoMensagem) {
        this.emailRemetente = emailRemetente;
        this.nomeRemetente = nomeRemetente;
        this.emailDestinatario = emailDestinatario;
        this.nomeDestinatario = nomeDestinatario;
        this.assuntoEmail = assuntoEmail;
        this.corpoMensagem = corpoMensagem;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public String getAssuntoEmail() {
        return assuntoEmail;
    }

    public String getCorpoMensagem() {
        return corpoMensagem;
    }

    public void envioEmail(String emailRemetente, String nomeRemetente, String emailDestinatario, String nomeDestinatario, String assuntoEmail, String corpoMensagem) {
        Notificacao.envioEmail(getEmailRemetente(),getNomeRemetente(),getEmailDestinatario(),getNomeDestinatario(),getAssuntoEmail(),getCorpoMensagem());
    }
}
