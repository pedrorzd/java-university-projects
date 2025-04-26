package People.AnotacoesMedicas;

import People.Medicos;
import People.Pacientes;

import java.util.Date;

public class AnotacoesMedicas extends Medicos {
    private int id;
    private String data;
    private String texto;
    private Medicos medicoResponsavel;
    private Pacientes paciente;
    //composicao

    public AnotacoesMedicas(int id, String data, String texto, Medicos medicoResponsavel, Pacientes paciente) {
        super(medicoResponsavel.getId(), medicoResponsavel.getCrm(), medicoResponsavel.getNome(),
                medicoResponsavel.getEspecialidade(), medicoResponsavel.isAtendeTelemedicina());
        this.id = id;
        this.data = data;
        this.texto = texto;
        medicoResponsavel = medicoResponsavel;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Medicos getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medicos medicoResponsavel) {
        medicoResponsavel = medicoResponsavel;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }
}
