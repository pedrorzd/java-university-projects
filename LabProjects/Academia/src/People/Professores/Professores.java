package People.Professores;

public class Professores {
    private int codeProfessor;
    private String nomeProfessor;
    private String celularProf;
    private String experiencia;
    private String horariosAulas;


    public int getCodeProfessor() {
        return codeProfessor;
    }

    public void setCodeProfessor(int codeProfessor) {
        this.codeProfessor = codeProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getCelularProf() {
        return celularProf;
    }

    public void setCelularProf(String celularProf) {
        this.celularProf = celularProf;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getHorariosAulas() {
        return horariosAulas;
    }

    public void setHorariosAulas(String horariosAulas) {
        this.horariosAulas = horariosAulas;
    }

    public String toString() {
        return "\nProfessor: \n"+
                "\ncodigo: " + getCodeProfessor()+
                "\nNome: " + getNomeProfessor()+
                "\nCelular: " + getCelularProf()+
                "\nExperiência: "+ getExperiencia()+
                "\nHorarios: "+ getHorariosAulas();

    }
}
