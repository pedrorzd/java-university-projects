package Controller;

import java.util.ArrayList;

public class PasswordManeger {
    private String userName;
    private static String senha;
    private static ArrayList<String> users;

    public PasswordManeger(String senha){
        users = new ArrayList<>();
        this.senha = senha;
    }

    public PasswordManeger(String userName, String senha) {
        users = new ArrayList<>();
        this.userName = userName;
        this.senha = senha;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        users.add(userName);
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        PasswordManeger.senha = senha;
    }

    public static ArrayList<String> getUsers() {
        return users;
    }

    public static void setUsers(String userName) {
       users.add(userName);
    }

    public static void removeLastUser(){
        users.remove(users.removeLast());
    }
}
