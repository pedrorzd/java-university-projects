package Finances;

import Entities.Apartamentos;
import Entities.Condominio;
import Entities.Morador;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Boletos {
    private int idBoleto;
    private double valor;
    private String dataVencimento;
    private boolean pago;

    public Boletos(int idBoleto, double valor, String dataVencimento, boolean pago) {
        this.idBoleto = idBoleto;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.pago = pago;
    }

    public int getIdBoleto() {
        return this.idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return this.pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

}
