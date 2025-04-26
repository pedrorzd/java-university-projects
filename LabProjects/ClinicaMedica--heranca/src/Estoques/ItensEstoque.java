package Estoques;

import java.io.Serializable;
import java.util.Date;

public class ItensEstoque implements Estocavel {
    private int id;
    private String descricao;
    private int quantidade;
    private String dataValidade;
    private String tipo;

    public ItensEstoque(int id, String descricao, int quantidade, String validade, String tipo) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.dataValidade = validade;
        this.tipo = tipo;
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
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
