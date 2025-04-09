package Entities;

import javax.swing.*;
import java.awt.*;

public class Morador {
    private int id;
    private String nome;
    private int idade;
    private int cpf;
    private String telefone;

    public Morador(int id, String nome, int idade, int cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
