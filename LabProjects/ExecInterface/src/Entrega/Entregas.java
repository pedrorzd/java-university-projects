package Entrega;

import Interface.Notificacao;
import Interface.Transporte;

public class Entregas implements Transporte {
    private String appUsado;
    private String idEntrega;
    private String nomeEntegador;
    private String dataEntrega;
    private String veiculoEntregador;
    private String enderecoEntrega;
    private String distancia;

    public Entregas(String appUsado, String idEntrega, String nomeEntegador, String dataEntrega, String veiculoEntregador, String enderecoEntrega, String distancia) {
        this.appUsado = appUsado;
        this.idEntrega = idEntrega;
        this.nomeEntegador = nomeEntegador;
        this.dataEntrega = dataEntrega;
        this.veiculoEntregador = veiculoEntregador;
        this.enderecoEntrega = enderecoEntrega;
        this.distancia = distancia;
    }

    public String getAppUsado() {
        return appUsado;
    }

    public String getIdEntrega() {
        return idEntrega;
    }

    public String getNomeEntegador() {
        return nomeEntegador;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public String getVeiculoEntregador() {
        return veiculoEntregador;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public String getDistancia() {
        return distancia;
    }

    public void entrega(String appUsado, String idEntrega, String nomeEntegador, String dataEntrega, String veiculoEntregador, String enderecoEntrega, String distancia){
        Transporte.entrega(getAppUsado(),getIdEntrega(),getNomeEntegador(),getDataEntrega(),getVeiculoEntregador(),getEnderecoEntrega(),getDistancia());
    }
}
