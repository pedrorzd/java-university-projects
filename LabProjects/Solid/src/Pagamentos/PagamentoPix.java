package Pagamentos;

public class PagamentoPix implements Pagamentos{

    private String idCliente;
    private String idPagamento;
    private String nomeCliente;
    private String dataPagamento;

    public PagamentoPix(String idCliente, String idPagamento, String nomeCliente, String dataPagamento) {
        this.idCliente = idCliente;
        this.idPagamento = idPagamento;
        this.nomeCliente = nomeCliente;
        this.dataPagamento = dataPagamento;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public void pagamentoPix() {
        System.out.println("Pagamento com Pix realizado com sucesso!");
    }

    @Override
    public void pagamentoCartao() {}
}
