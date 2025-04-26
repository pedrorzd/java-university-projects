package App.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    public JPanel painelPrincipal;
    private JMenuBar jMenuBarPrincipal;
    private JMenu jMenuCadastro;
    private JMenuItem jItemClientes;
    private JMenuItem jItemAnimais;
    private JMenuItem jItemProdutos;

    public Principal(){
        setContentPane(painelPrincipal);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        jItemClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Clientes();
            }
        });
    }

}
