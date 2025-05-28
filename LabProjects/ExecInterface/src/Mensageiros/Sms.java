package Mensageiros;

public class Sms implements Notificacao {
    private String nomeRemetente;
    private String nomeDestinatario;
    private String numeroRemetente;
    private String numeroDestinatario;
    private String mensagem;

    public Sms(String numeroRemetente, String numeroDestinatario ){
        this.numeroRemetente = numeroRemetente;
        this.nomeDestinatario = numeroDestinatario;
    }

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getNumeroRemetente() {
        return numeroRemetente;
    }

    public void setNumeroRemetente(String numeroRemetente) {
        this.numeroRemetente = numeroRemetente;
    }

    public String getNumeroDestinatario() {
        return numeroDestinatario;
    }

    public void setNumeroDestinatario(String numeroDestinatario) {
        this.numeroDestinatario = numeroDestinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void envioSms(String numeroRemetente, String nomeRemetente, String numeroDestinatario, String nomeDestinatario, String mensagem) {
        Notificacao.envioSms(getNumeroRemetente(),getNomeRemetente(),getNumeroDestinatario(),getNomeDestinatario(),getMensagem());
    }
}
