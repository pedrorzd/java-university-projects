package Entities;

import Finances.Debitos;
import Finances.Pagamentos;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Condominio {
    Apartamentos apartamentos;
    Morador morador;
    Garagem vaga;
    Pagamentos pagamentos;
    Debitos debitos;
    private double debitosTotais;
    private double pagamentosTotais;

    public Condominio() {}

    public Condominio(Apartamentos apartamentos, Morador morador, Garagem vaga, Pagamentos pagamentos, Debitos debitos) {
        this.apartamentos = apartamentos;
        this.morador = morador;
        this.vaga = vaga;
        this.pagamentos = pagamentos;
        this.debitos = debitos;
    }

    public Condominio(Apartamentos apartamentos, Morador morador, Garagem vaga, Pagamentos pagamentos) {
        this.apartamentos = apartamentos;
        this.morador = morador;
        this.vaga = vaga;
        this.pagamentos = pagamentos;
    }

    public Condominio(Apartamentos apartamentos, Morador morador, Garagem vaga, Debitos debitos) {
        this.apartamentos = apartamentos;
        this.morador = morador;
        this.vaga = vaga;
        this.debitos = debitos;
    }

    public Condominio(Apartamentos apartamentos, Morador morador, Garagem vaga) {
        this.apartamentos = apartamentos;
        this.morador = morador;
        this.vaga = vaga;
    }

    public Apartamentos getApartamentos() {
        return apartamentos;
    }

    public Morador getMorador() {
        return morador;
    }

    public Garagem getVaga() {
        return vaga;
    }

    public Pagamentos getPagamentos() {
        return pagamentos;
    }

    public Debitos getDebitos() {
        return debitos;
    }

    public double getDebitosTotais() {
        return debitosTotais;
    }

    public void setDebitosTotais(double debitosTotais) {
        this.debitosTotais = debitosTotais;
    }

    public double getPagamentosTotais() {
        return pagamentosTotais;
    }

    public void setPagamentosTotais(double pagamentosTotais) {
        this.pagamentosTotais = pagamentosTotais;
    }
}
