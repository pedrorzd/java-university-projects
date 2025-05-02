package Routine;

public class VideoChamada {
    private int id;
    private Consultas consultas;
    private String link;
    private boolean gravacaoAutorizada;

    public VideoChamada(int id, Consultas consultas, String link, boolean gravacaoAutorizada) {
        this.id = id;
        this.consultas = consultas;
        this.link = link;
        this.gravacaoAutorizada = gravacaoAutorizada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Consultas getConsultas() {
        return consultas;
    }

    public void setConsultas(Consultas consultas) {
        this.consultas = consultas;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isGravacaoAutorizada() {
        return gravacaoAutorizada;
    }

    public void setGravacaoAutorizada(boolean gravacaoAutorizada) {
        this.gravacaoAutorizada = gravacaoAutorizada;
    }

    public void iniciarChamada(){

    };
}
