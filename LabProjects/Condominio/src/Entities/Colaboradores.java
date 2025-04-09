package Entities;

import javax.swing.*;
import java.awt.*;

public class Colaboradores {
    private int idColaborador;
    private String nomeColaborador;
    private String funcao;
    private String telefone;
    private boolean ativo;

    public Colaboradores(int idColaborador, String nomeColaborador, String funcao, String telefone, boolean ativo) {
        this.idColaborador = idColaborador;
        this.nomeColaborador = nomeColaborador;
        this.funcao = funcao;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    public int getIdColaborador() {
        return this.idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getNomeColaborador() {
        return this.nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


}
