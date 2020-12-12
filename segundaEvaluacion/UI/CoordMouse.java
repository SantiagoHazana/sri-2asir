package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class CoordMouse extends JFrame{
    private JPanel panel1;
    private JLabel label;

    public CoordMouse(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 300, 400, 300);


        panel1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                label.setText("Raton: ("+getMousePosition().x+", "+getMousePosition().y+")");
            }
        });
    }

    public static void main(String[] args) {
        CoordMouse frame = new CoordMouse("Pos Mouse");
        frame.setVisible(true);
    }
}
