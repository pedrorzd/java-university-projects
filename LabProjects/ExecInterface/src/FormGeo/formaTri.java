package FormGeo;

import Interface.formasGeo;

public class formaTri implements formasGeo {
    private String nomeForma;
    private double largura;
    private double altura;

    public formaTri(String nomeForma, double largura, double altura) {
        this.nomeForma = nomeForma;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calculaArea(double largura, double altura) {
    }
}
