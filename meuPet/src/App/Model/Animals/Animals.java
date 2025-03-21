package App.Model.Animals;

public class Animals {
    private int id;
    private String nome;
    private double peso;
    private double raca;
    private int IdTutor;
    private boolean alergias;

    public Animals(int id, String nome, double peso, double raca, int IdTutor, boolean alergias) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.raca = raca;
        this.IdTutor = IdTutor;
        this.alergias = alergias;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getRaca() {
        return raca;
    }

    public int getIdTutor() {
        return IdTutor;
    }

    public boolean getAlergias() {
        return alergias;
    }

    @Override
    public String toString() {
        return  "Dados do Animal: \n"+
                "Id: "+id+
                "Nome: "+nome+
                "Peso: "+peso+
                "Raça: "+raca+
                "Id Tutor: "+IdTutor+
                "Possui alergías? " + alergias;
    }
}

