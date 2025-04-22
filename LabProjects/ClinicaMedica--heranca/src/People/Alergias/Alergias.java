package People.Alergias;

import People.Pacientes;

public class Alergias extends Pacientes {
    private int id;
    private String tipo ;
    private String gravidade;
    private Pacientes paciente;

    public Alergias(int id, String tipo, String gravidade, Pacientes paciente) {
        super(paciente.getId(), paciente.getCpf(), paciente.getNome(), paciente.getTelefone(),
                paciente.getEndereco(), paciente.getEmail(), paciente.getDataNascimento(),
                paciente.getAlergias(), paciente.getPlano());
        this.id = id;
        this.tipo = tipo;
        this.gravidade = gravidade;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }
}
