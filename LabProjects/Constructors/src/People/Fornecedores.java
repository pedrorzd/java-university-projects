package People;

public class Fornecedores {
    private int id;
    private String name;
    private String cnpj;
    private String inscEst;
    private String email;
    private String telefone;
    private String endereco;
    private String contato;

    public Fornecedores (int id, String name, String cnpj, String inscEst, String email, String telefone, String endereco, String contato){
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.inscEst = inscEst;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscEst() {
        return inscEst;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }

    public void Imprimir() {
        System.out.print(
                "\nId: " + getId() +
                "\nName: " + getName() +
                "\nCNPJ: " + getCnpj() +
                "\nInscrição Estadual: " + getInscEst() +
                "\nEmail: " + getEmail() +
                "vTelefone: " + getTelefone() +
                "\nEndereço: " + getEndereco() +
                "\nContato: " + getContato()
        );
        System.out.println();
    }
}

