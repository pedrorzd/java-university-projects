import Controller.ImcClass;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        /*1.
        2. Gerenciador de Senhas (Variável Estática)
        Armazene uma senha padrão compartilhada entre todos os usuários.
        3. Contador de Acessos (Variável Estática + Bloco Estático)
        Conte quantas vezes um sistema foi acessado.
        4. Conversor de Moedas (Classe Utilitária Estática)
        Converta dólar para real usando uma taxa atualizada.
        5. Cache Simples em Memória (Variável Estática + Métodos Estáticos)
        Armazene(SIMULE usando um array do tipo Map) dados em cache para evitar recálculos
        ou acessos repetidos ao banco.
         Exemplo: usando o metodo : adicionacache(“user 1”,”Jose maria”)
         */

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


    }
}