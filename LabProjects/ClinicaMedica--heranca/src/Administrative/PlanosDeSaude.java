package Administrative;

import javax.swing.*;
import java.util.ArrayList;

public class PlanosDeSaude {
    private String nome;
    private String dataInicio;
    private String dataFim;
    private ArrayList<String> procedimentos;

    public PlanosDeSaude() {}

    public PlanosDeSaude(String nome, String dataInicio, String dataFim, ArrayList<String> procedimentos) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.procedimentos = procedimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<String> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(ArrayList<String> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public void addProcedimento(ArrayList<String> procedimentos, String procedimento) {
        procedimentos.add(procedimento);
    };

    public void cobreProcedimento(ArrayList<String>procedimentos,String procedimento) {
        if(procedimentos.contains(procedimento)) {
            JOptionPane.showMessageDialog(null, "O procedimento é aceito pelo plano de saúde");
        } else{
            JOptionPane.showMessageDialog(null, "O procedimento não é aceito pelo plano de saúde");
        }
    };
}
