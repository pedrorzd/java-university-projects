package Entities;

import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Portaria {
    private Colaboradores colaborador;
    private LocalTime horarioAtual;

    public Portaria(Colaboradores colaborador) {
        this.colaborador = colaborador;
        this.horarioAtual = LocalTime.now();  // Obtendo o horário atual
    }

    public Colaboradores getColaborador() {
        return this.colaborador;
    }

    public void setColaborador(Colaboradores colaborador) {
        this.colaborador = colaborador;
    }

    // Método para obter o horário atual formatado
    public String getHorarioAtualFormatado() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return horarioAtual.format(formatter);  // Retorna o horário atual no formato "HH:mm"
    }

    // Método para obter o turno (hora de entrada e saída)
    public String getTurno() {
        // Supondo que o turno seja das 19:30 às 07:30
        return "19:30 às 07:30";
    }

    // Método para exibir as informações em uma janela de diálogo
    public void exibirInformacoes() {
        String informacoes = "Horário atual: " + getHorarioAtualFormatado() + "\n" +
                "Porteiro: " + colaborador.getNomeColaborador() + "\n" +
                "Turno: " + getTurno();

        // Exibe as informações em um JOptionPane
        JOptionPane.showMessageDialog(null, informacoes, "Informações de Portaria", JOptionPane.INFORMATION_MESSAGE);
    }
}
