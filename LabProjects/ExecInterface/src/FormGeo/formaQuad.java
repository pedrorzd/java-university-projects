package FormGeo;

import Interface.formasGeo;

public class formaQuad implements formasGeo {
    private String nomeForma;
    private double largura;
    private double altura;

    public formaQuad(String nomeForma, double largura, double altura) {
        this.nomeForma = nomeForma;
        this.largura = largura;
        this.altura = altura;
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void calculaArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("\n");
        System.out.printf(
                "Nome forma: " + getNomeForma()
                + "\nAltura: " + getAltura()
                + "cm\nLargura: " + getLargura()
                + "cm \nArea: %.2f cm²", area
        );
    }
    @Override
    public void calculaAreaTrapezio(double baseMaior, double baseMenor, double altura) {}
}
