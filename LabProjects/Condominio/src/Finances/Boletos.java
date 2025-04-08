package Finances;

import Entities.Apartamentos;
import Entities.Condominio;
import Entities.Morador;

import javax.swing.*;
import java.util.Random;

public class Boletos {

    private Morador morador;
    private Apartamentos apartamento;
    private Condominio condominio;
    private String cpf;
    private String nome;
    private int numeroApartamento;
    private double valorCondominio;
    private String telefoneCondominio;
    private int numeroBoleto;

    public Boletos(String cpf, String nome, int numeroApartamento, double valorCondominio, String telefoneCondominio) {
        this.cpf = morador.getCpf();
        this.nome = morador.getNome();
        this.numeroApartamento = apartamento.getNumeroApartamento();
        this.valorCondominio = condominio.getValorCondominio();
        this.telefoneCondominio = condominio.getTelefone();
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public String getTelefoneCondominio() {
        return telefoneCondominio;
    }

    public int getNumeroBoleto() {
        Random random = new Random();
        return 100 + random.nextInt(1901); // 1901 = 2000 - 100 + 1
    }


    public void gerarBoleto(){
        JOptionPane.showInputDialog(null,
                "\nBOLETO PARA PAGAMENTO DE CONDOMINIO: "+
                "\nDados pagador: "+
                        "\nNúmero Boleto: "+getNumeroBoleto()+
                        "\nNome: "+getNome()+
                        "\nCPF: "+getCpf()+
                        "\nNúmero apartamento: "+getNumeroApartamento()+
                        "\nValor: R$ %.2f",getValorCondominio()+
                        "\nTelefone: "+getTelefoneCondominio()
        );
    }
}
