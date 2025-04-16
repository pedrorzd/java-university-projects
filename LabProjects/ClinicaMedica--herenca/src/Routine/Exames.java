package Routine;

import People.Pacientes;

import java.util.Date;

public class Exames {
    private int id;
    private String codigoTUSS; // Padrão ANS
    private String descricao;
    private String laboratorio;
    private Date dataRealizacao;
    private String resultado;
    // SMS/Email
    public void enviarResultado(Pacientes paciente){};
}
