package Administrative;

import People.Usuario;

import javax.swing.*;
import java.util.Date;

public class LogsAcesso {
    private Usuario usuario;
    private String operacao;
    private String acao;
    private String data;

    public LogsAcesso() {}
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

    public void gerarRelatorio(Usuario usuario) {
        JOptionPane.showMessageDialog(null,
                "Dados de Log do usuário: "+usuario.getId()+
                        "\nOperação: "+getOperacao()+
                        "\nAção: "+getAcao()+
                        "\nData: "+getData()+
                        "\n--------------------------"
        );
    };
}
