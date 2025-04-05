package Entities;

import javax.swing.*;

public class Colaboradores {
    private int idColaborador;
    private String nomeColaborador;
    private String cpfColaborador;
    private String telefoneColaborador;
    private String emailColaborador;
    private double salario;

    public Colaboradores(int idColaborador, String nomeColaborador, String cpfColaborador, String telefoneColaborador, String emailColaborador, double salario) {
        this.idColaborador = idColaborador;
        this.nomeColaborador = nomeColaborador;
        this.cpfColaborador = cpfColaborador;
        this.telefoneColaborador = telefoneColaborador;
        this.emailColaborador = emailColaborador;
        this.salario = salario;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public String getCpfColaborador() {
        return cpfColaborador;
    }

    public String getTelefoneColaborador() {
        return telefoneColaborador;
    }

    public void setTelefoneColaborador(String telefoneColaborador) {
        this.telefoneColaborador = telefoneColaborador;
    }

    public String getEmailColaborador() {
        return emailColaborador;
    }

    public void setEmailColaborador(String emailColaborador) {
        this.emailColaborador = emailColaborador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void dadosColaboradores(){
        JOptionPane.showMessageDialog(null, "Dados Colaboradores: " +
                "\nID Colaborador: "+ getIdColaborador()+
                "\nNome Colaborador: "+getNomeColaborador()+
                "\nCPF Colaborador: "+getCpfColaborador()+
                "\nTelefone Colaborador: "+getTelefoneColaborador()+
                "\nEmail Colaborador: " +getEmailColaborador()+
                "\nSalario: "+getSalario()
        );
    }
}
