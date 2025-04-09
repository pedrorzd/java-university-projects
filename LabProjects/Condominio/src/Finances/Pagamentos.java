package Finances;

import Entities.Apartamentos;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Pagamentos {
    private Apartamentos apartamento;
    private double valorBoleto;
    private String dataPagamento;

    public Pagamentos(Apartamentos apartamento, double valorBoleto, String dataPagamento) {
        this.apartamento = apartamento;
        this.valorBoleto = valorBoleto;
        this.dataPagamento = dataPagamento;
    }

    public Apartamentos getApartamento() {
        return this.apartamento;
    }

    public void setApartamento(Apartamentos apartamento) {
        this.apartamento = apartamento;
    }

    public double getValorBoleto() {
        return this.valorBoleto;
    }

    public void setValorBoleto(double valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    public String getDataPagamento() {
        return this.dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

}
