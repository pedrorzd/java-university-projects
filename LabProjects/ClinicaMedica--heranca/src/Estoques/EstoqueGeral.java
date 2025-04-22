package Estoques;

import java.util.ArrayList;

//agregaçao
public class EstoqueGeral {

        private ArrayList<ItensEstoque> itemsEstoqueArrayList;
        private ArrayList<Medicamentos> medicamentosArrayList;


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
        };
}
