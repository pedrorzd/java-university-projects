package Funcionarios;

public abstract class Funcionarios {
    private String nome;
    private String matricula;
    private Double salarioBase = 1518.00;

    public Funcionarios(String nome, String matricula, double salarioBase){
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
