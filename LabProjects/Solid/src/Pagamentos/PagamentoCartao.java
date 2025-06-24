package Pagamentos;

public class PagamentoCartao implements Pagamentos {
    private String idCliente;
    private String idPagamento;
    private String idCartao;
    private String nomeCliente;
    private String dataPagamento;

    public PagamentoCartao(String idCliente, String idPagamento, String idCartao, String nomeCliente, String dataPagamento) {
        this.idCliente = idCliente;
        this.idPagamento = idPagamento;
        this.idCartao = idCartao;
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

    public String getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(String idCartao) {
        this.idCartao = idCartao;
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
        System.out.println();
    }

    @Override
    public void pagamentoCartao() {
        System.out.println("Pagamento no cartão realizado com sucesso");
    }
}
