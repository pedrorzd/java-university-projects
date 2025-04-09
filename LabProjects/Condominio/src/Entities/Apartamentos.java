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
    private int numeroVaga;
    private int idMorador;

    public Apartamentos(int numeroApartamento, int quantQuartos, double metrosQuadrados, int quantVagas, int numeroVaga, int idMorador, Garagem vaga, Morador morador) {
        this.numeroApartamento = numeroApartamento;
        this.quantQuartos = quantQuartos;
        this.metrosQuadrados = metrosQuadrados;
        this.quantVagas = quantVagas;
        this.numeroVaga = vaga.getNumeroVaga();
        this.idMorador = morador.getId();
    }

    public int getNumeroApartamento() {
        return this.numeroApartamento;
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

    public int getNumeroVaga() {
        return this.numeroVaga;
    }

    public void setNumeroVaga(int numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public int getIdMorador() {
        return this.idMorador;
    }

    public void setIdMorador(int idMorador) {
        this.idMorador = idMorador;
    }

}
