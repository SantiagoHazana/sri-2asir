package segundaEvaluacion.UI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SliderColors extends JFrame {
    private JSlider redSlider;
    private JPanel panel1;
    private JSlider greenSlider;
    private JSlider blueSlider;
    private JLabel redLabel;
    private JLabel greenLabel;
    private JLabel blueLabel;

    public SliderColors(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(500, 500, 600, 400);

        this.getContentPane().setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));

        redSlider.addChangeListener(e -> {
            this.getContentPane().setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
            redLabel.setText("Red: " + redSlider.getValue());
        });
        greenSlider.addChangeListener(e -> {
            this.getContentPane().setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
            greenLabel.setText("Green: " + greenSlider.getValue());
        });
        blueSlider.addChangeListener(e -> {
            this.getContentPane().setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
            blueLabel.setText("Blue: " + blueSlider.getValue());
        });
    }

    public static void main(String[] args) {
        SliderColors frame = new SliderColors("Colors with sliders");
        frame.setVisible(true);
    }
}
