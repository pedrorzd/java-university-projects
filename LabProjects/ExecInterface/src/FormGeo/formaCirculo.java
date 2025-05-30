package FormGeo;

import Interface.formasGeo;

public class formaCirculo implements formasGeo {
    private String nomeForma;
    private double raio;

    public formaCirculo(String nomeForma, double raio) {
        this.nomeForma = nomeForma;
        this.raio = raio;
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public double getPi() {
        return Math.PI;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void calculaArea(double raio, double pi) {
        double area = Math.pow(getRaio(), 2) * getPi();
        System.out.println("\n");
        System.out.printf(
                "Nome forma: " + getNomeForma()
                + "\nRaio: " + getRaio()
                + "\nArea: %.2f", area
        );
    }


}
