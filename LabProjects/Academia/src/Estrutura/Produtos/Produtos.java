package Estrutura.Produtos;

public class Produtos {
    private int codeProdutos;
    private String nomeProduto;
    private int quantidade;
    private String ultimaCompra;
    private double preco;


    public int getCodeProdutos() {
        return codeProdutos;
    }

    public void setCodeProdutos(int codeProdutos) {
        this.codeProdutos = codeProdutos;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(String ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "\nProduto: \n"+
                "\nCodigo: " + getCodeProdutos()+
                "\nNome Produto: " + getNomeProduto()+
                "\nQuantidade: " + getQuantidade()+
                "\nUltima Compra: "+ getUltimaCompra()+
                "\nPreço: "+getPreco();

    }

}
