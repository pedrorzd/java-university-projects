package People;

import Validation.Validacao;

import java.util.Date;

public class Medicos {
    private int id;
    private String crm;
    private String nome;
    private String especialidade;
    private boolean atendeTelemedicina;

    public Medicos(int id, String crm, String nome, String especialidade, boolean atendeTelemedicina) {
        this.id = id;
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.atendeTelemedicina = atendeTelemedicina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Validacao.validarNome(nome);
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isAtendeTelemedicina() {
        return atendeTelemedicina;
    }

    public void setAtendeTelemedicina(boolean atendeTelemedicina) {
        this.atendeTelemedicina = atendeTelemedicina;
    }

    public boolean estaDisponivel(Date data){
        return false;
    };
}
