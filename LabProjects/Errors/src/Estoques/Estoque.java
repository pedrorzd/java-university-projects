package Estoques;

import Exceptions.EiExceptions;

public class Estoque {
    private int codProduto;
    private int qtdeEstoque;


    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void decrementaEstoque(int qtde) throws EiExceptions{
        if (qtdeEstoque >= qtde){
            qtdeEstoque += -qtde;
        } else{
            throw new EiExceptions(codProduto, qtdeEstoque);
        }
    }
}
