package People;

import Administrative.PlanosDeSaude;
import Validation.Validacao;

import java.util.ArrayList;
import java.util.Date;

public class Pacientes extends PlanosDeSaude {
    private int id;
    private String cpf ;
    private String nome ;
    private String telefone ;
    private String endereco ;
    private String email ;
    private Date dataNascimento ;
    private ArrayList<String> alergias;
    private PlanosDeSaude plano;

    public Pacientes(int id, String cpf, String nome, String telefone, String endereco, String email,
                     Date dataNascimento, ArrayList<String> alergias, PlanosDeSaude plano) {
        super(plano.getNome(),plano.getDataInicio(),plano.getDataFim(),plano.getProcedimentos());
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.alergias = alergias;
        this.plano = plano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        Validacao.validarCpf(cpf);
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public PlanosDeSaude getPlano() {
        return plano;
    }

    public void setPlano(PlanosDeSaude plano) {
        this.plano = plano;
    }

    // Verifica se o plano cobre um exame
    private boolean possuiCobertura(String procedimento){
        return false;
    };
}
