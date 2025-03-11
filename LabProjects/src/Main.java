import Actions.Orders;
import Entities.Pizzas;
import Entities.Products;
import People.Clients;
import People.Collaborators;


public class Main {
    public static void main(String[] args) {

        Clients client1 = new Clients();
        Clients client2 = new Clients();
        Clients client3 = new Clients();
        Clients client4 = new Clients();
        Clients client5 = new Clients();
        Collaborators collaborator1 = new Collaborators();
        Collaborators collaborator2 = new Collaborators();
        Collaborators collaborator3 = new Collaborators();
        Collaborators collaborator4 = new Collaborators();
        Collaborators collaborator5 = new Collaborators();
        Pizzas pizza1 = new Pizzas();
        Pizzas pizza2 = new Pizzas();
        Pizzas pizza3 = new Pizzas();
        Pizzas pizza4 = new Pizzas();
        Pizzas pizza5 = new Pizzas();
        Products product1 = new Products();
        Products product2 = new Products();
        Products product3 = new Products();
        Products product4 = new Products();
        Products product5 = new Products();
        Orders order1 = new Orders();
        Orders order2 = new Orders();
        Orders order3 = new Orders();
        Orders order4 = new Orders();
        Orders order5 = new Orders();

        //clientes
        client1.setName("João Silva");
        client1.setOld(30);
        client1.setPaymentMethod("Cartão de Crédito");
        client1.imprimir();

        client2.setName("Maria Oliveira");
        client2.setOld(25);
        client2.setPaymentMethod("Boleto Bancário");
        client2.imprimir();

        client3.setName("Carlos Souza");
        client3.setOld(40);
        client3.setPaymentMethod("Pix");
        client3.imprimir();

        client4.setName("Ana Costa");
        client4.setOld(22);
        client4.setPaymentMethod("Dinheiro");
        client4.imprimir();

        client5.setName("Pedro Almeida");
        client5.setOld(35);
        client5.setPaymentMethod("Cartão de Débito");
        client5.imprimir();

        //colaboradores
        collaborator1.setName("Lucas Pereira");
        collaborator1.setOld(28);
        collaborator1.setPosition("Padeiro");
        collaborator1.setWage(2500.00);
        collaborator1.imprimir();

        collaborator2.setName("Fernanda Santos");
        collaborator2.setOld(34);
        collaborator2.setPosition("Garçom");
        collaborator2.setWage(2000.00);
        collaborator2.imprimir();

        collaborator3.setName("Roberto Lima");
        collaborator3.setOld(45);
        collaborator3.setPosition("Chef de Cozinha");
        collaborator3.setWage(4000.00);
        collaborator3.imprimir();

        collaborator4.setName("Julia Martins");
        collaborator4.setOld(27);
        collaborator4.setPosition("Atendente de Telemarketing");
        collaborator4.setWage(1500.00);
        collaborator4.imprimir();

        collaborator5.setName("Ricardo Gomes");
        collaborator5.setOld(38);
        collaborator5.setPosition("Gerente de Pizzaria");
        collaborator5.setWage(5000.00);
        collaborator5.imprimir();

        //pizzas
        pizza1.setSabor("Margherita");
        pizza1.setMassas("Massa Fina");
        pizza1.setFatias(8);
        pizza1.setVegie(true);  // Vegana
        pizza1.imprimir();

        pizza2.setSabor("Calabresa");
        pizza2.setMassas("Massa Grossa");
        pizza2.setFatias(6);
        pizza2.setVegie(false);  // Não vegana
        pizza2.imprimir();

        pizza3.setSabor("Quatro Queijos");
        pizza3.setMassas("Massa Fina");
        pizza3.setFatias(10);
        pizza3.setVegie(false);  // Não vegana
        pizza3.imprimir();

        pizza4.setSabor("Vegetariana");
        pizza4.setMassas("Massa Tradicional");
        pizza4.setFatias(8);
        pizza4.setVegie(true);  // Vegana
        pizza4.imprimir();

        pizza5.setSabor("Frango com Catupiry");
        pizza5.setMassas("Massa Fina");
        pizza5.setFatias(8);
        pizza5.setVegie(false);  // Não vegana
        pizza5.imprimir();

    }
}