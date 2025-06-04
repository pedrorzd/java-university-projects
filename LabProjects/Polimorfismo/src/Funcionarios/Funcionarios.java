package Funcionarios;

public abstract class Funcionarios {
    private String nome;
    private String matricula;
    private String salarioBase;

    public Funcionarios(String nome, String matricula, String salarioBase){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
