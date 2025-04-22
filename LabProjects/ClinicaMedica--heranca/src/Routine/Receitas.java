package Routine;

import Estoques.Medicamentos;
import People.Medicos;

import java.util.ArrayList;
import java.util.Date;

public class Receitas extends Medicos {
    private int id;
    private Date data;
    private ArrayList<Medicamentos> medicamentos;
    private Medicos prescritor;

    public Receitas(int id, Date data, ArrayList<Medicamentos> medicamentos, Medicos prescritor) {
        super(prescritor.getId(), prescritor.getCrm(), prescritor.getNome(), prescritor.getEspecialidade(), prescritor.isAtendeTelemedicina());
        this.id = id;
        this.data = data;
        this.medicamentos = medicamentos;
        this.prescritor = prescritor;
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

    public ArrayList<Medicamentos> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamentos> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Medicos getPrescritor() {
        return prescritor;
    }

    public void setPrescritor(Medicos prescritor) {
        this.prescritor = prescritor;
    }

    //vericar para adicionar medicamento
    public void adicionarMedicamento(Medicamentos med){};
}
