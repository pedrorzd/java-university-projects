package App.Model.Management.Finances;

public class Entrance {
    private int idRegistroEntrada;
    private String dataEntrada;
    private double valorEntrada;
    private int idPagador;
    private int idServicoPrestado;

    public Entrance(int idRegistroEntrada, String dataEntrada, double valorEntrada, int idPagador, int idServicoPrestado) {
        this.idRegistroEntrada = idRegistroEntrada;
        this.dataEntrada = dataEntrada;
        this.valorEntrada = valorEntrada;
        this.idPagador = idPagador;
        this.idServicoPrestado = idServicoPrestado;
    }

    public int getIdRegistroEntrada() {
        return idRegistroEntrada;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public int getIdPagador() {
        return idPagador;
    }

    public int getIdServicoPrestado() {
        return idServicoPrestado;
    }

    @Override
    public String toString() {
        return "Entrada \n" +
                "idRegistroEntrada: " + idRegistroEntrada +
                ", Data Entrada: '" + dataEntrada +
                ", Valor entrada: " + valorEntrada +
                ", idPagador: " + idPagador +
                ", idServicoPrestado: " + idServicoPrestado;
    }
}
