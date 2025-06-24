package Diario;

import Pagamentos.PagamentoCartao;
import Pagamentos.PagamentoPix;

public class Pedidos {
    private String idPedido;
    private String idCliente;
    private String idProduto;
    private String dataPedido;
    private String descricaoPedido;
    private double valorPedido;
    private String formaPagamento;

    public Pedidos(String idPedido, String idCliente, String idProduto, String dataPedido, String descricaoPedido, double valorPedido, String formaPagamento) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.dataPedido = dataPedido;
        this.descricaoPedido = descricaoPedido;
        this.valorPedido = valorPedido;
        this.formaPagamento = formaPagamento;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
