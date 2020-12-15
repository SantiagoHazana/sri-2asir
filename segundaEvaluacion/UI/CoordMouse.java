package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.font.TextAttribute;
import java.util.Map;

public class CoordMouse extends JFrame {
    private JPanel panel1;
    private JLabel label;
    private JCheckBox boldCheckBox;
    private JCheckBox italicCheckBox;
    private JCheckBox underlineCheckBox;

    public CoordMouse(String title) {
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
                label.setText("Raton: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        boldCheckBox.addChangeListener(e -> {
            label.setFont(label.getFont().deriveFont(label.getFont().getStyle() ^ Font.BOLD));
        });
        italicCheckBox.addChangeListener(e -> {
            label.setFont(label.getFont().deriveFont(label.getFont().getStyle() ^ Font.ITALIC));
        });
        underlineCheckBox.addChangeListener(e -> {
            Font font = label.getFont();
            if (underlineCheckBox.isSelected()) {
                Map attributes = font.getAttributes();
                attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                label.setFont(font.deriveFont(attributes));
            } else {
                label.setFont(new Font(font.getName(), font.getStyle(), font.getSize()));
            }
        });
    }

    public static void main(String[] args) {
        CoordMouse frame = new CoordMouse("Pos Mouse");
        frame.setVisible(true);
    }

}
