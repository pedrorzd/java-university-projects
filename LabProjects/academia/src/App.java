import Estrutura.Aparelhos.Aparelhos;
import Estrutura.Aulas.Aulas;
import Estrutura.Produtos.Produtos;
import People.Alunos.Alunos;
import People.Colaboradores.Colaboradores;
import People.Fornecedores.Fornecedores;
import People.Professores.Professores;

public class App {
    public static void main(String[] args) {
        Aparelhos aparelho1 = new Aparelhos();
        Aparelhos aparelho2 = new Aparelhos();
        Aparelhos aparelho3 = new Aparelhos();

        Aulas aula1 = new Aulas();
        Aulas aula2 = new Aulas();
        Aulas aula3 = new Aulas();

        Produtos produto1 = new Produtos();
        Produtos produto2 = new Produtos();
        Produtos produto3 = new Produtos();

        Alunos aluno1 = new Alunos();
        Alunos aluno2 = new Alunos();
        Alunos aluno3 = new Alunos();

        Colaboradores colaborador1 = new Colaboradores();
        Colaboradores colaborador2 = new Colaboradores();
        Colaboradores colaborador3 = new Colaboradores();

        Fornecedores fornecedor1 = new Fornecedores();
        Fornecedores fornecedor2 = new Fornecedores();
        Fornecedores fornecedor3 = new Fornecedores();

        Professores professor1 = new Professores();
        Professores professor2 = new Professores();
        Professores professor3 = new Professores();

        //aparelhos
        aparelho1.setCodeAparelho(201);
        aparelho1.setNome("Pulley");
        aparelho1.setPossuiPeso(true);
        aparelho1.setPesoMaximo(120.0);
        aparelho1.setDataCompra("2025-01-10");
        System.out.println(aparelho1);

        aparelho2.setCodeAparelho(202);
        aparelho2.setNome("LegPress");
        aparelho2.setPossuiPeso(true);
        aparelho2.setPesoMaximo(400.0);
        aparelho2.setDataCompra("2024-12-01");
        System.out.println(aparelho2);

        aparelho3.setCodeAparelho(203);
        aparelho3.setNome("Esteira");
        aparelho3.setPossuiPeso(false);
        aparelho3.setPesoMaximo(0);
        aparelho3.setDataCompra("2024-12-10");
        System.out.println(aparelho3);

        //aulas
        aula1.setCodeAulas(301);
        aula1.setHoras(2);
        aula1.setNomeAula("Pilates");
        aula1.setDias("Segunda e Quarta");
        aula1.setHorarios("18:00 - 20:00");
        aula1.setCodeProfessor(professor2.getCodeProfessor());
        System.out.println(aula1);

        aula2.setCodeAulas(302);
        aula2.setHoras(1);
        aula1.setNomeAula("Zumba");
        aula2.setDias("Terça e Quinta");
        aula2.setHorarios("10:00 - 11:00");
        aula2.setCodeProfessor(professor3.getCodeProfessor());
        System.out.println(aula2);

        aula3.setCodeAulas(303);
        aula3.setHoras(3);
        aula1.setNomeAula("Funcional");
        aula3.setDias("Sexta");
        aula3.setHorarios("14:00 - 17:00");
        aula3.setCodeProfessor(professor1.getCodeProfessor());
        System.out.println(aula3);

        //produtos
        produto1.setCodeProdutos(401);
        produto1.setNomeProduto("Whey Protein");
        produto1.setQuantidade(30);
        produto1.setUltimaCompra("05/03/2025");
        produto1.setPreco(150.00);
        System.out.println(produto1);

        produto2.setCodeProdutos(402);
        produto2.setNomeProduto("Creatina");
        produto2.setQuantidade(50);
        produto2.setUltimaCompra("01/03/2025");
        produto2.setPreco(80.00);
        System.out.println(produto2);

        produto3.setCodeProdutos(403);
        produto3.setNomeProduto("Barras de Cereal");
        produto3.setQuantidade(100);
        produto3.setUltimaCompra("10/03/2025");
        produto3.setPreco(5.00);
        System.out.println(produto3);

        //alunos
        aluno1.setCodeAluno(501);
        aluno1.setNomeAluno("João Silva");
        aluno1.setCelularAluno("11987654321");
        aluno1.setEmailAluno("joao.silva@email.com");
        aluno1.setPreçoMensalidade(150.00);
        System.out.println(aluno1);

        aluno2.setCodeAluno(502);
        aluno2.setNomeAluno("Maria Oliveira");
        aluno2.setCelularAluno("11976543210");
        aluno2.setEmailAluno("maria.oliveira@email.com");
        aluno2.setPreçoMensalidade(150.00);
        System.out.println(aluno2);

        aluno3.setCodeAluno(503);
        aluno3.setNomeAluno("Carlos Souza");
        aluno3.setCelularAluno("11975432109");
        aluno3.setEmailAluno("carlos.souza@email.com");
        aluno3.setPreçoMensalidade(120.00);
        System.out.println(aluno3);

        //colaboradores
        colaborador1.setCodeColaborador(601);
        colaborador1.setNomeColaborador("Paulo Almeida");
        colaborador1.setCelularColaborador("11987654321");
        colaborador1.setFuncao("Gerente");
        colaborador1.setSalario(3500.00);
        System.out.println(colaborador1);

        colaborador2.setCodeColaborador(602);
        colaborador2.setNomeColaborador("Ana Costa");
        colaborador2.setCelularColaborador("11976543210");
        colaborador2.setFuncao("Atendente");
        colaborador2.setSalario(1500.00);
        System.out.println(colaborador2);

        colaborador3.setCodeColaborador(603);
        colaborador3.setNomeColaborador("Carlos Pereira");
        colaborador3.setCelularColaborador("11975432109");
        colaborador3.setFuncao("Assistente Administrativo");
        colaborador3.setSalario(2500.00);
        System.out.println(colaborador3);

        //fornecedores
        fornecedor1.setCodeFornecedor(701);
        fornecedor1.setNomeFornecedor("Fornecedor A");
        fornecedor1.setMercadoria("Suplementos Alimentares");
        fornecedor1.setEmailFornecedor("contato@fornecedora.com");
        fornecedor1.setCNPJ("12.345.678/0001-90");
        System.out.println(fornecedor1);

        fornecedor2.setCodeFornecedor(702);
        fornecedor2.setNomeFornecedor("Fornecedor B");
        fornecedor2.setMercadoria("Equipamentos de Academia");
        fornecedor2.setEmailFornecedor("vendas@fornecedorb.com");
        fornecedor2.setCNPJ("98.765.432/0001-01");
        System.out.println(fornecedor2);

        fornecedor3.setCodeFornecedor(703);
        fornecedor3.setNomeFornecedor("Fornecedor C");
        fornecedor3.setMercadoria("Roupas Esportivas");
        fornecedor3.setEmailFornecedor("suporte@fornecedorc.com");
        fornecedor3.setCNPJ("11.223.344/0001-55");
        System.out.println(fornecedor3);

        //professor
        professor1.setCodeProfessor(801);
        professor1.setNomeProfessor("Luciana Ferreira");
        professor1.setCelularProf("11987654321");
        professor1.setExperiencia("5 anos de experiência em treinamento físico");
        professor1.setHorariosAulas("Segunda a Sexta, 7:00 - 12:00");
        System.out.println(professor1);

        professor2.setCodeProfessor(802);
        professor2.setNomeProfessor("Carlos Souza");
        professor2.setCelularProf("11976543210");
        professor2.setExperiencia("10 anos de experiência em musculação e pilates");
        professor2.setHorariosAulas("Segunda, Quarta e Sexta, 14:00 - 20:00");
        System.out.println(professor2);

        professor3.setCodeProfessor(803);
        professor3.setNomeProfessor("Maria Oliveira");
        professor3.setCelularProf("11975432109");
        professor3.setExperiencia("3 anos de experiência em aulas de zumba");
        professor3.setHorariosAulas("Terça e Quinta, 8:00 - 12:00");
        System.out.println(professor3);
    }
}