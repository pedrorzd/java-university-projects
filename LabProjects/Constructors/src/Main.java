import Administrativo.Pagamentos;
import Administrativo.Pedidos;
import Administrativo.Produtos;
import Administrativo.Vendas;
import People.Clientes;
import People.Colaboradores;
import People.Fornecedores;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //clientes
        System.out.println();
        System.out.println("Clientes");
        Clientes cliente1 = new Clientes(1, "João Silva", "123.456.789-00", "joao@email.com", "Rua A, 123", "(031) 98888-1111");
        cliente1.Imprimir();
        Clientes cliente2 = new Clientes(2, "Maria Souza", "987.654.321-00", "maria@email.com", "Rua B, 456", "(031) 97777-2222");
        cliente2.Imprimir();
        Clientes cliente3 = new Clientes(3, "Carlos Mendes", "111.222.333-44", "carlos@email.com", "Rua C, 789", "(031) 96666-3333");
        cliente3.Imprimir();

        //colaboradores
        System.out.println();
        System.out.println("Colaboradores");
        Colaboradores colaborador1 = new Colaboradores(1, "Ana Pereira", "222.333.444-55", "Gerente", "ana@email.com", "(031) 95555-1111", "Av. Principal, 100", "(031) 94444-0000", 8500.00);
        colaborador1.Imprimir();
        Colaboradores colaborador2 = new Colaboradores(2, "Bruno Castro", "333.444.555-66", "Analista", "bruno@email.com", "(031) 96666-2222", "Rua das Flores, 200", "(031) 93333-1111", 5500.00);
        colaborador2.Imprimir();
        Colaboradores colaborador3 = new Colaboradores(3, "Carla Mendes", "444.555.666-77", "Assistente", "carla@email.com", "(031) 97777-3333", "Praça Central, 300", "(031) 92222-2222", 3500.00);
        colaborador3.Imprimir();

        //fornecedores
        System.out.println();
        System.out.println("Fornecedores");
        Fornecedores fornecedor1 = new Fornecedores(1, "ABC Distribuidora", "12.345.678/0001-99", "123456789", "contato@abc.com", "(031) 95555-1111", "Rua Industrial, 100", "(031) 94444-0000");
        fornecedor1.Imprimir();
        Fornecedores fornecedor2 = new Fornecedores(2, "XYZ Importadora", "98.765.432/0001-88", "987654321", "suporte@xyz.com", "(031) 96666-2222", "Avenida Comercial, 200", "(031) 93333-1111");
        fornecedor2.Imprimir();
        Fornecedores fornecedor3 = new Fornecedores(3, "LMN Serviços", "56.789.123/0001-77", "567891234", "vendas@lmn.com", "(031) 97777-3333", "Praça Central, 300", "(031) 92222-2222");
        fornecedor3.Imprimir();

        //Pagamentos
        System.out.println();
        System.out.println("Pagamentos");
        Pagamentos pagamento1 = new Pagamentos(1, "Cartão de Crédito", "2025-03-10", colaborador1.getName(), colaborador1.getSalario());
        pagamento1.Imprimir();
        Pagamentos pagamento2 = new Pagamentos(2, "Boleto Bancário", "2025-03-15", fornecedor2.getName(), 500.00);
        pagamento2.Imprimir();
        Pagamentos pagamento3 = new Pagamentos(3, "PIX", "2025-03-18", "Carlos Mendes", 150.00);
        pagamento3.Imprimir();

        //Pedidos
        System.out.println();
        System.out.println("Pedidos");
        Pedidos pedido1 = new Pedidos(1, 10, 50.00, 500.00, "Halter de 10kg", fornecedor1.getName(), "2025-03-10");
        pedido1.Imprimir();
        Pedidos pedido2 = new Pedidos(2, 5, 150.00, 750.00, "Barra Olímpica", fornecedor2.getName(), "2025-03-15");
        pedido2.Imprimir();
        Pedidos pedido3 = new Pedidos(3, 20, 20.00, 400.00, "Corda de Pular", fornecedor3.getName(), "2025-03-18");
        pedido3.Imprimir();

        //Produtos
        System.out.println();
        System.out.println("Produtos");
        Produtos produto1 = new Produtos(1,pedido1.getProduto(), fornecedor1.getName(), "Equipamento", pedido1.getValorUnitario(), (pedido1.getValorUnitario()/0.5), pedido1.getQtdeProduto() );
        produto1.Imprimir();
        Produtos produto2 = new Produtos(2,pedido2.getProduto(), fornecedor2.getName(), "Equipamento", pedido2.getValorUnitario(), (pedido2.getValorUnitario()/0.5), pedido2.getQtdeProduto() );
        produto2.Imprimir();
        Produtos produto3 = new Produtos(3,pedido3.getProduto(), fornecedor3.getName(), "Acessório", pedido3.getValorUnitario(), (pedido3.getValorUnitario()/0.5), pedido3.getQtdeProduto() );
        produto3.Imprimir();

        //Vendas
        System.out.println();
        System.out.println("Vendas");
        Vendas venda1 = new Vendas(1, 500.00, 10, produto1.getDescricao(), cliente1.getName(), "2025-03-10");
        venda1.Imprimir();
        Vendas venda2 = new Vendas(2, 750.00, 5, produto2.getDescricao(), cliente2.getName(), "2025-03-15");
        venda2.Imprimir();
        Vendas venda3 = new Vendas(3, 400.00, 20, produto3.getDescricao(), cliente3.getName(), "2025-03-18");
        venda3.Imprimir();
    }
}