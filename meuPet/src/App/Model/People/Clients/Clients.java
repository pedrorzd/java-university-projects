package App.Model.People.Clients;

import App.Model.Animals.Animals;
import App.Model.Validation.Validation;

public class Clients {
    private String name;
    private int idade;
    private String sexo;
    private String cpf;
    private String email;
    private String telefone;
    private Animals animal;
    private String endereco;

    public Clients(String name, int idade, String sexo, String cpf, String email, String telefone, Animals animal, String endereco) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.animal = animal;
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Validation.validarNome(name);
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        Validation.validarCpf(cpf);
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Validation.validarEmail(email);
        this.email = email;
    }

    public String getTelefone() {
        Validation.validarNumero(telefone);
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Animals getAnimal() {
        return animal;
    }

    public void setAnimal(Animals animal) {
        this.animal = animal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        Validation.validarEndereco(endereco);
        this.endereco = endereco;
    }
}
