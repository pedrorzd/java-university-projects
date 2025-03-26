package People.Alunos;

public class Alunos {
    private int codeAluno;
    private String nomeAluno;
    private String celularAluno;
    private String emailAluno;
    private double preçoMensalidade;

    public int getCodeAluno() {
        return codeAluno;
    }

    public void setCodeAluno(int codeAluno) {
        this.codeAluno = codeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCelularAluno() {
        return celularAluno;
    }

    public void setCelularAluno(String celularAluno) {
        this.celularAluno = celularAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public double getPreçoMensalidade() {
        return preçoMensalidade;
    }

    public void setPreçoMensalidade(double preçoMensalidade) {
        this.preçoMensalidade = preçoMensalidade;
    }

    public String toString() {
        return "\nAluno: \n"+
                "\nCódigo Aluno: " + getCodeAluno()+
                "\nNome Aluno: " + getNomeAluno()+
                "\nCelular Aluno: " + getCelularAluno()+
                "\nEmail: "+ getEmailAluno()+
                "\nValor Mensalidade: "+getPreçoMensalidade();

    }
}
