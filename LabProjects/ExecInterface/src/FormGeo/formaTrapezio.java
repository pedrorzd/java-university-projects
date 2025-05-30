package FormGeo;

import Interface.formasGeo;

public class formaTrapezio implements formasGeo {
    private String nomeForma;
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public formaTrapezio(String nomeForma, double baseMaior, double baseMenor, double altura) {
        this.nomeForma = nomeForma;
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void calculaArea(double baseMaior, double baseMenor, double altura) {
        double area = ((getBaseMaior()*getBaseMenor())*getAltura())/2;
        System.out.println("\n");
        System.out.printf(
                "Nome forma: " + getNomeForma()
                        + "\nBase maior: " + getBaseMaior()
                        + "\nBase menor: " + getBaseMenor()
                        + "\nAltura: " +getAltura()
                        + "\nArea: " + area
        );
    }
}
