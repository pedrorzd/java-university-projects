package Administrativo;

public class Pedidos {
    private int id;
    private int qtdeProduto;
    private double valorUnitario;
    private double valorTotal;
    private String produto;
    private String fornecedor;
    private String dataPedido;

    public Pedidos(int id, int qtdeProduto,double valorUnitario, double valorTotal, String produto, String fornecedor, String dataPedido){
        this.id = id;
        this.qtdeProduto = qtdeProduto;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.dataPedido = dataPedido;
    }

    public int getId() {
        return id;
    }

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getProduto() {
        return produto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void Imprimir(){
        System.out.print(
                "\nID: " +getId()+
                "\nQuantidade produto: " +getQtdeProduto()+
                "\nProduto: " +getProduto()+
                "\nValor unitário: " +getValorUnitario()+
                "\nValor total: " +getValorTotal()+
                "\nFornecedor: " +getFornecedor()+
                "\nData pedido: " +getDataPedido()
        );
        System.out.println();
    }
}
