package Entities;

import javax.swing.*;

public class Apartamentos {
    Garagem vaga;
    Morador morador;
private int numeroApartamento;
private int quantQuartos;
private double metrosQuadrados;
private int quantVagas;
private int numeroVaga;
private int idMorador;

public Apartamentos(int numeroApartamento, int quantQuartos, double metrosQuadrados, int quantVagas, int numeroVaga, int idMorador, Garagem vaga, Morador morador ) {
  this.numeroApartamento = numeroApartamento;
  this.quantQuartos = quantQuartos;
  this.metrosQuadrados = metrosQuadrados;
  this.quantVagas = quantVagas;
  this.numeroVaga = vaga.getNumeroVaga();
  this.idMorador = morador.getId();
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public int getQuantQuartos() {
        return quantQuartos;
    }

    public double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public int getQuantVagas() {
        return quantVagas;
    }

    public void setQuantVagas(int quantVagas) {
        this.quantVagas = quantVagas;
    }

    public int getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(int numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public int getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(int idMorador) {
        this.idMorador = idMorador;
    }

    public void dadosApartamento(){
        JOptionPane.showInputDialog(null,
                "\nNúmero apartamento: "+ getNumeroApartamento()+
                "\nQuantidade quartos: "+getQuantQuartos()+
                "\nMetros Quadrados: "+getMetrosQuadrados()+
                "\nQuantidade de vagas: "+getQuantVagas()+
                "\nNúmero vaga(s): "+getNumeroVaga()+
                "\nId do Morador: "+getIdMorador()
        );
    }
}
