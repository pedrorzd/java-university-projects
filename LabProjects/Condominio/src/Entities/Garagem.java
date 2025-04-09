package Entities;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Garagem {
    private int numeroVaga;
    private double metroQuadrado;
    private boolean vagaOcupada;

    public Garagem(int numeroVaga, double metroQuadrado, boolean vagaOcupada) {
        this.numeroVaga = numeroVaga;
        this.metroQuadrado = metroQuadrado;
        this.vagaOcupada = vagaOcupada;
    }

    public int getNumeroVaga() {
        return this.numeroVaga;
    }

    public void setNumeroVaga(int numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public double getMetroQuadrado() {
        return this.metroQuadrado;
    }

    public void setMetroQuadrado(double metroQuadrado) {
        this.metroQuadrado = metroQuadrado;
    }

    public boolean isVagaOcupada() {
        return this.vagaOcupada;
    }

    public void setVagaOcupada(boolean vagaOcupada) {
        this.vagaOcupada = vagaOcupada;
    }

}
