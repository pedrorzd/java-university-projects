import Controller.AcessController;
import Controller.CoinConversor;
import Controller.ImcClass;
import Controller.PasswordManeger;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

import static Controller.PasswordManeger.getUsers;
import static Controller.PasswordManeger.setUsers;


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
    }
}
