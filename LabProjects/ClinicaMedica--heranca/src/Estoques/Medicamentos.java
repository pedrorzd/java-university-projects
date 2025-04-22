package Estoques;

import java.util.Date;

public class Medicamentos implements Estocavel {
    private int id;
    private String descricao;
    private Date dataValidade;
    private int quantidade; //caixas
    private int qtdeComprimidos;
    private String posologia;

    public Medicamentos(int id, String descricao, Date dataValidade,int quantidade, int qtdeComprimidos, String posologia) {
        this.id = id;
        this.descricao = descricao;
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
        this.qtdeComprimidos = qtdeComprimidos;
        this.posologia = posologia;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQtdeComprimidos() {
        return qtdeComprimidos;
    }

    public void setQtdeComprimidos(int qtdeComprimidos) {
        this.qtdeComprimidos = qtdeComprimidos;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }
}

