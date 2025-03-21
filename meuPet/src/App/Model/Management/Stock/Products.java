package App.Model.Management.Stock;

public class Products {
    private int idProduto;
    private String description;
    private double price;
    private int quantity;
    private String ultimaCompra;

    public Products(int idProduto, String description, double price, int quantity, String ultimaCompra) {
        this.idProduto = idProduto;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.ultimaCompra = ultimaCompra;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUltimaCompra() {
        return ultimaCompra;
    }

    @Override
    public String toString() {
        return "Products: \n" +
                "idProduto: " + idProduto +
                ", Descrição: '" + description +
                ", Preço: " + price +
                ", Quantidade: " + quantity +
                ", Data de última compra: '" + ultimaCompra;
    }
}
