package Estrutura.Aparelhos;

public class Aparelhos {
    private int codeAparelho;
    private String nome;
    private boolean possuiPeso;
    private double pesoMaximo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodeAparelho() {
        return codeAparelho;
    }

    public void setCodeAparelho(int codeAparelho) {
        this.codeAparelho = codeAparelho;
    }

    public boolean isPossuiPeso() {
        return possuiPeso;
    }

    public void setPossuiPeso(boolean possuiPeso) {
        this.possuiPeso = possuiPeso;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public String toString() {
        return "Aparelho{" +
                "codeAparelho=" + codeAparelho +
                ", nome='" + nome + '\'' +
                ", possuiPeso=" + possuiPeso +
                ", pesoMaximo=" + pesoMaximo +
                '}';
    }



}
