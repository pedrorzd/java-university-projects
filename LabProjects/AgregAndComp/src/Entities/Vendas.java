package Entities;

import java.text.DateFormat;
import java.util.Date;

public class Vendas {
    private int codigo;
    private String diaVenda;
    Clientes cliente1;
    Produtos produto1;

    public Vendas(int codigo, String diaVenda, Clientes cliente1, Produtos produto1){
        this.codigo = codigo;
        this.diaVenda = diaVenda;
        this.cliente1 = cliente1;
        this.produto1 = produto1;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDiaVenda() {
        return diaVenda;
    }
    public void setDiaVenda(String diaVenda) {
        this.diaVenda = diaVenda;
    }
    public Clientes getCliente1() {
        return cliente1;
    }
    public void setCliente1(Clientes cliente1) {
        this.cliente1 = cliente1;
    }
    public Produtos getProduto1() {
        return produto1;
    }
    public void setProduto1(Produtos produto1) {
        this.produto1 = produto1;
    }

    public void efetuaVenda(){
        System.out.println(
                "\nNome do Cliente: "+cliente1.getNome()+
                "\nDescrição produto: "+produto1.getDescricao()+
                "\nPreco produto: "+produto1.getPreco()+
                "\nCódigo venda: "+getCodigo()+
                "\nData venda: "+getDiaVenda()
        );
    }

    public static void main(String[] args){
        Produtos produto1 = new Produtos(1,"Mouse s/fio", 123.99);
        Clientes cliente1 = new Clientes(11, "Jailson Costa");
        Date dataVenda = new Date();
        String dataToString = DateFormat.getInstance().format(dataVenda);
        Vendas venda1 = new Vendas(200, dataToString, cliente1, produto1);
        venda1.efetuaVenda();
    }
}
