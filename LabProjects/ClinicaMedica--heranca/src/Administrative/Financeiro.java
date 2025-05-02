package Administrative;

import javax.swing.*;
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

    public void calcularLucroMensal(ArrayList<Faturamentos> faturamentos, ArrayList<Despesas> despesas) {
        double faturamento = 0.0;
        double despesa = 0.0;

        for(Faturamentos faturamentosAux: faturamentos) {
            faturamento += faturamentosAux.getValor();
        }

        for(Despesas despesaAux : despesas){
            despesa += despesaAux.getValor();
        }

        double lucroMensal = faturamento-despesa;
        String lucroMensalFormatado = String.format("%.2f", lucroMensal);

        JOptionPane.showMessageDialog(null, "Lucro Mensal: R$" + lucroMensalFormatado );
    };

}
