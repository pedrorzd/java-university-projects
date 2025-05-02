package Estoques;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

//agregaçao
public class EstoqueGeral {

        private ArrayList<ItensEstoque> itemsEstoqueArrayList;
        private ArrayList<Medicamentos> medicamentosArrayList;

        ItensEstoque item1 = new ItensEstoque(10, "Álcool em gel", 50, "10/12/2025", "Higiene");
        ItensEstoque item2 = new ItensEstoque(20, "Luvas descartáveis", 200, "01/11/2025", "Proteção");
        ItensEstoque item3 = new ItensEstoque(30, "Soro fisiológico", 80, "15/10/2025", "Medicamento");
        ItensEstoque item4 = new ItensEstoque(40, "Máscaras cirúrgicas", 150, "20/09/2025", "Proteção");
        ItensEstoque item5 = new ItensEstoque(50, "Algodão", 100, "05/01/2026", "Curativo");

        Medicamentos medicamento1 = new Medicamentos(100, "Paracetamol 500mg", "15/09/2025",7 , 20, "1 comprimido a cada 8 horas");
        Medicamentos medicamento2 = new Medicamentos(200, "Ibuprofeno 400mg", "01/10/2025",45 , 30, "1 comprimido após as refeições");
        Medicamentos medicamento3 = new Medicamentos(300, "Amoxicilina 500mg", "22/08/2025",32 , 21, "1 comprimido de 8 em 8 horas por 7 dias");
        Medicamentos medicamento4 = new Medicamentos(400, "Loratadina 10mg", "10/12/2025", 27, 10, "1 comprimido por dia");
        Medicamentos medicamento5 = new Medicamentos(500, "Omeprazol 20mg", "05/11/2025", 18, 14, "1 comprimido em jejum");


        public ArrayList<ItensEstoque> getItemsEstoqueArrayList() {
            return itemsEstoqueArrayList;
        }

        public void setItemsEstoqueArrayList(ArrayList<ItensEstoque> itemsEstoqueArrayList) {
            this.itemsEstoqueArrayList = itemsEstoqueArrayList;
        }

        public ArrayList<Medicamentos> getMedicamentosArrayList() {
            return medicamentosArrayList;
        }

        public void setMedicamentosArrayList(ArrayList<Medicamentos> medicamentosArrayList) {
            this.medicamentosArrayList = medicamentosArrayList;
        }

        // Avisa quando está acabando
        public void alertaReposicao() {
            for (ItensEstoque item : itemsEstoqueArrayList) {
                if (item.getQuantidade() < 10){
                    JOptionPane.showMessageDialog(null, "O item: " + item.getDescricao()
                            + "\nEstá com poucas unidades, providenciar reposição."
                    );
                }
            }
            for (Medicamentos medicamento : medicamentosArrayList) {
                if (medicamento.getQuantidade()<10) {
                    JOptionPane.showMessageDialog(null, "O medicamento: "+ medicamento.getDescricao()
                            +"\nEstá com poucas unidades, providenciar reposição."
                    );
                }
            }
        };
}
