package App.View;

import javax.swing.*;

public class Clientes extends JFrame {
    public JPanel painelClientes;
    private JTextField jTextNome;
    private JTextField jTextCpf;
    private JButton jButtonSave;
    private JLabel jLabelNome;
    private JLabel jLabelCpf;

    public Clientes(){
        setContentPane(painelClientes);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }
}
