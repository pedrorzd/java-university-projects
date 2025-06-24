package Funcionarios;

public class SuporteTecnico extends Funcionarios{
    private String nome;
    private String matricula;
    private double salarioBase;

    public SuporteTecnico(String nome, String matricula, double salarioBase){
        super(nome, matricula, salarioBase);
    }

    public double calculaSalario(){
        return salarioBase;
    }

}
