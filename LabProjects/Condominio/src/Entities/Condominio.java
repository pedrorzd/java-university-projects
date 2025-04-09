package Entities;

import Finances.Debitos;
import Finances.Pagamentos;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Condominio {
    private Apartamentos apartamentos;
    private Morador morador;
    private Garagem vaga;
    private Pagamentos pagamentos;
    private Debitos debitos;
    private double debitosTotais;
    private double pagamentosTotais;

    public Condominio() {
    }

    public Apartamentos getApartamentos() {
        return this.apartamentos;
    }

    public void setApartamentos(Apartamentos apartamentos) {
        this.apartamentos = apartamentos;
    }

    public Morador getMorador() {
        return this.morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Garagem getVaga() {
        return this.vaga;
    }

    public void setVaga(Garagem vaga) {
        this.vaga = vaga;
    }

    public Pagamentos getPagamentos() {
        return this.pagamentos;
    }

    public void setPagamentos(Pagamentos pagamentos) {
        this.pagamentos = pagamentos;
    }

    public Debitos getDebitos() {
        return this.debitos;
    }

    public void setDebitos(Debitos debitos) {
        this.debitos = debitos;
    }

    public double getDebitosTotais() {
        return this.debitosTotais;
    }

    public void setDebitosTotais(double debitosTotais) {
        this.debitosTotais = debitosTotais;
    }

    public double getPagamentosTotais() {
        return this.pagamentosTotais;
    }

    public void setPagamentosTotais(double pagamentosTotais) {
        this.pagamentosTotais = pagamentosTotais;
    }

}
