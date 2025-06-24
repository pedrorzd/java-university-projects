package Pessoas;

public class ClientesRegular implements Desconto {
    private String idClienteRegular;
    private String nome;
    private String telefone;
    private String endereco;

    public ClientesRegular(String idClienteRegular, String nome, String telefone, String endereco) {
        this.idClienteRegular = idClienteRegular;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getIdClienteRegular() {
        return idClienteRegular;
    }

    public void setIdClienteRegular(String idClienteRegular) {
        this.idClienteRegular = idClienteRegular;
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


    @Override
    public double valorDesconto(double valor) {
        return 0;
    }
}
