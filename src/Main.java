import javax.swing.*;
public class Main {
    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setContentPane(new Form1().menu);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
        JFrame frame = new JFrame();
        frame.setContentPane(new Form2().menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}