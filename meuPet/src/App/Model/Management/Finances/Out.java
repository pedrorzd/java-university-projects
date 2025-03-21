package App.Model.Management.Finances;

public class Out {
    private int idRegistroSaida;
    private String dataSaida;
    private double valorSaida;
    private int idFavorecido;

    public Out(int idRegistroSaida, String dataSaida, double valorSaida, int idFavorecido) {
        this.idRegistroSaida = idRegistroSaida;
        this.dataSaida = dataSaida;
        this.valorSaida = valorSaida;
        this.idFavorecido = idFavorecido;
    }

    public int getIdRegistroSaida() {
        return idRegistroSaida;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public int getIdFavorecido() {
        return idFavorecido;
    }

    @Override
    public String toString() {
        return "Saídas :" +
                "idRegistroSaida: " + idRegistroSaida +
                ", Data Saída: '" + dataSaida  +
                ", Valor Sáida: " + valorSaida +
                ", idFavorecido: " + idFavorecido;
    }
}
