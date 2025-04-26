package Estoques;

import java.util.Date;

public interface Estocavel {
    int getId();
    String getDescricao();
    String getDataValidade();
    int getQuantidade();
}
