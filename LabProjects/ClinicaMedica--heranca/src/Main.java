import Administrative.*;
import Estoques.Estocavel;
import Estoques.ItensEstoque;
import Estoques.Medicamentos;
import People.AnotacoesMedicas.AnotacoesMedicas;
import People.Medicos;
import People.Pacientes;
import People.Usuario;
import Routine.Consultas;
import Routine.Exames;
import Routine.Receitas;
import Routine.VideoChamada;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

try {
    Despesas despesa1 = new Despesas(1, "Compra de material de escritório", 150.75, sdf.parse("10/01/2025"));
    Despesas despesa2 = new Despesas(2, "Pagamento de internet", 99.90, sdf.parse("05/02/2025"));
    Despesas despesa3 = new Despesas(3, "Conta de luz", 220.50, sdf.parse("15/02/2025"));
    Despesas despesa4 = new Despesas(4, "Serviço de limpeza", 300.00, sdf.parse("20/03/2025"));
    Despesas despesa5 = new Despesas(5, "Manutenção de equipamentos", 180.30, sdf.parse("01/04/2025"));

    ArrayList<String> procedimentos1 = new ArrayList<>(Arrays.asList("Consulta", "Exame de sangue"));
    ArrayList<String> procedimentos2 = new ArrayList<>(Arrays.asList("Raio-X", "Ultrassonografia"));
    ArrayList<String> procedimentos3 = new ArrayList<>(Arrays.asList("Cirurgia", "Internação", "Fisioterapia"));
    ArrayList<String> procedimentos4 = new ArrayList<>(Arrays.asList("Consulta psicológica", "Nutricionista"));
    ArrayList<String> procedimentos5 = new ArrayList<>(Arrays.asList("Vacinação", "Check-up anual"));

    PlanosDeSaude plano1 = new PlanosDeSaude("Plano Básico", sdf.parse("01/01/2024"), sdf.parse("31/12/2024"), procedimentos1);
    PlanosDeSaude plano2 = new PlanosDeSaude("Plano Intermediário", sdf.parse("01/02/2024"), sdf.parse("31/01/2025"), procedimentos2);
    PlanosDeSaude plano3 = new PlanosDeSaude("Plano Premium", sdf.parse("15/03/2024"), sdf.parse("14/03/2025"), procedimentos3);
    PlanosDeSaude plano4 = new PlanosDeSaude("Plano Familiar", sdf.parse("01/05/2024"), sdf.parse("30/04/2025"), procedimentos4);
    PlanosDeSaude plano5 = new PlanosDeSaude("Plano Empresarial", sdf.parse("10/06/2024"), sdf.parse("09/06/2025"), procedimentos5);

    ItensEstoque item1 = new ItensEstoque(10, "Álcool em gel", 50, sdf.parse("10/12/2025"), "Higiene");
    ItensEstoque item2 = new ItensEstoque(20, "Luvas descartáveis", 200, sdf.parse("01/11/2025"), "Proteção");
    ItensEstoque item3 = new ItensEstoque(30, "Soro fisiológico", 80, sdf.parse("15/10/2025"), "Medicamento");
    ItensEstoque item4 = new ItensEstoque(40, "Máscaras cirúrgicas", 150, sdf.parse("20/09/2025"), "Proteção");
    ItensEstoque item5 = new ItensEstoque(50, "Algodão", 100, sdf.parse("05/01/2026"), "Curativo");

    Medicamentos medicamento1 = new Medicamentos(100, "Paracetamol 500mg", sdf.parse("15/09/2025"),7 , 20, "1 comprimido a cada 8 horas");
    Medicamentos medicamento2 = new Medicamentos(200, "Ibuprofeno 400mg", sdf.parse("01/10/2025"),45 , 30, "1 comprimido após as refeições");
    Medicamentos medicamento3 = new Medicamentos(300, "Amoxicilina 500mg", sdf.parse("22/08/2025"),32 , 21, "1 comprimido de 8 em 8 horas por 7 dias");
    Medicamentos medicamento4 = new Medicamentos(400, "Loratadina 10mg", sdf.parse("10/12/2025"), 27, 10, "1 comprimido por dia");
    Medicamentos medicamento5 = new Medicamentos(500, "Omeprazol 20mg", sdf.parse("05/11/2025"), 18, 14, "1 comprimido em jejum");

    Medicos medico1 = new Medicos(1, "123456-SP", "Dra. Ana Souza", "Clínica Geral", true);
    Medicos medico2 = new Medicos(2, "654321-SP", "Dr. Paulo Mendes", "Cardiologia", false);
    Medicos medico3 = new Medicos(3, "112233-RJ", "Dra. Carla Lima", "Pediatria", true);
    Medicos medico4 = new Medicos(4, "445566-MG", "Dr. Ricardo Alves", "Ortopedia", false);
    Medicos medico5 = new Medicos(5, "778899-BA", "Dra. Fernanda Torres", "Dermatologia", true);

    Usuario usuario1 = new Usuario(1, "123.456.789-00", "Lucas Martins", "11999999999", "Rua A, 123", "lucas@email.com", sdf.parse("10/04/1990"), "Administrador");
    Usuario usuario2 = new Usuario(2, "987.654.321-00", "Juliana Costa", "21988888888", "Av. B, 456", "juliana@email.com", sdf.parse("25/12/1985"), "Recepcionista");
    Usuario usuario3 = new Usuario(3, "456.789.123-00", "Rafael Lima", "31977777777", "Rua C, 789", "rafael@email.com", sdf.parse("08/03/1992"), "Enfermeiro");
    Usuario usuario4 = new Usuario(4, "321.654.987-00", "Amanda Rocha", "11966666666", "Av. D, 101", "amanda@email.com", sdf.parse("30/06/1988"), "Médico");
    Usuario usuario5 = new Usuario(5, "741.852.963-00", "Bruno Silva", "21955555555", "Rua E, 202", "bruno@email.com", sdf.parse("12/11/1995"), "TI");

    LogsAcesso log1 = new LogsAcesso(usuario1, "Visualizou prontuário", "Visualização de dados do paciente", new Date());
    LogsAcesso log2 = new LogsAcesso(usuario2, "Alterou consulta", "Alteração de horário da consulta", new Date());
    LogsAcesso log3 = new LogsAcesso(usuario3, "Realizou exame", "Exame de pressão arterial", new Date());
    LogsAcesso log4 = new LogsAcesso(usuario4, "Visualizou prontuário", "Visualização de resultados de exames", new Date());
    LogsAcesso log5 = new LogsAcesso(usuario5, "Alterou consulta", "Alteração de dados do paciente", new Date());

    ArrayList<String> alergias1 = new ArrayList<>(Arrays.asList("Amendoim", "Pólen"));
    ArrayList<String> alergias2 = new ArrayList<>(Arrays.asList("Frutos do mar", "Lactose"));
    ArrayList<String> alergias3 = new ArrayList<>(Arrays.asList("Ácaros", "Poeira"));
    ArrayList<String> alergias4 = new ArrayList<>(Arrays.asList("Gato", "Fumo"));
    ArrayList<String> alergias5 = new ArrayList<>(Arrays.asList("Medicamentos", "Poeira"));

    Pacientes paciente1 = new Pacientes(1, "123.456.789-00", "Carlos Silva", "999999999", "Rua F, 123", "carlos@email.com", sdf.parse("10/04/1990"), alergias1, plano1);
    Pacientes paciente2 = new Pacientes(2, "987.654.321-00", "Maria Oliveira", "888888888", "Av. G, 456", "maria@email.com", sdf.parse("25/12/1985"), alergias2, plano2);
    Pacientes paciente3 = new Pacientes(3, "456.789.123-00", "José Pereira", "777777777", "Rua H, 789", "jose@email.com", sdf.parse("08/03/1992"), alergias3, plano3);
    Pacientes paciente4 = new Pacientes(4, "321.654.987-00", "Ana Costa", "666666666", "Av. I, 101", "ana@email.com", sdf.parse("30/06/1988"), alergias4, plano4);
    Pacientes paciente5 = new Pacientes(5, "741.852.963-00", "Roberto Souza", "555555555", "Rua J, 202", "roberto@email.com", sdf.parse("12/11/1995"), alergias5, plano5);

    AnotacoesMedicas anotacao1 = new AnotacoesMedicas(1, new Date(), "Paciente com boa saúde.", medico1, paciente1);
    AnotacoesMedicas anotacao2 = new AnotacoesMedicas(2, new Date(), "Paciente com histórico de problemas cardíacos.", medico2, paciente2);
    AnotacoesMedicas anotacao3 = new AnotacoesMedicas(3, new Date(), "Consulta para acompanhamento de crescimento.", medico3, paciente3);
    AnotacoesMedicas anotacao4 = new AnotacoesMedicas(4, new Date(), "Paciente com lesão no joelho.", medico4, paciente4);
    AnotacoesMedicas anotacao5 = new AnotacoesMedicas(5, new Date(), "Consulta de acompanhamento de tratamento dermatológico.", medico5, paciente5);

    Consultas consulta1 = new Consultas(1, "Consulta Geral", "Presencial", paciente1, medico1, new Date(), "Concluída", anotacao1);
    Consultas consulta2 = new Consultas(2, "Consulta Cardiológica", "Presencial", paciente2, medico2, new Date(), "Pendente", anotacao2);
    Consultas consulta3 = new Consultas(3, "Consulta Pediátrica", "Telemedicina", paciente3, medico3, new Date(), "Concluída", anotacao3);
    Consultas consulta4 = new Consultas(4, "Consulta Ortopédica", "Presencial", paciente4, medico4, new Date(), "Cancelada", anotacao4);
    Consultas consulta5 = new Consultas(5, "Consulta Dermatológica", "Telemedicina", paciente5, medico5, new Date(), "Concluída", anotacao5);

    Exames exame1 = new Exames(1, "12345", "Exame de Sangue", "Laboratório A", new Date(), "Resultado normal");
    Exames exame2 = new Exames(2, "23456", "Exame de Urina", "Laboratório B", new Date(), "Resultado alterado");
    Exames exame3 = new Exames(3, "34567", "Raio-X de Tórax", "Laboratório C", new Date(), "Resultado normal");
    Exames exame4 = new Exames(4, "45678", "Eletrocardiograma", "Laboratório D", new Date(), "Resultado normal");
    Exames exame5 = new Exames(5, "56789", "Ultrassonografia Abdominal", "Laboratório E", new Date(), "Resultado alterado");

    ArrayList<Medicamentos> medicamentos1 = new ArrayList<>(Arrays.asList(medicamento1, medicamento2));
    ArrayList<Medicamentos> medicamentos2 = new ArrayList<>(Arrays.asList(medicamento3, medicamento4));
    ArrayList<Medicamentos> medicamentos3 = new ArrayList<>(Arrays.asList(medicamento5, medicamento1));
    ArrayList<Medicamentos> medicamentos4 = new ArrayList<>(Arrays.asList(medicamento2, medicamento3));
    ArrayList<Medicamentos> medicamentos5 = new ArrayList<>(Arrays.asList(medicamento4, medicamento5));

    Receitas receita1 = new Receitas(1, new Date(), medicamentos1, medico1, paciente1);
    Receitas receita2 = new Receitas(2, new Date(), medicamentos2, medico2, paciente2);
    Receitas receita3 = new Receitas(3, new Date(), medicamentos3, medico3, paciente3);
    Receitas receita4 = new Receitas(4, new Date(), medicamentos4, medico4, paciente4);
    Receitas receita5 = new Receitas(5, new Date(), medicamentos5, medico5, paciente5);

    VideoChamada chamada1 = new VideoChamada(1, consulta1, "https://linkClinica.com", true);
    VideoChamada chamada2 = new VideoChamada(2, consulta2, "https://linkClinica.com", false);
    VideoChamada chamada3 = new VideoChamada(3, consulta3, "https://linkClinica.com", true);
    VideoChamada chamada4 = new VideoChamada(4, consulta4, "https://linkClinica.com", false);
    VideoChamada chamada5 = new VideoChamada(5, consulta5, "https://linkClinica.com", true);

    Faturamentos faturamento1 = new Faturamentos(consulta1, 150.00, "Consulta Particular", "Cartão de Crédito", true);
    Faturamentos faturamento2 = new Faturamentos(consulta2, 200.00, "Consulta Particular", "Dinheiro", false);
    Faturamentos faturamento3 = new Faturamentos(consulta3, 120.00, "Consulta Convênio", "Cartão de Crédito", true);
    Faturamentos faturamento4 = new Faturamentos(consulta4, 250.00, "Consulta Particular", "Cheque", false);
    Faturamentos faturamento5 = new Faturamentos(consulta5, 100.00, "Consulta Convênio", "Dinheiro", true);

    // financeiro
    ArrayList<Faturamentos> faturamentos = new ArrayList<>(Arrays.asList(faturamento1, faturamento2, faturamento3, faturamento4, faturamento5));
    ArrayList<Despesas> Despesas = new ArrayList<>(Arrays.asList(despesa1, despesa2, despesa3, despesa4, despesa5));

    //estoque
    ArrayList<Estocavel>estoqueGeral = new ArrayList<>();
    ArrayList<Medicamentos>medicamentosArrayList = new ArrayList<>();
    medicamentosArrayList.addAll(Arrays.asList(medicamento1, medicamento2,medicamento3,medicamento4,medicamento5));
    ArrayList<ItensEstoque>itemsEstoqueArrayList= new ArrayList<>();
    itemsEstoqueArrayList.addAll(Arrays.asList(item1,item2,item3,item4,item5));
    estoqueGeral.addAll(itemsEstoqueArrayList);
    estoqueGeral.addAll(medicamentosArrayList);

    //dados Despesa
    JOptionPane.showMessageDialog(null,
            "Dados despesa: "+
            "\nID: "+despesa1.getId()+
            "\nDescrição: "+despesa1.getDescricao()+
            "\nValor: "+despesa1.getValor()+
            "\nData: "+despesa1.getData()+
            "\n-----------------------------------"+
            "\nID: "+despesa2.getId()+
            "\nDescrição: "+despesa2.getDescricao()+
            "\nValor: "+despesa2.getValor()+
            "\nData: "+despesa2.getData()+
            "\n-----------------------------------"+
            "\nID: "+despesa3.getId()+
            "\nDescrição: "+despesa3.getDescricao()+
            "\nValor: "+despesa3.getValor()+
            "\nData: "+despesa3.getData()+
            "\n-----------------------------------"+
            "\nID: "+despesa4.getId()+
            "\nDescrição: "+despesa4.getDescricao()+
            "\nValor: "+despesa4.getValor()+
            "\nData: "+despesa4.getData()+
            "\n-----------------------------------"+
            "\nID: "+despesa5.getId()+
            "\nDescrição: "+despesa5.getDescricao()+
            "\nValor: "+despesa5.getValor()+
            "\nData: "+despesa5.getData()+
            "\n-----------------------------------"
    );

    JOptionPane.showMessageDialog(null,
            "Planos de saúde e seus procedimentos"+
                    "\nNome: "+plano1.getNome()+
                    "\nData Inicial: "+plano1.getDataInicio()+
                    "\nData Final: "+plano1.getDataFim()+
                    "\nProcedimentos: "+plano1.getProcedimentos()+
                    "\n-----------------------------------"+
                    "\nNome: "+plano2.getNome()+
                    "\nData Inicial: "+plano2.getDataInicio()+
                    "\nData Final: "+plano2.getDataFim()+
                    "\nProcedimentos: "+plano2.getProcedimentos()+
                    "\n-----------------------------------"+
                    "\nNome: "+plano3.getNome()+
                    "\nData Inicial: "+plano3.getDataInicio()+
                    "\nData Final: "+plano3.getDataFim()+
                    "\nProcedimentos: "+plano3.getProcedimentos()+
                    "\n-----------------------------------"+
                    "\nNome: "+plano4.getNome()+
                    "\nData Inicial: "+plano4.getDataInicio()+
                    "\nData Final: "+plano4.getDataFim()+
                    "\nProcedimentos: "+plano4.getProcedimentos()+
                    "\n-----------------------------------"+
                    "\nNome: "+plano5.getNome()+
                    "\nData Inicial: "+plano5.getDataInicio()+
                    "\nData Final: "+plano5.getDataFim()+
                    "\nProcedimentos: "+plano5.getProcedimentos()+
                    "\n-----------------------------------"
            );

    StringBuilder mensagem = new StringBuilder();

    for (Estocavel item : estoqueGeral) {
        mensagem.append("ID: ").append(item.getId()).append("\n");
        mensagem.append("Nome: ").append(item.getDescricao()).append("\n");
        mensagem.append("Validade: ").append(item.getDataValidade()).append("\n");
        mensagem.append("Quantidade: ").append(item.getQuantidade()).append("\n");
        mensagem.append("---------------------------\n");
    }

    JOptionPane.showMessageDialog(null, mensagem.toString(),
            "Estoque Geral", JOptionPane.INFORMATION_MESSAGE);


    JOptionPane.showMessageDialog(null,
            "Médicos Disponíveis"+
                    "\nID: "+medico1.getId()+
                    "\nCRM: "+medico1.getCrm()+
                    "\nNome: "+medico1.getNome()+
                    "\nEspecialidade: "+medico1.getEspecialidade()+
                    "\nTelemedicina? "+medico1.isAtendeTelemedicina()+
                    "\n----------------------------------"+
                    "\nID: "+medico2.getId()+
                    "\nCRM: "+medico2.getCrm()+
                    "\nNome: "+medico2.getNome()+
                    "\nEspecialidade: "+medico2.getEspecialidade()+
                    "\nTelemedicina? "+medico2.isAtendeTelemedicina()+
                    "\n----------------------------------"+
                    "\nID: "+medico3.getId()+
                    "\nCRM: "+medico3.getCrm()+
                    "\nNome: "+medico3.getNome()+
                    "\nEspecialidade: "+medico3.getEspecialidade()+
                    "\nTelemedicina? "+medico3.isAtendeTelemedicina()+
                    "\n----------------------------------"+
                    "\nID: "+medico4.getId()+
                    "\nCRM: "+medico4.getCrm()+
                    "\nNome: "+medico4.getNome()+
                    "\nEspecialidade: "+medico4.getEspecialidade()+
                    "\nTelemedicina? "+medico4.isAtendeTelemedicina()+
                    "\n----------------------------------"+
                    "\nID: "+medico5.getId()+
                    "\nCRM: "+medico5.getCrm()+
                    "\nNome: "+medico5.getNome()+
                    "\nEspecialidade: "+medico5.getEspecialidade()+
                    "\nTelemedicina? "+medico5.isAtendeTelemedicina()+
                    "\n----------------------------------"
    );

    JOptionPane.showMessageDialog(null,
            "Dados Usuários: "+
                    "\nID: "+usuario1.getId()+
                    "\nCPF: "+usuario1.getCpf()+
                    "\nNome: "+usuario1.getNome()+
                    "\nTelefone: "+usuario1.getTelefone()+
                    "\nEmail: "+usuario1.getEmail()+
                    "\nData Nascimento: "+usuario1.getDataNascimento()+
                    "\nCargo: "+usuario1.getCargo()+
                    "\n--------------------------------------"+
                    "\nID: "+usuario2.getId()+
                    "\nCPF: "+usuario2.getCpf()+
                    "\nNome: "+usuario2.getNome()+
                    "\nTelefone: "+usuario2.getTelefone()+
                    "\nEmail: "+usuario2.getEmail()+
                    "\nData Nascimento: "+usuario2.getDataNascimento()+
                    "\nCargo: "+usuario2.getCargo()+
                    "\n--------------------------------------"+
                    "\nID: "+usuario3.getId()+
                    "\nCPF: "+usuario3.getCpf()+
                    "\nNome: "+usuario3.getNome()+
                    "\nTelefone: "+usuario3.getTelefone()+
                    "\nEmail: "+usuario3.getEmail()+
                    "\nData Nascimento: "+usuario3.getDataNascimento()+
                    "\nCargo: "+usuario3.getCargo()+
                    "\n--------------------------------------"+
                    "\nID: "+usuario4.getId()+
                    "\nCPF: "+usuario4.getCpf()+
                    "\nNome: "+usuario4.getNome()+
                    "\nTelefone: "+usuario4.getTelefone()+
                    "\nEmail: "+usuario4.getEmail()+
                    "\nData Nascimento: "+usuario4.getDataNascimento()+
                    "\nCargo: "+usuario4.getCargo()+
                    "\n--------------------------------------"+
                    "\nID: "+usuario5.getId()+
                    "\nCPF: "+usuario5.getCpf()+
                    "\nNome: "+usuario5.getNome()+
                    "\nTelefone: "+usuario5.getTelefone()+
                    "\nEmail: "+usuario5.getEmail()+
                    "\nData Nascimento: "+usuario5.getDataNascimento()+
                    "\nCargo: "+usuario5.getCargo()+
                    "\n--------------------------------------"
    );

    JOptionPane.showMessageDialog(null,
            "Dados de LOG:"+
                    "\nUsuário: "+log1.getUsuario().getId()+
                    "\nOperação: "+log1.getOperacao()+
                    "\nAção: "+log1.getAcao()+
                    "\nData Acesso: "+log1.getData()+
                    "\n---------------------------------------"+
                    "\nUsuário: "+log2.getUsuario().getId()+
                    "\nOperação: "+log2.getOperacao()+
                    "\nAção: "+log2.getAcao()+
                    "\nData Acesso: "+log2.getData()+
                    "\n---------------------------------------"+
                    "\nUsuário: "+log3.getUsuario().getId()+
                    "\nOperação: "+log3.getOperacao()+
                    "\nAção: "+log3.getAcao()+
                    "\nData Acesso: "+log3.getData()+
                    "\n---------------------------------------"+
                    "\nUsuário: "+log4.getUsuario().getId()+
                    "\nOperação: "+log4.getOperacao()+
                    "\nAção: "+log4.getAcao()+
                    "\nData Acesso: "+log4.getData()+
                    "\n---------------------------------------"+
                    "\nUsuário: "+log5.getUsuario().getId()+
                    "\nOperação: "+log5.getOperacao()+
                    "\nAção: "+log5.getAcao()+
                    "\nData Acesso: "+log5.getData()+
                    "\n---------------------------------------"
    );

    JOptionPane.showMessageDialog(null,
            "Dados Paciente:"+
                    "\nID Paciente: "+paciente1.getId()+
                    "\nCPF: "+ paciente1.getCpf()+
                    "\nNome: "+paciente1.getNome()+
                    "\nTelefone: "+paciente1.getTelefone()+
                    "\nEndereço: "+paciente1.getEndereco()+
                    "\nEmail: "+paciente1.getEmail()+
                    "\nData Nascimento: "+ paciente1.getDataNascimento()+
                    "\nAlergias: "+paciente1.getAlergias()+
                    "\nPlano de Saúde: "+paciente1.getPlano().getNome()+
                    "\n-----------------------------------"+
                    "\nID Paciente: "+paciente2.getId()+
                    "\nCPF: "+ paciente2.getCpf()+
                    "\nNome: "+paciente2.getNome()+
                    "\nTelefone: "+paciente2.getTelefone()+
                    "\nEndereço: "+paciente2.getEndereco()+
                    "\nEmail: "+paciente2.getEmail()+
                    "\nData Nascimento: "+ paciente2.getDataNascimento()+
                    "\nAlergias: "+paciente2.getAlergias()+
                    "\nPlano de Saúde: "+paciente2.getPlano().getNome()+
                    "\n-----------------------------------"+
                    "\nID Paciente: "+paciente3.getId()+
                    "\nCPF: "+ paciente3.getCpf()+
                    "\nNome: "+paciente3.getNome()+
                    "\nTelefone: "+paciente3.getTelefone()+
                    "\nEndereço: "+paciente3.getEndereco()+
                    "\nEmail: "+paciente3.getEmail()+
                    "\nData Nascimento: "+ paciente3.getDataNascimento()+
                    "\nAlergias: "+paciente3.getAlergias()+
                    "\nPlano de Saúde: "+paciente3.getPlano().getNome()+
                    "\n-----------------------------------"+
                    "\nID Paciente: "+paciente4.getId()+
                    "\nCPF: "+ paciente4.getCpf()+
                    "\nNome: "+paciente4.getNome()+
                    "\nTelefone: "+paciente4.getTelefone()+
                    "\nEndereço: "+paciente4.getEndereco()+
                    "\nEmail: "+paciente4.getEmail()+
                    "\nData Nascimento: "+ paciente4.getDataNascimento()+
                    "\nAlergias: "+paciente4.getAlergias()+
                    "\nPlano de Saúde: "+paciente4.getPlano().getNome()+
                    "\n-----------------------------------"+
                    "\nID Paciente: "+paciente5.getId()+
                    "\nCPF: "+ paciente5.getCpf()+
                    "\nNome: "+paciente5.getNome()+
                    "\nTelefone: "+paciente5.getTelefone()+
                    "\nEndereço: "+paciente5.getEndereco()+
                    "\nEmail: "+paciente5.getEmail()+
                    "\nData Nascimento: "+ paciente5.getDataNascimento()+
                    "\nAlergias: "+paciente5.getAlergias()+
                    "\nPlano de Saúde: "+paciente5.getPlano().getNome()+
                    "\n-----------------------------------"
    );

    JOptionPane.showMessageDialog(null,
            "Dados das Consultas: "+
                    "\nID Consulta: "+consulta1.getId()+
                    "\nTipo consulta: "+consulta1.getTipo()+
                    "\nPaciente: "+consulta1.getPaciente().getNome()+
                    "\nMédico: "+consulta1.getMedico().getNome()+
                    "\nData: "+consulta1.getDataHora()+
                    "\nStatus: "+consulta1.getStatus()+
                    "\nAnotações: "+consulta1.getAnotacoes()+
                    "\n--------------------------------------"+
                    "\nID Consulta: "+consulta2.getId()+
                    "\nTipo consulta: "+consulta2.getTipo()+
                    "\nPaciente: "+consulta2.getPaciente().getNome()+
                    "\nMédico: "+consulta2.getMedico().getNome()+
                    "\nData: "+consulta2.getDataHora()+
                    "\nStatus: "+consulta2.getStatus()+
                    "\nAnotações: "+consulta2.getAnotacoes()+
                    "\n--------------------------------------"+
                    "\nID Consulta: "+consulta3.getId()+
                    "\nTipo consulta: "+consulta3.getTipo()+
                    "\nPaciente: "+consulta3.getPaciente().getNome()+
                    "\nMédico: "+consulta3.getMedico().getNome()+
                    "\nData: "+consulta3.getDataHora()+
                    "\nStatus: "+consulta3.getStatus()+
                    "\nAnotações: "+consulta3.getAnotacoes()+
                    "\n--------------------------------------"+
                    "\nID Consulta: "+consulta4.getId()+
                    "\nTipo consulta: "+consulta4.getTipo()+
                    "\nPaciente: "+consulta4.getPaciente().getNome()+
                    "\nMédico: "+consulta4.getMedico().getNome()+
                    "\nData: "+consulta4.getDataHora()+
                    "\nStatus: "+consulta4.getStatus()+
                    "\nAnotações: "+consulta4.getAnotacoes()+
                    "\n--------------------------------------"+
                    "\nID Consulta: "+consulta5.getId()+
                    "\nTipo consulta: "+consulta5.getTipo()+
                    "\nPaciente: "+consulta5.getPaciente().getNome()+
                    "\nMédico: "+consulta5.getMedico().getNome()+
                    "\nData: "+consulta5.getDataHora()+
                    "\nStatus: "+consulta5.getStatus()+
                    "\nAnotações: "+consulta5.getAnotacoes()+
                    "\n--------------------------------------"
    );

    JOptionPane.showMessageDialog(null,
            "Exames realizados: "+
                    "\nId exame: "+exame1.getId()+
                    "\nCódigo TUSS: "+exame1.getCodigoTUSS()+
                    "\nDescrição: "+exame1.getDescricao()+
                    "\nLaboratório: "+exame1.getLaboratorio()+
                    "\nData do exame: "+exame1.getDataRealizacao()+
                    "\nResultado exame: "+exame1.getResultado()+
                    "\n-------------------------------------------"+
                    "\nId exame: "+exame2.getId()+
                    "\nCódigo TUSS: "+exame2.getCodigoTUSS()+
                    "\nDescrição: "+exame2.getDescricao()+
                    "\nLaboratório: "+exame2.getLaboratorio()+
                    "\nData do exame: "+exame2.getDataRealizacao()+
                    "\nResultado exame: "+exame2.getResultado()+
                    "\n-------------------------------------------"+
                    "\nId exame: "+exame3.getId()+
                    "\nCódigo TUSS: "+exame3.getCodigoTUSS()+
                    "\nDescrição: "+exame3.getDescricao()+
                    "\nLaboratório: "+exame3.getLaboratorio()+
                    "\nData do exame: "+exame3.getDataRealizacao()+
                    "\nResultado exame: "+exame3.getResultado()+
                    "\n-------------------------------------------"+
                    "\nId exame: "+exame4.getId()+
                    "\nCódigo TUSS: "+exame4.getCodigoTUSS()+
                    "\nDescrição: "+exame4.getDescricao()+
                    "\nLaboratório: "+exame4.getLaboratorio()+
                    "\nData do exame: "+exame4.getDataRealizacao()+
                    "\nResultado exame: "+exame4.getResultado()+
                    "\n-------------------------------------------"+
                    "\nId exame: "+exame5.getId()+
                    "\nCódigo TUSS: "+exame5.getCodigoTUSS()+
                    "\nDescrição: "+exame5.getDescricao()+
                    "\nLaboratório: "+exame5.getLaboratorio()+
                    "\nData do exame: "+exame5.getDataRealizacao()+
                    "\nResultado exame: "+exame5.getResultado()+
                    "\n-------------------------------------------"
    );

    JOptionPane.showMessageDialog(null,
            "Receitas emitidas: "+
                    "\nId Receita: "+receita1.getId()+
                    "\nData receita: "+receita1.getData()+
                    "\nMedicamentos receitados: "+receita1.getMedicamentos()+
                    "\nPrescritor: "+receita1.getPrescritor().getNome()+
                    "\nPaciente: "+receita1.getPaciente().getNome()+
                    "\n-----------------------------------------------"+
                    "\nId Receita: "+receita2.getId()+
                    "\nData receita: "+receita2.getData()+
                    "\nMedicamentos receitados: "+receita2.getMedicamentos()+
                    "\nPrescritor: "+receita2.getPrescritor().getNome()+
                    "\nPaciente: "+receita2.getPaciente().getNome()+
                    "\n-----------------------------------------------"+
                    "\nId Receita: "+receita3.getId()+
                    "\nData receita: "+receita3.getData()+
                    "\nMedicamentos receitados: "+receita3.getMedicamentos()+
                    "\nPrescritor: "+receita3.getPrescritor().getNome()+
                    "\nPaciente: "+receita3.getPaciente().getNome()+
                    "\n-----------------------------------------------"+
                    "\nId Receita: "+receita4.getId()+
                    "\nData receita: "+receita4.getData()+
                    "\nMedicamentos receitados: "+receita4.getMedicamentos()+
                    "\nPrescritor: "+receita4.getPrescritor().getNome()+
                    "\nPaciente: "+receita4.getPaciente().getNome()+
                    "\n-----------------------------------------------"+
                    "\nId Receita: "+receita5.getId()+
                    "\nData receita: "+receita5.getData()+
                    "\nMedicamentos receitados: "+receita5.getMedicamentos()+
                    "\nPrescritor: "+receita5.getPrescritor().getNome()+
                    "\nPaciente: "+receita5.getPaciente().getNome()+
                    "\n-----------------------------------------------"
    );

    JOptionPane.showMessageDialog(null,
            "Consultas online:"+
                    "\nId Consulta: "+consulta1.getId()+
                    "\nTipo consulta: "+consulta1.getTipoConsulta()+
                    "\nConsulta a distância ou presencial? "+consulta1.getTipo()+
                    "\nPaciente: "+consulta1.getPaciente().getNome()+
                    "\nMédico: "+consulta1.getMedico().getNome()+
                    "\nData: "+consulta1.getDataHora()+
                    "\nStatus: "+consulta1.getStatus()+
                    "\n-----------------------------------------------"+
                    "\nId Consulta: "+consulta2.getId()+
                    "\nTipo consulta: "+consulta2.getTipoConsulta()+
                    "\nConsulta a distância ou presencial? "+consulta2.getTipo()+
                    "\nPaciente: "+consulta2.getPaciente().getNome()+
                    "\nMédico: "+consulta2.getMedico().getNome()+
                    "\nData: "+consulta2.getDataHora()+
                    "\nStatus: "+consulta2.getStatus()+
                    "\n-----------------------------------------------"+
                    "\nId Consulta: "+ consulta3.getId()+
                    "\nTipo consulta: "+ consulta3.getTipoConsulta()+
                    "\nConsulta a distância ou presencial? "+ consulta3.getTipo()+
                    "\nPaciente: "+ consulta3.getPaciente().getNome()+
                    "\nMédico: "+ consulta3.getMedico().getNome()+
                    "\nData: "+ consulta3.getDataHora()+
                    "\nStatus: "+ consulta3.getStatus()+
                    "\n-----------------------------------------------"+
                    "\nId Consulta: "+consulta4.getId()+
                    "\nTipo consulta: "+consulta4.getTipoConsulta()+
                    "\nConsulta a distância ou presencial? "+consulta4.getTipo()+
                    "\nPaciente: "+consulta4.getPaciente().getNome()+
                    "\nMédico: "+consulta4.getMedico().getNome()+
                    "\nData: "+consulta4.getDataHora()+
                    "\nStatus: "+consulta4.getStatus()+
                    "\n-----------------------------------------------"+
                    "\nId Consulta: "+consulta5.getId()+
                    "\nTipo consulta: "+consulta5.getTipoConsulta()+
                    "\nConsulta a distância ou presencial? "+consulta5.getTipo()+
                    "\nPaciente: "+consulta5.getPaciente().getNome()+
                    "\nMédico: "+consulta5.getMedico().getNome()+
                    "\nData: "+consulta5.getDataHora()+
                    "\nStatus: "+consulta5.getStatus()+
                    "\n-----------------------------------------------"

            );

}catch (ParseException e){
    System.out.println("Erro ao criar despesas."+e.getMessage());

}finally {
    JOptionPane.showMessageDialog(null,"Programa finalizado com sucesso!");
}







    }
}