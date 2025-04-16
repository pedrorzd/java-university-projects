package People;

import Administrative.PlanosDeSaude;

import java.util.Date;

public class Pacientes {
    private int id;
    private String cpf ;
    private String nome ;
    private String telefone ;
    private String endereco ;
    private String email ;
    private Date dataNascimento ;
    private ArrayList<String> alergias;
    // Associação com Plano de Saúde
    private PlanosDeSaude plano;
    // Verifica se o plano cobre um exame
    private boolean possuiCobertura(String procedimento){
        return false;
    };
}
