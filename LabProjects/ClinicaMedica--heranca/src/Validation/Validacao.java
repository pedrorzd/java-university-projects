package Validation;

public class Validacao {

    public static void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo!");
        }
        if (nome.length() > 50) {
            throw new IllegalArgumentException("Nome não pode ter mais do que 50 caracteres!");
        }
    }

        public static void validarCpf(String cpf){
            if ( cpf== null || !cpf.matches("\\d{3}\\.?\\d{3}\\d{3}\\-?\\d{2}")){
                throw new IllegalArgumentException("CPF inválido!");
            }
        }

        public static void validarTelefone(String telefone){
            if(telefone == null || !telefone.matches("^\\(?(\\d{2})\\)?[\\s-]?(\\d{4,5})[\\s-]?(\\d{4})$")){
                throw new IllegalArgumentException("CPF Inválido!");
            }
        }

        public static void validarEmail(String email){
        if (email == null || !email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")){
          throw new IllegalArgumentException("Email Inválido!");
            }
        }


}
