package App;

import Entities.Apartamentos;
import Entities.Colaboradores;
import Entities.Garagem;
import Entities.Morador;
import Finances.Boletos;
import Finances.Debitos;
import Finances.Pagamentos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Morador morador1 = new Morador(1, "Lucas Silva", 25, 123456789, "99999-8888");
        Morador morador2 = new Morador(2, "Ana Souza", 30, 987654321, "98888-7777");
        Morador morador3 = new Morador(3, "Carlos Oliveira", 40, 112233445, "97777-6666");
        Morador morador4 = new Morador(4, "Beatriz Lima", 28, 223344556, "96666-5555");
        Morador morador5 = new Morador(5, "Marcos Costa", 35, 334455667, "95555-4444");

        Garagem garagem1 = new Garagem(10, 12.5, true);
        Garagem garagem2 = new Garagem(11, 13.0, false);
        Garagem garagem3 = new Garagem(12, 15.5, true);
        Garagem garagem4 = new Garagem(13, 10.0, true);
        Garagem garagem5 = new Garagem(14, 11.5, false);

        Apartamentos ap1 = new Apartamentos(101, 3, 85.0, 2, garagem1.getNumeroVaga(), morador1.getId(), garagem1, morador1);
        Apartamentos ap2 = new Apartamentos(102, 2, 70.0, 1, garagem2.getNumeroVaga(), morador2.getId(), garagem2, morador2);
        Apartamentos ap3 = new Apartamentos(103, 4, 95.0, 3, garagem3.getNumeroVaga(), morador3.getId(), garagem3, morador3);
        Apartamentos ap4 = new Apartamentos(104, 1, 60.0, 1, garagem4.getNumeroVaga(), morador4.getId(), garagem4, morador4);
        Apartamentos ap5 = new Apartamentos(105, 2, 80.0, 2, garagem5.getNumeroVaga(), morador5.getId(), garagem5, morador5);

        Colaboradores colaborador1 = new Colaboradores(1, "João Silva", "Porteiro", "99888-1122", true);
        Colaboradores colaborador2 = new Colaboradores(2, "Carlos Souza", "Porteiro", "99777-2233", true);
        Colaboradores colaborador3 = new Colaboradores(3, "Ana Lima", "Porteiro", "99666-3344", true);
        Colaboradores colaborador4 = new Colaboradores(4, "Fernando Oliveira", "Porteiro", "99555-4455", true);
        Colaboradores colaborador5 = new Colaboradores(5, "Mariana Costa", "Serviços Gerais", "99444-5566", true);

        Boletos boleto1 = new Boletos(1, 150.75, "2025-04-15", false);
        Boletos boleto2 = new Boletos(2, 220.50, "2025-04-20", true);
        Boletos boleto3 = new Boletos(3, 130.00, "2025-04-25", false);

        Debitos debito1 = new Debitos(ap1, 350.75, "Pagamento de água atrasado");
        Debitos debito2 = new Debitos(ap2, 500.00, "Taxa de condomínio não paga");



        Debitos debito1 = new Debitos(ap1, 500.0, "Taxa Extra de manutenção");
        Pagamentos pagamento1 = new Pagamentos(ap1, 800.0, "07/04/2025");

            public static void dadosMoradores(){
            JOptionPane.showMessageDialog(null,
                    "Dados moradores: "+
                            "\nID Moradores: "+morador1.getId() + morador2.getId() + morador3.getId() + morador4.getId() + morador5.getId()+
                            "\nNomes: " +morador1.getNome() + morador2.getNome() + morador3.getNome() + morador4.getNome() + morador5.getId()+


            );
        }
// dados morador
// dados garagem
// dados apartamento
// dados debitos
// dados pagamentos

    }
}