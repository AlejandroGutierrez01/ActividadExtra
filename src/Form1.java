import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Form1 {
    private JButton multiplicacionbtn;
    private JButton divisionbtn;
    private JButton sumabtn;
    private JButton restabtn;
    private JTextField numero1;
    private JTextField numero2;
    private JLabel labelMostrar;
    private JLabel labelRespuesta;
    public JPanel menu;

    public Form1() {
        sumabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1 = numero1.getText();
                String n2 = numero2.getText();
                double num1 = Double.parseDouble(n1);
                double num2 = Double.parseDouble(n2);
                double resultado = num1 + num2;
                labelRespuesta.setText(""+resultado);
            }
        });
        multiplicacionbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1 = numero1.getText();
                String n2 = numero2.getText();
                double num1 = Double.parseDouble(n1);
                double num2 = Double.parseDouble(n2);
                double resultado = num1 * num2;
                labelRespuesta.setText(""+resultado);
            }
        });
        restabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String n1 = numero1.getText();
                    String n2 = numero2.getText();
                    double num1 = Double.parseDouble(n1);
                    double num2 = Double.parseDouble(n2);
                    double resultado = num1 - num2;
                    labelRespuesta.setText(""+resultado);
            }
        });
        divisionbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String n1 = numero1.getText();
                    String n2 = numero2.getText();
                    double num1 = Double.parseDouble(n1);
                    double num2 = Double.parseDouble(n2);
                    if (num1 == 0.0 || num2 == 0.0) {
                        labelRespuesta.setText("No se puede dividir para 0");
                    }
                    double resultado = num1 / num2;
                    labelRespuesta.setText(""+resultado);
            }
        });
    }
}
