package Financeiro;

import Funcionarios.Funcionarios;
import Funcionarios.Bonificacao;

import java.util.List;

public class FolhaPagamento {
    public void imprimirFolha(List<Funcionarios> funcionarios){
        for (Funcionarios f : funcionarios){
            System.out.println("Nome :" + f.getNome());
            System.out.println("Matricula :" + f.getMatricula());
            System.out.println("Salario final :" + f.calculaSalario());

            if (f instanceof Bonificacao){
                Bonificacao b = (Bonificacao) f;
                System.out.println("Bonificaçao: R$ " + b.getBonificacao());
            }
            System.out.println("---------------------------------");
        }
    }
}
