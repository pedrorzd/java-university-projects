package Mensageiros;

import Interface.Notificacao;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Push implements Notificacao {
    Date data = new Date();
    private String idMensagem;
    private String tituloMensagem;
    private String corpoMensagem;

    public Push(String idMensagem, String tituloMensagem, String corpoMensagem) {
        this.idMensagem = idMensagem;
        this.tituloMensagem = tituloMensagem;
        this.corpoMensagem = corpoMensagem;
    }

    public String getIdMensagem() {
        return idMensagem;
    }

    public String getHorario() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(data);

    }

    public String getTituloMensagem() {
        return tituloMensagem;
    }

    public String getCorpoMensagem() {
        return corpoMensagem;
    }

    public void enviaPush(String tituloMensagem, String horario, String corpoMensagem){
        Notificacao.envioPush(getTituloMensagem(), getHorario(), getCorpoMensagem());
    }
}
