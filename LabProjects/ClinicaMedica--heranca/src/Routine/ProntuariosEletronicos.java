package Routine;

import People.AnotacoesMedicas.AnotacoesMedicas;

import java.util.ArrayList;

public class ProntuariosEletronicos {
    private ArrayList<AnotacoesMedicas> historico;
    private ArrayList<Receitas> receita;

    public ProntuariosEletronicos(ArrayList<AnotacoesMedicas> historico, ArrayList<Receitas> receita) {
        this.historico = historico;
        this.receita = receita;
    }

    public ArrayList<AnotacoesMedicas> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<AnotacoesMedicas> historico) {
        this.historico = historico;
    }

    public ArrayList<Receitas> getReceita() {
        return receita;
    }

    public void setReceita(ArrayList<Receitas> receita) {
        this.receita = receita;
    }

    public void adicionarAnotacao(AnotacoesMedicas anotacao){};
    public void resumoProntuario(){};
//////////Relaciona com anotacoesMedicas
//////////Relaciona com receitas
}
