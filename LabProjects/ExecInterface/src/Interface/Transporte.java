package Interface;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface Transporte {
    Date data = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    public static void entrega(String appUsado, String idEntrega, String nomeEntegador, String dataEntrega, String veiculoEntregador, String enderecoEntrega, String distancia) {

        System.out.println();
        System.out.println("Entrega Inciada");
        System.out.println(
                "Dados da Entrega: "+
                "\n App solicitado: " + appUsado
                + "\n ID pedido: " + idEntrega
                + "\n Nome entregador: " + nomeEntegador
                + "\n Data pedido: " + dataEntrega
                + "\n Veiculo: " + veiculoEntregador
                + "\n Distancia: " + distancia
                );

        System.out.println("CHEGANDO NO ENDEREÇO: " + enderecoEntrega);
        System.out.println("ENTREGA CONCLUIDA AS " + sdf.format(data));
        System.out.println();

    }
}
