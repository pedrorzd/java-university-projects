package Controller;

public class PasswordManeger {
    private String userName;
    private static String senha;

    public PasswordManeger(String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        PasswordManeger.senha = senha;
    }
}
