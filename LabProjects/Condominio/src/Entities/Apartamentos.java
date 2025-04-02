package Entities;

import javax.swing.*;

public class Apartamentos {
    Garagem vaga1;
    Morador morador1;
private int numeroApartamento;
private int quantQuartos;
private double metrosQuadrados;
private int quantVagas;
private int numeroVaga;
private int idMorador;

public Apartamentos(int numeroApartamento, int quantQuartos, double metrosQuadrados, int quantVagas, int numeroVaga, int idMorador ){
  this.numeroApartamento = numeroApartamento;
  this.quantQuartos = quantQuartos;
  this.metrosQuadrados = metrosQuadrados;
  this.quantVagas = quantVagas;
  this.numeroVaga = vaga1.getNumeroVaga();
  this.idMorador = morador1.getId();
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
