package Routine;

import People.Medicos;
import People.Pacientes;

import java.util.Date;

public class Consultas {
    //composicao paciente
    private int id;
    private String TipoConsulta;
    private String tipo;
    private Pacientes paciente;
    private Medicos medico;
    private Date dataHora;
    private String status;
    private String anotacoes;

    public Consultas(int id, String tipoConsulta, String tipo, Pacientes paciente, Medicos medico, Date dataHora, String status, String anotacoes) {
        this.id = id;
        TipoConsulta = tipoConsulta;
        this.tipo = tipo;
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.status = status;
        this.anotacoes = anotacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoConsulta() {
        return TipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        TipoConsulta = tipoConsulta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
}
