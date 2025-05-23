import Controller.CoinConversor;

import javax.swing.*;
import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        4. Conversor de Moedas (Classe Utilitária Estática)
        Converta dólar para real usando uma taxa atualizada.

        5. Cache Simples em Memória (Variável Estática + Métodos Estáticos)
        Armazene(SIMULE usando um array do tipo Map) dados em cache para evitar recálculos
        ou acessos repetidos ao banco.

        Exemplo: usando o metodo : adicionacache(“user 1”,”Jose maria”)
         */
/*
        JOptionPane.showMessageDialog(null, "Iniciando exec 1");
        String valorPeso = JOptionPane.showInputDialog(null,"Escreva o valor do peso e da altura, em quilos e metros, respectivamente"
                +"\nPeso em Kg's");
        double valorPesoDouble = Double.parseDouble(valorPeso);
        String valorAltura = JOptionPane.showInputDialog(null,"Altura em metros");
        double valorAlturaDouble = Double.parseDouble(valorAltura);
        double valorIMC = ImcClass.calcularImc(valorPesoDouble,valorAlturaDouble);
        double valorFormatado = (double) Math.round(valorIMC * 100) /100;
        JOptionPane.showMessageDialog(null, "Resultado do calculo do IMC: "+
                "\n"+valorFormatado);



        JOptionPane.showMessageDialog(null, "Iniciando exec 2");

        String senhaPadrao = JOptionPane.showInputDialog(null,"Digite a senha padrão que será compartilhada com todos os usuários: ");
        PasswordManeger senhaPadraoUsuarios = new PasswordManeger(senhaPadrao);
        String userNovo = JOptionPane.showInputDialog(null, "Digite o nome do usuário para ser adicionado no sistema: ");
        setUsers(userNovo);
        while(userNovo != null ) {
            userNovo = JOptionPane.showInputDialog(null, "Digite o nome do usuário para ser adicionado no sistema: "+
                    "\nPara encerrar o programa aperte em 'Cancel!'");
            setUsers(userNovo);
        }

        JOptionPane.showMessageDialog(null, "O campo anterior estava vazio. Programa finalizado. ");
        PasswordManeger.removeLastUser();
        JOptionPane.showMessageDialog(null, "Dados inseridos: " +
                "\nSenha padão do sistema: " +senhaPadraoUsuarios.getSenha()+
                "\nUsuários adicionados: " +PasswordManeger.getUsers()
        );



        JOptionPane.showMessageDialog(null, "Iniciando exec 3");
        String acessUserName = JOptionPane.showInputDialog(null, "Digite o nome do usuário que irá acessar o sistema: ");
        AcessController contadorUsuarios = new AcessController(acessUserName);
        while (acessUserName != null) {
            acessUserName = JOptionPane.showInputDialog(null, "Digite o nome do usuário que irá acessar o sistema: "+
                    "\nPara encerrar o programa aperte em 'Cancel!'");
            AcessController.setUserAcessList(acessUserName);
        }
        JOptionPane.showMessageDialog(null, "Usuarios que entraram no sistema: \n"+AcessController.getUserAcessList()+
                "\nQuantidade de acessos: "+AcessController.getCounter());
    */

        JOptionPane.showMessageDialog(null, "Iniciando exec 4");
        CoinConversor coinConversor = new CoinConversor();
        coinConversor.getCoinValues();

        CoinConversor.getValorBtc();
        CoinConversor.getValorUsd();

        String[] opcoes = {"Dólar", "Bitcoin"};
        int conversor = JOptionPane.showOptionDialog(null,
                "Qual valor você deseja ver em reais?",
                "Conversor de moeda",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (conversor != 0 && conversor != 1) {
            JOptionPane.showMessageDialog(null,
                    "Programa encerrado!");
        }
        else if (conversor == 0) {
            String valorDolarString = JOptionPane.showInputDialog(
                    null,
                    "Digite o valor em dólar para converter"+
                            "\nCotação atual: R$"+CoinConversor.getValorUsd()
            );
            double valorReaisParaUsd = Double.parseDouble(valorDolarString);

            double valorConvertido = CoinConversor.getValorConvertido(valorReaisParaUsd,CoinConversor.getValorUsd());

            JOptionPane.showMessageDialog(null,
                    "Convertido com sucesso "+
                            "\nO valor do dólar em reais é :\n R$ "+valorConvertido);
        }
        else if (conversor == 1) {
            String valorBitString = JOptionPane.showInputDialog(
                    null,
                    "Digite a quantidade de bitcoins para converter"+
                            "\nCotação atual: R$"+CoinConversor.getValorBtc()
            );
            double valorReaisParaBtc = Double.parseDouble(valorBitString);

            double valorConvertido = CoinConversor.getValorConvertido(valorReaisParaBtc,CoinConversor.getValorBtc());

            JOptionPane.showMessageDialog(null,
                    "Convertido com sucesso "+
                    "\nO valor de Bitcoins em reais é :\n R$ "+valorConvertido);
        }

    }
}
