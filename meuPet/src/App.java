import App.View.Login;
import App.View.Principal;

import javax.swing.*;

public class App {

    public static void main(String []args){
        JFrame f = new JFrame();
        f.setContentPane(new Login().LoginPrincipal);
        f.setSize(500,500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
