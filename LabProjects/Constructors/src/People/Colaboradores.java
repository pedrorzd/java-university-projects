package People;

public class Colaboradores {
    private int id;
    private String name;
    private String cpf;
    private String cargo;
    private String email;
    private String telefone;
    private String endereco;
    private String contato;
    private double salario;

    public Colaboradores (int id, String name, String cpf, String cargo, String email, String telefone, String endereco, String contato, double salario){
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.cargo = cargo;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.contato = contato;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
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

    public double getSalario() {
        return salario;
    }

    public void Imprimir() {
        System.out.print(
                "\nId: " + getId() +
                        "\nName: " + getName() +
                        "\nCpf: " + getCpf() +
                        "\nCargo: " + getCargo() +
                        "\nEmail: " + getEmail() +
                        "\nTelefone: " + getTelefone() +
                        "\nEndereço: " + getEndereco() +
                        "\nContato: " + getContato() +
                        "\nSalário: " + getSalario()
        );
    }
}