package App.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    public JPanel painelPrincipal;
    private JMenuBar jMenuBarPrincipal;
    private JMenu jMenuCadastro;
    private JMenuItem jItemClientes;

    public Principal(){
        jItemClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Clientes();
            }
        });
    }

}
