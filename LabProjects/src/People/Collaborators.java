package People;

public class Collaborators {
    private String name;
    private int old;
    private String position;
    private double wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void imprimir() {
        System.out.println(
                "Nome: " + getName() + "\n" +
                        "Idade: " + getOld() + "\n" +
                        "Função: " + getPosition() + "\n" +
                        "Salário: " + getWage() + "\n"
        );
    }
}