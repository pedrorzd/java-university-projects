package Administrative;

import java.util.ArrayList;
import java.util.Date;

public class PlanosDeSaude {
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private ArrayList<String> procedimentos;

    public PlanosDeSaude(String nome, Date dataInicio, Date dataFim, ArrayList<String> procedimentos) {
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<String> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(ArrayList<String> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public void addProcedimento(String codigo){};
    public void cobreProcedimento(String codigo){};
}
