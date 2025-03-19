package Administrativo;

public class Pagamentos {
    private int id;
    private String tipo;
    private String dataPagamento;
    private String favorecido;
    private double valorPago;

    public Pagamentos(int id, String tipo, String dataPagamento,String favorecido, double valorPago){
        this.id = id;
        this.tipo = tipo;
        this.dataPagamento = dataPagamento;
        this.favorecido = favorecido;
        this.valorPago = valorPago;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public String getFavorecido() {
        return favorecido;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void Imprimir(){
        System.out.print(
                "\nID: " +getId()+
                        "\nTipo: " +getTipo()+
                        "\nData pagamento: " +getDataPagamento()+
                        "\nFavorecido: " +getFavorecido()+
                        "\nValor pago: " +getValorPago()
        );
    }

}
