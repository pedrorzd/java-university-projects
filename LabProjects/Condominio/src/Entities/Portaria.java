package Entities;

import javax.swing.*;

public class Portaria {
    Colaboradores colaborador1;

    private int idColaborador;
    private String nomeColaborador;
    private String turno;
    private String telefonePortaria;
    private boolean ativo = true;

    public Portaria(int idColaborador, String nomeColaborador, String turno, String telefonePortaria) {
        this.idColaborador = colaborador1.getIdColaborador();
        this.nomeColaborador = nomeColaborador;
        this.turno = turno;
        this.telefonePortaria = telefonePortaria;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTelefonePortaria() {
        return telefonePortaria;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
