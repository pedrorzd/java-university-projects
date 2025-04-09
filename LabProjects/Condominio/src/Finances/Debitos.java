package Finances;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import Entities.Apartamentos;

public class Debitos {
    private Apartamentos apartamento;
    private double valorDebito;
    private String descricaoDebito;

    public Debitos(Apartamentos apartamento, double valorDebito, String descricaoDebito) {
        this.apartamento = apartamento;
        this.valorDebito = valorDebito;
        this.descricaoDebito = descricaoDebito;
    }

    public Apartamentos getApartamento() {
        return this.apartamento;
    }

    public void setApartamento(Apartamentos apartamento) {
        this.apartamento = apartamento;
    }

    public double getValorDebito() {
        return this.valorDebito;
    }

    public void setValorDebito(double valorDebito) {
        this.valorDebito = valorDebito;
    }

    public String getDescricaoDebito() {
        return this.descricaoDebito;
    }

    public void setDescricaoDebito(String descricaoDebito) {
        this.descricaoDebito = descricaoDebito;
    }

}
