package Entities;

import javax.swing.*;
import java.awt.*;

public class Apartamentos {
    Garagem vaga;
    Morador morador;
    private int numeroApartamento;
    private int quantQuartos;
    private double metrosQuadrados;
    private int quantVagas;

    public Apartamentos(int numeroApartamento, int quantQuartos, double metrosQuadrados, int quantVagas, Garagem vaga, Morador morador) {
        this.numeroApartamento = numeroApartamento;
        this.quantQuartos = quantQuartos;
        this.metrosQuadrados = metrosQuadrados;
        this.quantVagas = quantVagas;
        this.vaga = vaga;
        this.morador = morador;
    }

    public int getNumeroApartamento() {
        return this.numeroApartamento;
    }

    public Garagem getVaga() {
        return vaga;
    }

    public void setVaga(Garagem vaga) {
        this.vaga = vaga;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public int getQuantQuartos() {
        return this.quantQuartos;
    }

    public double getMetrosQuadrados() {
        return this.metrosQuadrados;
    }

    public int getQuantVagas() {
        return this.quantVagas;
    }

    public void setQuantVagas(int quantVagas) {
        this.quantVagas = quantVagas;
    }


    @Override
    public String toString() {
        return "Apartamentos{" +
                "vaga=" + vaga +
                ", morador=" + morador +
                ", numeroApartamento=" + numeroApartamento +
                ", quantQuartos=" + quantQuartos +
                ", metrosQuadrados=" + metrosQuadrados +
                ", quantVagas=" + quantVagas +
                '}';
    }
}
