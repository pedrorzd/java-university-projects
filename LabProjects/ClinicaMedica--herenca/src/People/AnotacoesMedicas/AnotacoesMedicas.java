package People.AnotacoesMedicas;

import People.Medicos;
import People.Pacientes;

import java.util.Date;

public class AnotacoesMedicas {
    private int id;
    private Date data;
    private String texto;
    private Medicos MedicoResponsavel;
    private Pacientes Paciente;

    public AnotacoesMedicas(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Medicos getMedicoResponsavel() {
        return MedicoResponsavel;
    }

    public void setMedicoResponsavel(Medicos medicoResponsavel) {
        MedicoResponsavel = medicoResponsavel;
    }

    public Pacientes getPaciente() {
        return Paciente;
    }

    public void setPaciente(Pacientes paciente) {
        Paciente = paciente;
    }
}
