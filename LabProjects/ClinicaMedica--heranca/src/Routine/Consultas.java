package Routine;

import People.AnotacoesMedicas.AnotacoesMedicas;
import People.Medicos;
import People.Pacientes;

import java.util.Date;

public class Consultas {
    //composicao paciente
    private int id;
    private String tipoConsulta;
    private String tipo;
    private Pacientes paciente;
    private Medicos medico;
    private String dataHora;
    private String status;
    private AnotacoesMedicas anotacoes;

    public Consultas(int id, String tipoConsulta, String tipo, Pacientes paciente, Medicos medico, String dataHora, String status, AnotacoesMedicas anotacoes) {
        this.id = id;
        this.tipoConsulta = tipoConsulta;
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
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
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

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AnotacoesMedicas getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(AnotacoesMedicas anotacoes) {
        this.anotacoes = anotacoes;
    }
}
