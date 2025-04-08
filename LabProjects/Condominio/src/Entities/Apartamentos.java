package Entities;

import javax.swing.*;

public class Apartamentos {

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

    Morador m1 = new Morador(1, "Lucas Andrade", 28, "123.456.789-01", "(31) 91111-1111", true);
    Morador m2 = new Morador(2, "Fernanda Lima", 34, "234.567.890-12", "(31) 92222-2222", false);
    Morador m3 = new Morador(3, "Bruno Costa", 41, "345.678.901-23", "(31) 93333-3333", true);
    Morador m4 = new Morador(4, "Juliana Martins", 25, "456.789.012-34", "(31) 94444-4444", true);
    Morador m5 = new Morador(5, "Ricardo Alves", 37, "567.890.123-45", "(31) 95555-5555", false);
    Morador m6 = new Morador(6, "Marina Rocha", 30, "678.901.234-56", "(31) 96666-6666", true);
    Morador m7 = new Morador(7, "Thiago Moura", 45, "789.012.345-67", "(31) 97777-7777", false);
    Morador m8 = new Morador(8, "Aline Ferreira", 32, "890.123.456-78", "(31) 98888-8888", true);
    Morador m9 = new Morador(9, "Gabriel Pinto", 27, "901.234.567-89", "(31) 99999-9999", true);
    Morador m10 = new Morador(10, "Patrícia Melo", 39, "012.345.678-90", "(31) 91010-1010", false);


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
