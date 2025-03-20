package Administrativo;

public class Produtos {
    private int id;
    private String descricao;
    private String tipo;
    private String fornecedor;
        private double precoCompra;
    private double precoVenda;
    private int qtdeEstoque;

    public Produtos(int id, String descricao, String fornecedor, String tipo, double precoCompra, double precoVenda, int qtdeEstoque){
        this.id = id;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.tipo = tipo;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.qtdeEstoque = qtdeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void Imprimir(){
        System.out.print(
                "\nID: " +getId()+
                "\nDescrição: " +getDescricao()+
                "\nFornecedor: " +getFornecedor()+
                "\nTipo: " +getTipo()+
                "\nPreço compra: " +getPrecoCompra()+
                "\nPreço venda: " +getPrecoVenda()+
                "\nQuantidade estoque: " +getQtdeEstoque()
        );
        System.out.println();
    }
}
