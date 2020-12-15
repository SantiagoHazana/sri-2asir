package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.*;

public class MoverVentana extends JFrame {

    private JButton subirButton;
    private JButton derechaButton;
    private JButton izquierdaButton;
    private JButton bajarButton;
    private JPanel panel1;

    public MoverVentana(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 300, 300, 300);

        subirButton.addActionListener(e -> this.setBounds(this.getX(), this.getY() - 5, 300, 300));
        bajarButton.addActionListener(e -> this.setBounds(this.getX(), this.getY() + 5, 300, 300));
        derechaButton.addActionListener(e -> this.setBounds(this.getX() + 5, this.getY(), 300, 300));
        izquierdaButton.addActionListener(e -> this.setBounds(this.getX() - 5, this.getY(), 300, 300));

    }

    public static void main(String[] args) {
        MoverVentana frame = new MoverVentana("Moviendo ventana");
        frame.setVisible(true);
    }

}
