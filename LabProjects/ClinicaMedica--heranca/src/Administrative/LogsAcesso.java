package Administrative;

import People.Usuario;

import java.util.Date;

public class LogsAcesso {
    private Usuario usuario;
    private String operacao; // "Visualizou prontuário", "Alterou consulta"
    private String acao;
    private String data;

    public LogsAcesso(Usuario usuario, String operacao, String acao, String data) {
        this.usuario = usuario;
        this.operacao = operacao;
        this.acao = acao;
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getOperacao() {
        return operacao;
    }

    public String getAcao() {
        return acao;
    }

    public String getData() {
        return data;
    }

    public void gerarRelatorio(){};
}
