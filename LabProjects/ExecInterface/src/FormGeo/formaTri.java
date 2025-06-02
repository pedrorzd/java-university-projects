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
    public void calculaArea(double largura, double altura) {
        double area = getAltura() * getLargura();
        System.out.println("\n");
        System.out.printf(
                "Nome forma: " + getNomeForma()
                        + "\nAltura: " + getAltura()
                        + "cm\nLargura: " + getLargura()
                        + "cm\nArea: %.2f cm²", area
        );
        System.out.println("\n");
    }

    @Override
    public void calculaAreaTrapezio(double baseMaior, double baseMenor, double altura) {}
}
