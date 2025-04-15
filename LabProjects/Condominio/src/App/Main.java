package App;

import Entities.*;
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

        Apartamentos ap1 = new Apartamentos(101, 3, 85.0, 2, garagem1, morador1);
        Apartamentos ap2 = new Apartamentos(102, 2, 70.0, 1, garagem2, morador2);
        Apartamentos ap3 = new Apartamentos(103, 4, 95.0, 3, garagem3, morador3);
        Apartamentos ap4 = new Apartamentos(104, 1, 60.0, 1, garagem4, morador4);
        Apartamentos ap5 = new Apartamentos(105, 2, 80.0, 2, garagem5, morador5);

        Colaboradores colaborador1 = new Colaboradores(1, "João Silva", "Porteiro", "99888-1122", true);
        Colaboradores colaborador2 = new Colaboradores(2, "Carlos Souza", "Porteiro", "99777-2233", true);
        Colaboradores colaborador3 = new Colaboradores(3, "Ana Lima", "Porteiro", "99666-3344", true);
        Colaboradores colaborador4 = new Colaboradores(4, "Fernando Oliveira", "Porteiro", "99555-4455", true);
        Colaboradores colaborador5 = new Colaboradores(5, "Mariana Costa", "Serviços Gerais", "99444-5566", true);

        Boletos boleto1 = new Boletos(1, 150.75, false);
        Boletos boleto2 = new Boletos(2, 220.50, true);
        Boletos boleto3 = new Boletos(3, 130.00, false);

        Pagamentos pagamento1 = new Pagamentos(ap1, 500.75, "2025-04-15");
        Pagamentos pagamento2 = new Pagamentos(ap2, 600.50, "2025-04-16");
        Pagamentos pagamento3 = new Pagamentos(ap3, 450.00, "2025-04-17");
        Pagamentos pagamento4 = new Pagamentos(ap5, 220.00, "2025-04-18");

        Debitos debito1 = new Debitos(ap4, 350.75, "Pagamento de água atrasado");
        Debitos debito2 = new Debitos(ap5, 500.00, "Taxa de condomínio não paga");

        Condominio condominio1 = new Condominio(ap1,morador1,garagem1,pagamento1);
        Condominio condominio2 = new Condominio(ap2,morador2,garagem2,pagamento2);
        Condominio condominio3 = new Condominio(ap3,morador3,garagem3,pagamento3);
        Condominio condominio4 = new Condominio(ap4,morador4,garagem4,debito1);
        Condominio condominio5 = new Condominio(ap5,morador5,garagem5,pagamento4,debito2);
        Condominio dadosPagamentos = new Condominio();
        Condominio dadosDebitos = new Condominio();
        dadosPagamentos.setPagamentosTotais(pagamento1.getValorBoleto() + pagamento2.getValorBoleto()+ pagamento3.getValorBoleto() + pagamento4.getValorBoleto());
        dadosDebitos.setDebitosTotais(debito1.getValorDebito() + debito2.getValorDebito());


        JOptionPane.showMessageDialog(null,
                "Dados moradores:" +
                        "\nID Moradores: " + morador1.getId() + ", " + morador2.getId() + ", " + morador3.getId() + ", " + morador4.getId() + ", " + morador5.getId() +
                        "\nNomes: " + morador1.getNome() + ", " + morador2.getNome() + ", " + morador3.getNome() + ", " + morador4.getNome() + ", " + morador5.getNome() +
                        "\nIdades: " + morador1.getIdade() + ", " + morador2.getIdade() + ", " + morador3.getIdade() + ", " + morador4.getIdade() + ", " + morador5.getIdade() +
                        "\nCPFs: " + morador1.getCpf() + ", " + morador2.getCpf() + ", " + morador3.getCpf() + ", " + morador4.getCpf() + ", " + morador5.getCpf() +
                        "\nTelefones: " + morador1.getTelefone() + ", " + morador2.getTelefone() + ", " + morador3.getTelefone() + ", " + morador4.getTelefone() + ", " + morador5.getTelefone()
        );


        JOptionPane.showMessageDialog(null,
                "Dados Garagem:" +
                        "\nNúmeros das vagas: " + garagem1.getNumeroVaga() + ", " + garagem2.getNumeroVaga() + ", " + garagem3.getNumeroVaga()
                        + ", " + garagem4.getNumeroVaga() + ", " + garagem5.getNumeroVaga() +
                        "\nEspaço da vaga (m²): " + garagem1.getMetroQuadrado() + ", " + garagem2.getMetroQuadrado() + ", " + garagem3.getMetroQuadrado()
                        + ", " + garagem4.getMetroQuadrado() + ", " + garagem5.getMetroQuadrado() +
                        "\nA vaga está ocupada? " +
                        (garagem1.isVagaOcupada() ? "Sim" : "Não") + ", " +
                        (garagem2.isVagaOcupada() ? "Sim" : "Não") + ", " +
                        (garagem3.isVagaOcupada() ? "Sim" : "Não") + ", " +
                        (garagem4.isVagaOcupada() ? "Sim" : "Não") + ", " +
                        (garagem5.isVagaOcupada() ? "Sim" : "Não")
        );



       JOptionPane.showMessageDialog(null,
               "Dados Colaboradores:" +
                       "\nID Colaboradores: " + colaborador1.getIdColaborador() + ", " + colaborador2.getIdColaborador() + ", " + colaborador3.getIdColaborador()
                       + ", " + colaborador4.getIdColaborador() + ", " + colaborador5.getIdColaborador() +
                       "\nNome Colaborador: " + colaborador1.getNomeColaborador() + ", " + colaborador2.getNomeColaborador() + ", " + colaborador3.getNomeColaborador()
                       + ", " + colaborador4.getNomeColaborador() + ", " + colaborador5.getNomeColaborador() +
                       "\nFunção: " + colaborador1.getFuncao() + ", " + colaborador2.getFuncao() + ", " + colaborador3.getFuncao()
                       + ", " + colaborador4.getFuncao() + ", " + colaborador5.getFuncao() +
                       "\nTelefone Colaborador: " + colaborador1.getTelefone() + ", " + colaborador2.getTelefone() + ", " + colaborador3.getTelefone()
                       + ", " + colaborador4.getTelefone() + ", " + colaborador5.getTelefone() +
                       "\nColaborador ativo? " +
                       (colaborador1.isAtivo() ? "Sim" : "Não") + ", " +
                       (colaborador2.isAtivo() ? "Sim" : "Não") + ", " +
                       (colaborador3.isAtivo() ? "Sim" : "Não") + ", " +
                       (colaborador4.isAtivo() ? "Sim" : "Não") + ", " +
                       (colaborador5.isAtivo() ? "Sim" : "Não")
       );


       JOptionPane.showMessageDialog(null,
               "Dados Apartamentos:" +
                       "\nNúmero apartamento: " + ap1.getNumeroApartamento() + ", " + ap2.getNumeroApartamento() + ", " + ap3.getNumeroApartamento()
                       + ", " + ap4.getNumeroApartamento() + ", " + ap5.getNumeroApartamento() +
                       "\nNúmero vaga: " + ap1.getVaga().getNumeroVaga() + ", " + ap2.getVaga().getNumeroVaga() + ", " + ap3.getVaga().getNumeroVaga()
                       + ", " + ap4.getVaga().getNumeroVaga() + ", " + ap5.getVaga().getNumeroVaga() +
                       "\nID Morador: " + ap1.getMorador().getId() + ", " + ap2.getMorador().getId() + ", " + ap3.getMorador().getId()
                       + ", " + ap4.getMorador().getId() + ", " + ap5.getMorador().getId() +
                       "\nQuantidade quartos: " + ap1.getQuantQuartos() + ", " + ap2.getQuantQuartos() + ", " + ap3.getQuantQuartos()
                       + ", " + ap4.getQuantQuartos() + ", " + ap5.getQuantQuartos() +
                       "\nMetros quadrados do AP: " + ap1.getMetrosQuadrados() + ", " + ap2.getMetrosQuadrados() + ", " + ap3.getMetrosQuadrados()
                       + ", " + ap4.getMetrosQuadrados() + ", " + ap5.getMetrosQuadrados() +
                       "\nQuantidade de vagas: " + ap1.getQuantVagas() + ", " + ap2.getQuantVagas() + ", " + ap3.getQuantVagas()
                       + ", " + ap4.getQuantVagas() + ", " + ap5.getQuantVagas()
       );

       JOptionPane.showMessageDialog(null,
               "Gerando Boletos:"+
                       "\nID BOLETO: " + boleto1.getIdBoleto()+
                       "\nData Vencimento: "+boleto1.getDataVencimento()+
                       "\nValor a Pagar: "+boleto1.getValor()+
                       "\n --------------------------------------------------------"+
                       "\nID BOLETO: " + boleto2.getIdBoleto()+
                       "\nData Vencimento: "+boleto2.getDataVencimento()+
                       "\nValor a Pagar: "+boleto2.getValor()+
                       "\n --------------------------------------------------------"+
                       "\nID BOLETO: " + boleto3.getIdBoleto()+
                       "\nData Vencimento: "+boleto3.getDataVencimento()+
                       "\nValor a Pagar: "+boleto3.getValor()+
                       "\n --------------------------------------------------------"
       );

       JOptionPane.showMessageDialog(null,
               "Dados Pagamentos: "+
                       "\nApartamento que pagou: "+ pagamento1.getApartamento().getNumeroApartamento()+", " + pagamento2.getApartamento().getNumeroApartamento()
                        + ", " + pagamento3.getApartamento().getNumeroApartamento() + ", " + pagamento4.getApartamento().getNumeroApartamento() +
                       "\nValor pagamento: R$"+pagamento1.getValorBoleto()+", R$"+ pagamento2.getValorBoleto()+", R$" + pagamento3.getValorBoleto()
                        +", R$"+ pagamento4.getValorBoleto()+
                       "\nData pagamento: "+pagamento1.getDataPagamento()+", " + pagamento2.getDataPagamento()+", " + pagamento3.getDataPagamento()
                        +", "+ pagamento4.getDataPagamento()
       );

       JOptionPane.showMessageDialog(null,
               "Dados Débitos: " +
                       "\nApartamento devedor: " +debito1.getApartamento().getNumeroApartamento()+", "+debito2.getApartamento().getNumeroApartamento()+
                       "\nValor devido: R$"+debito1.getValorDebito()+", "+debito2.getValorDebito()+
                       "\nDescrição do débito: "+debito1.getDescricaoDebito()+", " + debito2.getDescricaoDebito()
       );

       JOptionPane.showMessageDialog(null,
               "Dados condomínio: "+
                       "\nApartamento: "+ condominio1.getApartamentos().getNumeroApartamento()+
                       "\nGaragem: "+ condominio1.getVaga().getNumeroVaga()+
                       "\nMorador: " + condominio1.getMorador().getNome()+
                       "\nCpf Morador: " + condominio1.getMorador().getCpf()+
                       "\nDebitos apartamento = R$"+condominio1.getDebitos().getValorDebito() +
                       "\nPagamentos apartamento = R$"+condominio1.getPagamentos().getValorBoleto()+
                       "--------------------------------------------------------------" +

                       "\nDados condomínio: " +
                       "\nApartamento: " + condominio2.getApartamentos().getNumeroApartamento() +
                       "\nGaragem: " + condominio2.getVaga().getNumeroVaga() +
                       "\nMorador: " + condominio2.getMorador().getNome() +
                       "\nCpf Morador: " + condominio2.getMorador().getCpf() +
                       "\nDebitos apartamento = R$" + condominio2.getDebitos().getValorDebito() +
                       "\nPagamentos apartamento = R$" + condominio2.getPagamentos().getValorBoleto() +
                       "\n--------------------------------------------------------------" +

                       "\nDados condomínio: " +
                       "\nApartamento: " + condominio3.getApartamentos().getNumeroApartamento() +
                       "\nGaragem: " + condominio3.getVaga().getNumeroVaga() +
                       "\nMorador: " + condominio3.getMorador().getNome() +
                       "\nCpf Morador: " + condominio3.getMorador().getCpf() +
                       "\nDebitos apartamento = R$" + condominio3.getDebitos().getValorDebito() +
                       "\nPagamentos apartamento = R$" + condominio3.getPagamentos().getValorBoleto() +
                       "\n--------------------------------------------------------------" +

                       "\nDados condomínio: " +
                       "\nApartamento: " + condominio4.getApartamentos().getNumeroApartamento() +
                       "\nGaragem: " + condominio4.getVaga().getNumeroVaga() +
                       "\nMorador: " + condominio4.getMorador().getNome() +
                       "\nCpf Morador: " + condominio4.getMorador().getCpf() +
                       "\nDebitos apartamento = R$" + condominio4.getDebitos().getValorDebito() +
                       "\nPagamentos apartamento = R$" + condominio4.getPagamentos().getValorBoleto() +
                       "\n--------------------------------------------------------------" +

                       "\nDados condomínio: " +
                       "\nApartamento: " + condominio5.getApartamentos().getNumeroApartamento() +
                       "\nGaragem: " + condominio5.getVaga().getNumeroVaga() +
                       "\nMorador: " + condominio5.getMorador().getNome() +
                       "\nCpf Morador: " + condominio5.getMorador().getCpf() +
                       "\nDebitos apartamento = R$" + condominio5.getDebitos().getValorDebito() +
                       "\nPagamentos apartamento = R$" + condominio5.getPagamentos().getValorBoleto() +
                       "\n--------------------------------------------------------------"
               );



       // verificar construtores com if
        // se o valor do debito ou pagamento estiver zerado, setar ele pra zero
        // ai para de dar erro na linha 160

        // fazer a criação de turnos dos porteiros
        // verificar o colaborador atual usando o hórario da consulta atual do pc, exemplo
        // consulta feita 12:00, porteiro x, consulta feita 19, porteiro y
        // pode ser feito no gpt de boa
    }
}