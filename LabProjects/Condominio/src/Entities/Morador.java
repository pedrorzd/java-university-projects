package Entities;

import javax.swing.*;

public class Morador {
    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private boolean pago;

    public Morador(int id, String nome, int idade, String cpf, String telefone, boolean pago) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.pago = pago;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isPago() {
        return pago;
    }

    public void dadosMorador(){
        JOptionPane.showInputDialog(null,
                 "\nID Morador: "+getId()+
                "\nNome Morador: "+getNome()+
                "\nIdade: "+getIdade()+
                "\nCPF: "+getCpf()+
                "\nTelefone: "+getTelefone()+
                "\nPagou a fatura do mês: "+isPago()
        );
    }
}
