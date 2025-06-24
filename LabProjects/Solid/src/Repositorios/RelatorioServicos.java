package Repositorios;

import Diario.Pedidos;

import java.util.ArrayList;
import java.util.List; // É uma boa prática usar a interface List

public class RelatorioServicos {
    private RelatorioServicos() {}

    public static ArrayList<String> gerarRelatorio(List<Pedidos> listaDePedidos) {
        ArrayList<String> relatorio = new ArrayList<>();
        relatorio.add("------ RELATÓRIO DE SERVIÇOS ------");
        for (Pedidos pedido : listaDePedidos) {
            // 3. Adiciona as informações corretas e com rótulos para melhor leitura.
            relatorio.add("ID do Pedido: " + pedido.getIdPedido()); // Corrigido para usar o ID do pedido
            relatorio.add("ID do Cliente: " + pedido.getIdCliente());
            relatorio.add("Data do Pedido: " + pedido.getDataPedido());
            relatorio.add("Valor do Pedido: R$ " + String.format("%.2f", pedido.getValorPedido())); // Formatando o valor
            relatorio.add("Forma de Pagamento: " + pedido.getFormaPagamento());
            relatorio.add("-----------------------------------");
        }

        return relatorio;
    }
    public static void imprimirRelatorioConsole(List<Pedidos> listaDePedidos) {
        ArrayList<String> relatorio = gerarRelatorio(listaDePedidos);
        for (String linha : relatorio) {
            System.out.println(linha);
        }
    }
}