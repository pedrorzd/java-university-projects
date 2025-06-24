package Pessoas;

import java.io.Serializable;

public class ClientesVip implements Desconto {
    private String idClienteVip;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public ClientesVip(String idClienteVip, String nome, String cpf, String telefone, String email, String endereco) {
        this.idClienteVip = idClienteVip;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getIdClienteVip() {
        return idClienteVip;
    }

    public void setIdClienteVip(String idClienteVip) {
        this.idClienteVip = idClienteVip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public double valorDesconto(double valor) {
        return valor-(valor * 0.15);
    }
}
