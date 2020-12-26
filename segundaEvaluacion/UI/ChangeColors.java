package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class ChangeColors extends JFrame {
    private JLabel blue;
    private JLabel red;
    private JLabel green;
    private JLabel yellow;
    private JPanel panel1;

    public ChangeColors(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 300, 400, 400);
        blue.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                panel1.setBackground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                resetBackgroundColor();
            }
        });
        red.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                panel1.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                resetBackgroundColor();
            }
        });
        green.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                panel1.setBackground(Color.green);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                resetBackgroundColor();
            }
        });
        yellow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                panel1.setBackground(Color.yellow);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                resetBackgroundColor();
            }
        });
        panel1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                panel1.setBackground(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            }
        });
    }

    private void resetBackgroundColor() {
        panel1.setBackground(Color.white);
    }

    public static void main(String[] args) {
        ChangeColors frame = new ChangeColors("Cambiar Color");
        frame.setVisible(true);
    }

}
