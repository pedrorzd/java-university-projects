package Carros;

public class Saveiro {

    private String fabricante;
    private String modelo;
    private String cor;
    private String chassi;
    private String placa;
    private String anoFabricacao;
    private double preço;

    public Saveiro(String fabricante, String modelo, String cor, String chassi,
                String placa, String anoFabricacao, double preço) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.preço = preço;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void Rodas(){

    };
    public void Motor(){

    };
    public void Acessorios(){

    };
    public void Cambio(){

    };

}
