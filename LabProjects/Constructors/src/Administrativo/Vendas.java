package Administrativo;

public class Vendas {
    private int id;
    private double valorTotal;
    private int qtdeProdutos;
    private String produto;
    private String cliente;
    private String dataCompra;

    public Vendas(int id, double valorTotal, int qtdeProdutos, String produto, String cliente, String dataCompra){
        this.id = id;
        this.valorTotal = valorTotal;
        this.qtdeProdutos = qtdeProdutos;
        this.produto = produto;
        this.cliente = cliente;
        this.dataCompra = dataCompra;
    }

    public int getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getQtdeProdutos() {
        return qtdeProdutos;
    }

    public String getProduto() {
        return produto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void Imprimir(){
        System.out.print(
                "\nId: " +getId()+
                "\nValor total: " +getValorTotal()+
                "\nQuantidade: " +getQtdeProdutos()+
                "\nProduto: " +getProduto()+
                "\nCliente: " +getCliente()+
                "\nData compra: " +getDataCompra()
        );
        System.out.println();
    }
}
