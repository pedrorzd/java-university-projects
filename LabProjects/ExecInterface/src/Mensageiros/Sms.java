package Mensageiros;

import Interface.Notificacao;

public class Sms implements Notificacao {
    private String nomeRemetente;
    private String nomeDestinatario;
    private String numeroRemetente;
    private String numeroDestinatario;
    private String mensagem;

    public Sms(String numeroRemetente, String numeroDestinatario, String nomeRemetente, String nomeDestinatario, String mensagem) {
        this.numeroRemetente = numeroRemetente;
        this.numeroDestinatario = numeroDestinatario;
        this.nomeRemetente = nomeRemetente;
        this.nomeDestinatario = nomeDestinatario;
        this.mensagem = mensagem;
    }

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public String getNumeroRemetente() {
        return numeroRemetente;
    }

    public String getNumeroDestinatario() {
        return numeroDestinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void envioSms(String numeroRemetente, String nomeRemetente, String numeroDestinatario, String nomeDestinatario, String mensagem) {
        Notificacao.envioSms(getNumeroRemetente(),getNomeRemetente(),getNumeroDestinatario(),getNomeDestinatario(),getMensagem());
    }
}
