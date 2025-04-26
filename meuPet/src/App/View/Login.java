package App.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login extends JFrame {
    public JPanel LoginPrincipal;
    private JPanel JPainelLateral;
    private JPanel JPanelTopo;
    private JPanel JPainelButtons;
    private JButton JButtonLogar;
    private JButton JButtonSair;
    private JComboBox JMenuTipoLogin;
    private JPanel JPainelUser;
    private JPanel JPainelPassword;
    private JPasswordField JPasswordField;
    private JTextField JUserField;

    public Login() {
        JButtonLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = JUserField.getText();
                String senha = new String(JPasswordField.getPassword());
                String perfil = String.valueOf(JMenuTipoLogin.getSelectedItem());

                if (usuario.equals("Pedro") && senha.equals("12345")) {
                    JOptionPane.showMessageDialog(null,
                            "Login efetuado com sucesso! " +
                                    "\nUsuário: " + usuario +
                                    "\nPerfil do Usuário: " + perfil
                    );
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(LoginPrincipal);
                    frame.dispose();
                    SwingUtilities.invokeLater(() -> {
                        Principal telaPrincipal = new Principal();
                        telaPrincipal.setVisible(true);
                    });
                } else {
                    JUserField.requestFocus();
                    JUserField.setText("");
                    JPasswordField.setText("");
                }
            }
        });


        JUserField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                JUserField.setBackground(Color.getHSBColor(0,0,0));
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                JUserField.setBackground(Color.getHSBColor(0,0,0));
            }
        });

        JPasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                JPasswordField.setBackground(Color.getHSBColor(0,0,0));
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                JPasswordField.setBackground(Color.getHSBColor(0,0,0));
            }
        });

        /*JButtonSair.addActionListener(new ActionListener() {
        @Override
        Public void actionPerformed(ActionEvent e) {

           }
        });
        */


    }
}

