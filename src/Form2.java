import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 {
    private JPasswordField passwordField1;
    private JButton okButton;
    private JButton borrarButton;
    public JPanel menu;
    private JTextField username;

    public Form2() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (passwordField1.getText().equals("12345") && username.getText().equals("Alejandro")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al Sistema");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField1.setText("");
                username.setText("");
            }
        });
    }
}
