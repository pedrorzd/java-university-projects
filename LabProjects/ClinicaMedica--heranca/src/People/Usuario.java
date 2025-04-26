package People;

import Validation.Validacao;

import java.util.Date;

public class Usuario {
    private int id;
    private String cpf ;
    private String nome ;
    private String telefone ;
    private String endereco ;
    private String email ;
    private String dataNascimento ;
    private String cargo;

    public Usuario(int id, String cpf, String nome, String telefone, String endereco, String email, String dataNascimento, String cargo) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
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
        this.cpf = cpf;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Validacao.validarNome(nome);
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        Validacao.validarTelefone(telefone);
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
        Validacao.validarEmail(email);
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
