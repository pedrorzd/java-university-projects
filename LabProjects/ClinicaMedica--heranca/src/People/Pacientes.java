package People;

import Administrative.PlanosDeSaude;
import Validation.Validacao;

import javax.swing.*;
import java.util.ArrayList;

public class Pacientes extends PlanosDeSaude {
    private int id;
    private String cpf ;
    private String nome ;
    private String telefone ;
    private String endereco ;
    private String email ;
    private String dataNascimento ;
    private ArrayList<String> alergias;
    private PlanosDeSaude plano;

    public Pacientes(int id, String cpf, String nome, String telefone, String endereco, String email,
                     String dataNascimento, ArrayList<String> alergias, PlanosDeSaude plano) {
        super(plano.getNome(),plano.getDataInicio(),plano.getDataFim(),plano.getProcedimentos());
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.alergias = alergias;
        this.plano = plano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        Validacao.validarCpf(cpf);
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Validacao.validarNome(nome);
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        Validacao.validarTelefone(telefone);
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Validacao.validarEmail(email);
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public PlanosDeSaude getPlano() {
        return plano;
    }

    public void setPlano(PlanosDeSaude plano) {
        this.plano = plano;
    }

    // Verifica se o plano cobre um exame
    public void possuiCobertura(PlanosDeSaude procedimentos, String procedimentoPaciente) {
        for (String procedimento : procedimentos.getProcedimentos()) {
            if (procedimentoPaciente.contains(procedimento)==false){
                JOptionPane.showMessageDialog(null, "O plano não cobre o procedimento desejado!");
                return;
            }
            else{
                JOptionPane.showMessageDialog(null, "O plano cobre o procedimento desejado!");
            }
        }
    };
}
