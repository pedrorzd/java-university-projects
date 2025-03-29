import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal {
    private JPanel jPanelPrincipal;
    private JButton JBSair;

    public principal(){
        JFrame frame = new JFrame("Tela Principal");
        frame.setVisible(true);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(jPanelPrincipal);

        JBSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"Sair?");
                System.exit(0);
            }
        });



    }
}
