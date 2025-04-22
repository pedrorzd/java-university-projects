package Administrative;

import People.Pacientes;
import Routine.Consultas;

public class Faturamentos {
    private Consultas consulta;
    private double valor;
    private String tipoPagamento;
    private String formaPagamento;
    private boolean reembolsavel;

    public Faturamentos(Consultas consulta, double valor, String tipoPagamento, String formaPagamento, boolean reembolsavel) {
        this.consulta = consulta;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
        this.formaPagamento = formaPagamento;
        this.reembolsavel = reembolsavel;
    }

    public Consultas getConsulta() {
        return consulta;
    }

    public void setConsulta(Consultas consulta) {
        this.consulta = consulta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public boolean isReembolsavel() {
        return reembolsavel;
    }

    public void setReembolsavel(boolean reembolsavel) {
        this.reembolsavel = reembolsavel;
    }
}
