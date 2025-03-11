package Entities;

public class Pizzas {
    private String sabor;
    private String massas;
    private int fatias;
    private Boolean vegie;

    public String getSabor() {
        return sabor;
    }

    public String setSabor(String sabor) {
        return this.sabor = sabor;
    }

    public String getMassas() {
        return massas;
    }

    public String setMassas(String massas) {
        return this.massas = massas;
    }

    public int getFatias() {
        return fatias;
    }

    public int setFatias(int fatias) {
        return this.fatias = fatias;
    }

    public Boolean getVegie() {
        return vegie;
    }

    public Boolean setVegie(Boolean vegie) {
        return this.vegie = vegie;
    }

    public void imprimir() {
        System.out.println(
                "Sbor: " + getSabor() + "\n" +
                        "Tipo da massa: " + getMassas() + "\n" +
                        "Fatias: " + getFatias() + "\n" +
                        "Vegana? " + getVegie() + "\n"
        );
    }
}


