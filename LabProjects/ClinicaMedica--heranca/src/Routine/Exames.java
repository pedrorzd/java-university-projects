package Routine;

import People.Pacientes;

import javax.swing.*;
import java.util.Date;

public class Exames {
    private int id;
    private String codigoTUSS; // Padrão ANS
    private String descricao;
    private String laboratorio;
    private String dataRealizacao;
    private String resultado;

    public Exames(int id, String codigoTUSS, String descricao, String laboratorio, String dataRealizacao, String resultado) {
        this.id = id;
        this.codigoTUSS = codigoTUSS;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
        this.dataRealizacao = dataRealizacao;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoTUSS() {
        return codigoTUSS;
    }

    public void setCodigoTUSS(String codigoTUSS) {
        this.codigoTUSS = codigoTUSS;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(String dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    // SMS/Email
    public void enviarResultado(Pacientes paciente){
        JOptionPane.showMessageDialog(null,
                "Exame enviado com sucesso!"+
                "\nEmail do paciente: "+ paciente.getEmail() +
                "\nCelular do paciente: "+paciente.getTelefone()
                );
    };
}
