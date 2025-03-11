package Entities;

public class Products {
    private String productName;
    private double price;
    private int quantitie;

    public String getProductName() {
        return productName;
    }

    public String setProductName(String productName) {
        return this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        return this.price = price;
    }

    public int getQuantitie() {
        return quantitie;
    }

    public int setQuantitie(int quantitie) {
        return this.quantitie = quantitie;
    }
}
