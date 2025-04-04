package Entities;

import javax.swing.*;

public class Garagem {
    private int numeroVaga;
    private double metroQuadrado;
    private boolean vagaOcupada;

    public Garagem(int numeroVaga, double metroQuadrado, boolean vagaOcupada){
        this.numeroVaga = numeroVaga;
        this.metroQuadrado = metroQuadrado;
        this.vagaOcupada = vagaOcupada;
    }

    public int getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(int numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public double getMetroQuadrado() {
        return metroQuadrado;
    }

    public void setMetroQuadrado(double metroQuadrado) {
        this.metroQuadrado = metroQuadrado;
    }

    public boolean isVagaOcupada() {
        return vagaOcupada;
    }

    public void setVagaOcupada(boolean vagaOcupada) {
        this.vagaOcupada = vagaOcupada;
    }

    public void dadosGaragem(){
        JOptionPane.showInputDialog(null,
                "\nNúmero vaga: "+ getNumeroVaga()+
                        "\nTamanho : "+getMetroQuadrado()+"m²"+
                        "\nA vaga está ocupada? "+isVagaOcupada()
                        );
    }
}
