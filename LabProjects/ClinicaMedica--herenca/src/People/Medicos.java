package People;

import java.util.Date;

public class Medicos {
    private int id;
    private String crm;
    private String nome;
    private String especialidade; // Cardiologia Pediátrica
    private boolean atendeTelemedicina;
    public boolean estaDisponivel(Date data){
        return false;
    };
}
