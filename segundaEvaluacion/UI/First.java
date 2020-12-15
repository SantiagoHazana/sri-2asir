package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.*;

public class First extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton cambiarTextoButton;
    private JLabel texto;
    private JButton exitButton;

    public First(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 450, 300);
        cambiarTextoButton.addActionListener(e -> texto.setText(textField1.getText()));
        exitButton.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        First frame = new First("Primer ventana");
        frame.setVisible(true);
    }

}
