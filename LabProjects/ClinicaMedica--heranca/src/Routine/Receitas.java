package Routine;

import Estoques.Medicamentos;
import People.Medicos;
import People.Pacientes;

import java.util.ArrayList;
import java.util.Date;

public class Receitas extends Medicos {
    private int id;
    private String data;
    private ArrayList<String> medicamentos;
    private Medicos prescritor;
    private Pacientes paciente;

    public Receitas(int id, String data, ArrayList<String> medicamentos, Medicos prescritor, Pacientes paciente) {
        super(prescritor.getId(), prescritor.getCrm(), prescritor.getNome(), prescritor.getEspecialidade(), prescritor.isAtendeTelemedicina());
        this.id = id;
        this.data = data;
        this.medicamentos = medicamentos;
        this.prescritor = prescritor;
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

    public ArrayList<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Medicos getPrescritor() {
        return prescritor;
    }

    public void setPrescritor(Medicos prescritor) {
        this.prescritor = prescritor;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    //vericar para adicionar medicamento
    public void adicionarMedicamento(Medicamentos med){};
}
