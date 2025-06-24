import Diario.Pedidos;
import Pagamentos.PagamentoCartao;
import Pagamentos.PagamentoPix;
import Pessoas.ClientesRegular;
import Pessoas.ClientesVip;
import Repositorios.RelatorioServicos;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ClientesRegular cliente1 = new ClientesRegular("CR001", "João Silva", "31988887777", "Rua das Acácias, 123 - Belo Horizonte");
        ClientesRegular cliente2 = new ClientesRegular("CR002", "Maria Oliveira", "31999996666", "Av. Amazonas, 456 - Contagem");
        ClientesRegular cliente3 = new ClientesRegular("CR003", "Carlos Souza", "31977775555", "Rua das Flores, 789 - Betim");
        ClientesRegular cliente4 = new ClientesRegular("CR004", "Ana Costa", "31966664444", "Rua Paraná, 321 - BH Centro");

        ClientesVip vip1 = new ClientesVip("CV001", "Fernanda Lima", "12345678901", "31988881111", "fernanda.lima@email.com", "Rua do Sol, 100 - Nova Lima");
        ClientesVip vip2 = new ClientesVip("CV002", "Ricardo Gomes", "98765432100", "31977772222", "ricardo.gomes@email.com", "Av. Cristóvão Colombo, 1500 - BH");
        ClientesVip vip3 = new ClientesVip("CV003", "Juliana Alves", "45678912345", "31966663333", "juliana.alves@email.com", "Rua Tupis, 700 - Belo Horizonte");
        ClientesVip vip4 = new ClientesVip("CV004", "Marcelo Rocha", "65432198700", "31955554444", "marcelo.rocha@email.com", "Rua Goiás, 80 - Savassi");

        PagamentoCartao pagamento1 = new PagamentoCartao("CV001", "PG001", "CART001", "Fernanda Lima", "2025-06-20");
        PagamentoCartao pagamento3 = new PagamentoCartao("CV003", "PG003", "CART003", "Juliana Alves", "2025-06-22");

        PagamentoPix pix1 = new PagamentoPix("CR002", "PG005", "João Silva", "2025-06-20");
        PagamentoPix pix2 = new PagamentoPix("CR004", "PG008", "Marcelo Rocha", "2025-06-23");

        Pedidos pedido1 = new Pedidos("PD001", "CV001", "PR001", "2025-06-20", "Compra de camisa social", vip1.valorDesconto(149.90), "Cartão");
        Pedidos pedido2 = new Pedidos("PD002", "CR002", "PR002", "2025-06-21", "Compra de calça jeans", 199.50, "Pix");

        Pedidos pedido3 = new Pedidos("PD003", "CV003", "PR003", "2025-06-22", "Compra de jaqueta", vip3.valorDesconto(299.90), "Cartão");
        Pedidos pedido4 = new Pedidos("PD004", "CR004", "PR004", "2025-06-23", "Compra de tênis esportivo", 249.00, "Pix");

        ArrayList<Pedidos> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);

        ArrayList<String> relatorioFinal = RelatorioServicos.gerarRelatorio(pedidos);
        System.out.println("Relatório gerado em formato de lista. A lista contém " + relatorioFinal.size() + " linhas.");
        System.out.println("\n==========================================\n");

        RelatorioServicos.imprimirRelatorioConsole(pedidos);

    }
}