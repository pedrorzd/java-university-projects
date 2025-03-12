package Estrutura.Aulas;

public class Aulas {
    private int codeAulas;
    private int horas;
    private String nomeAula;
    private String dias;
    private String horarios;
    private int codeProfessor;

    public int getCodeAulas() {
        return codeAulas;
    }

    public void setCodeAulas(int codeAulas) {
        this.codeAulas = codeAulas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNomeAula() {
        return nomeAula;
    }

    public void setNomeAula(String nomeAula) {
        this.nomeAula = nomeAula;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public int getCodeProfessor() {
        return codeProfessor;
    }

    public void setCodeProfessor(int codeProfessor) {
        this.codeProfessor = codeProfessor;
    }


    public String toString() {
        return "Aulas: \n"+
                "\ncodigo: " + getCodeAulas()+
                "\nHoras Semanais: " + getHoras()+
                "\nNome Aula: " + getNomeAula()+
                "\nDias: "+ getDias()+
                "\nHorarios: "+getHorarios()+
                "\nCódigo Professor: "+getCodeProfessor();

    }

}
