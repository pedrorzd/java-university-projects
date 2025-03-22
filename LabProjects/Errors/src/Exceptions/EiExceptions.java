package Exceptions;

public class EiExceptions extends Exception {
    private int codProd;
    private int qtdeEst;

    public EiExceptions(){
        super("Estoque Insuficiente!");
    }

    public EiExceptions(int cod, int qtde){
        super ("Estoque Insuficiente!");
        codProd = cod;
        qtdeEst = qtde;
    }

    public int getCodProd() {
        return codProd;
    }

    public int getQtdeEst() {
        return qtdeEst;
    }
}
