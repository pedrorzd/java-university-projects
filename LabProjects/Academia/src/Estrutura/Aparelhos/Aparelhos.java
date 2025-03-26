package Estrutura.Aparelhos;

import java.util.Date;

public class Aparelhos {
    private int codeAparelho;
    private String nome;
    private boolean possuiPeso;
    private double pesoMaximo;
    private String dataCompra;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodeAparelho() {
        return codeAparelho;
    }

    public void setCodeAparelho(int codeAparelho) {
        this.codeAparelho = codeAparelho;
    }

    public boolean getPossuiPeso() {
        return possuiPeso;
    }

    public void setPossuiPeso(boolean possuiPeso) {
        this.possuiPeso = possuiPeso;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String toString() {
        return "\nAparelho: \n" +
                "\ncodeAparelho:" + getCodeAparelho() +
                "\nNome: " + getNome() +
                "\nPossui Peso: " + getPossuiPeso() +
                "\nPeso Maximo: " + getPesoMaximo() +
                "\nData Aquisição: " + getDataCompra();

    }



}
