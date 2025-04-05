package Entities;

import javax.swing.*;

public class Condominio {
    Apartamentos apartamentos;
    Morador morador;
    Garagem vaga;
    private double debitosTotais;
    private double pagamentosTotais;


    public Apartamentos getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamentos apartamentos) {
        this.apartamentos = apartamentos;
    }

    public Morador getMorador() {
        return morador;
    }

    public Garagem getVaga() {
        return vaga;
    }

    public void setVaga(Garagem vaga) {
        this.vaga = vaga;
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

    public void dadosCondominio() {
        JOptionPane.showMessageDialog(null, "Dados do Condominio:" +
                "\nApartamentos:  " +getApartamentos()+
                "\nMorador: " + getMorador()+
                "\nGaragem: " + getVaga()+
                "\nDebitos do Condominio: " +getDebitosTotais()+
                "\nPagamentos totais: " +getPagamentosTotais()
                );
    }
}
