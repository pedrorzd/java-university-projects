package Entities;

import javax.swing.*;
import java.awt.*;

public class Portaria {
    private Colaboradores colaborador;

    public Portaria(Colaboradores colaborador) {
        this.colaborador = colaborador;
    }

    public Colaboradores getColaborador() {
        return this.colaborador;
    }

    public void setColaborador(Colaboradores colaborador) {
        this.colaborador = colaborador;
    }

}
