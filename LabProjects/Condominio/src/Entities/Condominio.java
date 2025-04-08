package Entities;

import javax.swing.*;

public class Condominio {
    Apartamentos apartamentos;
    Morador morador;
    Garagem garagem;
    Colaboradores colaboradores;
    private String telefone;
    private double valorCondominio;
    private double debitosTotais;
    private double pagamentosTotais;

    Apartamentos a101 = new Apartamentos(101, 2, 65.0, 1, garagem.getNumeroVaga(), morador.getId(), garagem, morador);
    Apartamentos a102 = new Apartamentos(102, 3, 75.0, 1, garagem.getNumeroVaga(), morador.getId(), garagem, morador);
    Apartamentos a201 = new Apartamentos(201, 2, 68.5, 1, garagem.getNumeroVaga(), morador.getId() ,garagem, morador);
    Apartamentos a202 = new Apartamentos(202, 2, 70.0, 1, garagem.getNumeroVaga(), morador.getId() ,garagem, morador);
    Apartamentos a301 = new Apartamentos(301, 3, 80.0, 1, garagem.getNumeroVaga(), morador.getId() ,garagem, morador);
    Apartamentos a302 = new Apartamentos(302, 2, 67.0, 1, garagem.getNumeroVaga(), morador.getId() ,garagem, morador);
    Apartamentos a401 = new Apartamentos(401, 3, 85.0, 1, garagem.getNumeroVaga(), morador.getId() ,garagem, morador);
    Apartamentos a402 = new Apartamentos(402, 2, 72.0, 1, garagem.getNumeroVaga(), morador.getId() ,garagem, morador);
    Apartamentos a501 = new Apartamentos(501, 2, 66.0, 1, garagem.getNumeroVaga(), morador.getId() ,garagem, morador);
    Apartamentos a502 = new Apartamentos(502, 3, 78.0, 1, garagem.getNumeroVaga(), morador.getId(), garagem, morador);

    Garagem g1 = new Garagem(1, 12.5, false);
    Garagem g2 = new Garagem(2, 13.0, true);
    Garagem g3 = new Garagem(3, 11.8, false);
    Garagem g4 = new Garagem(4, 14.2, true);
    Garagem g5 = new Garagem(5, 12.0, false);
    Garagem g6 = new Garagem(6, 13.5, true);
    Garagem g7 = new Garagem(7, 12.3, false);
    Garagem g8 = new Garagem(8, 11.9, true);
    Garagem g9 = new Garagem(9, 13.1, false);
    Garagem g10 = new Garagem(10, 14.0, true);

    Colaboradores c1 = new Colaboradores(
            1,
            "João Silva",
            "123.456.789-00",
            "(31) 98765-4321",
            "joao.silva@empresa.com",
            1800.00 // Porteiro
    );

    Colaboradores c2 = new Colaboradores(
            2,
            "Maria Oliveira",
            "234.567.890-11",
            "(31) 99876-5432",
            "maria.oliveira@empresa.com",
            1800.00 // Porteira
    );

    Colaboradores c3 = new Colaboradores(
            3,
            "Carlos Souza",
            "345.678.901-22",
            "(31) 91234-5678",
            "carlos.souza@empresa.com",
            1800.00 // Porteiro
    );

    Colaboradores c4 = new Colaboradores(
            4,
            "Ana Paula",
            "456.789.012-33",
            "(31) 92345-6789",
            "ana.paula@empresa.com",
            1800.00 // Porteira
    );

    Colaboradores c5 = new Colaboradores(
            5,
            "José Ferreira",
            "567.890.123-44",
            "(31) 93456-7890",
            "jose.ferreira@empresa.com",
            2000.00 // Serviços Gerais
    );


    public Apartamentos getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamentos apartamentos) {
        this.apartamentos = apartamentos;
    }

    public Morador getMorador() {
        return morador;
    }

    public Garagem getGaragem() {
        return garagem;
    }

    public void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public String getTelefone() {
        return telefone;
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

    public Colaboradores getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(Colaboradores colaboradores) {
        this.colaboradores = colaboradores;
    }

    public void dadosCondominio() {
        JOptionPane.showMessageDialog(null, "Dados do Condominio:" +
                "\nApartamentos:  " +getApartamentos()+
                "\nMorador: " + getMorador()+
                "\nGaragem: " + getGaragem()+
                "\nColaboradores:  " +getColaboradores()+
                "\nTelefone: " + getTelefone()+
                "\nDebitos do Condominio: " +getDebitosTotais()+
                "\nPagamentos totais: " +getPagamentosTotais()
                );
    }
}
