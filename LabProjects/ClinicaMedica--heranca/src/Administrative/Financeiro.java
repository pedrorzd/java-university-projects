package Administrative;

import java.util.ArrayList;

//composiçao
public class Financeiro  {
    private ArrayList<String> faturamentos;
    private ArrayList<String> despesas;
    private double dadosFinanceiro;

    public Financeiro() {}

    public ArrayList<String> getFaturamentos() {
        return faturamentos;
    }

    public ArrayList<String> getDespesas() {
        return despesas;
    }

    public double getDadosFinanceiro() {
        return dadosFinanceiro;
    }

    public void setDadosFinanceiro(double dadosFinanceiro) {
        this.dadosFinanceiro = dadosFinanceiro;
    }

    public void calcularLucroMensal(){};
//////////Relaciona com faturamentos
//////////Relaciona com financeiro
}
