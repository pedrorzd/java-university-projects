package Finances;


import java.time.LocalDate;

public class Boletos {
    private int idBoleto;
    private double valor;
    private String dataVencimento;
    private boolean pago;

    public Boletos(int idBoleto, double valor, boolean pago) {
        this.idBoleto = idBoleto;
        this.valor = valor;
        this.pago = pago;
    }

    public int getIdBoleto() {
        return this.idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        LocalDate hoje = LocalDate.now();
        LocalDate vencimento = hoje.plusDays(30);
        return vencimento.toString();
    }

    public boolean isPago() {
        return this.pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

}
