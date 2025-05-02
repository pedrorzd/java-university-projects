package Routine;

import People.AnotacoesMedicas.AnotacoesMedicas;

import javax.swing.*;
import java.util.ArrayList;

public class ProntuariosEletronicos {
    private ArrayList<String> historico;
    private ArrayList<Receitas> receita;

    public ProntuariosEletronicos(ArrayList<String> historico, ArrayList<Receitas> receita) {
        this.historico = historico;
        this.receita = receita;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    public ArrayList<Receitas> getReceita() {
        return receita;
    }

    public void setReceita(ArrayList<Receitas> receita) {
        this.receita = receita;
    }

    public void adicionarAnotacao(AnotacoesMedicas anotacao){
    };
}
