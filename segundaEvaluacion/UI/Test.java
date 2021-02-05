package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Test extends JFrame {
    private JPanel panel1;
    private JLabel testLabel;

    public Test(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 600, 400);
        testLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                testLabel.setText("Hubo un click");
            }
        });
    }

    public static void main(String[] args) {
        Test frame = new Test("Test");
        frame.setVisible(true);
    }

}
