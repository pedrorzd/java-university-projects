package FormGeo;

import Interface.formasGeo;

public class formaRetangulo implements formasGeo {
    private String nomeForma;
    private double largura;
    private double altura;

    public formaRetangulo(String nomeForma, double largura, double altura) {
        this.nomeForma = nomeForma;
        this.largura = largura;
        this.altura = altura;
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public void setNomeForma(String nomeForma) {
        this.nomeForma = nomeForma;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calculaArea(double largura, double altura) {
        double area = getAltura() * getLargura();
        System.out.println("\n");
        System.out.printf(
                "Nome forma: " + getNomeForma()
                + "\nAltura: " + getAltura()
                + "\nLargura: " + getLargura()
                + "\nArea: " + area
        );
    }
}
