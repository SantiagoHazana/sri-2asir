package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtons extends JFrame {
    private JPanel panel1;
    private JRadioButton arialRadioButton;
    private JRadioButton tahomaRadioButton;
    private JRadioButton timesNewRomanRadioButton;
    private JLabel label;
    private JRadioButton blueRadioButton;
    private JRadioButton redRadioButton;
    private JRadioButton greenRadioButton;
    private JToggleButton defaultToggle;

    private Font defaultFont;

    public RadioButtons(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 300, 500, 300);
        defaultFont = label.getFont();

        arialRadioButton.addActionListener(e -> label.setFont(new Font("Arial", label.getFont().getStyle(), label.getFont().getSize())));
        timesNewRomanRadioButton.addActionListener(e -> label.setFont(new Font("TimesNewRoman", label.getFont().getStyle(), label.getFont().getSize())));
        tahomaRadioButton.addActionListener(e -> label.setFont(new Font("Tahoma", label.getFont().getStyle(), label.getFont().getSize())));
        blueRadioButton.addActionListener(e -> label.setForeground(Color.blue));
        redRadioButton.addActionListener(e -> label.setForeground(Color.red));
        greenRadioButton.addActionListener(e -> label.setForeground(Color.green));
        defaultToggle.addActionListener(e -> {
            label.setFont(defaultFont);
            label.setForeground(Color.black);
        });
    }

    public static void main(String[] args) {
        RadioButtons frame = new RadioButtons("Radio buttons");
        frame.setVisible(true);
    }

}
