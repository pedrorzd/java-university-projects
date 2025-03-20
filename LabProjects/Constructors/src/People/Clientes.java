package People;

public class Clientes {
    private int id;
    private String name;
    private String cpf;
    private String email;
    private String endereco;
    private String telefone;

    public Clientes (int id, String name, String cpf, String email, String endereco,String telefone){
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void Imprimir(){
        System.out.print(
                "\nId: " +getId()+
                "\nName: " +getName()+
                "\nCpf: " +getCpf()+
                "\nEmail: " +getEmail()+
                "\nEndereço: " +getEndereco()+
                "\nTelefone: " +getTelefone()
        );
        System.out.println();
    }
}
