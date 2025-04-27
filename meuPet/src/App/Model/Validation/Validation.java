package App.Model.Validation;

import java.util.Scanner;

public class Validation {

    public static void validarCpf(String cpf) {
            if (cpf == null || !cpf.matches("\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")) {
                throw new IllegalArgumentException("CPF inválido");
            }
        }

    public static void validarNumero(String numero) {
        if (numero == null || !numero.matches("^\\(?(\\d{2})\\)?[\\s-]?(\\d{4,5})[\\s-]?(\\d{4})$")) {
            throw new IllegalArgumentException("O formato do número de telefone está incorreto!");
        }
    }

    public static void validarEmail(String email) {
        if (email == null || !email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public static void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        if (nome.length() < 3) {
            throw new IllegalArgumentException("O nome é muito pequeno, insira um nome válido");
        }
    }
    public static void validarEndereco(String endereco){
            if (endereco == null || endereco.trim().isEmpty()) {
                throw new IllegalArgumentException("O endereço não pode estar vazio");
            }
        }


}

