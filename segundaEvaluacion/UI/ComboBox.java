package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {
    private JComboBox comboBox1;
    private JPanel panel1;
    private JLabel label;

    public ComboBox(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 300, 500, 300);
        comboBox1.setRenderer(new CustomComboBoxRenderer());
        Font[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        for (Font font : fonts) {
            comboBox1.addItem(font);
        }
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font fontName = (Font) comboBox1.getModel().getElementAt(comboBox1.getSelectedIndex());
                label.setText(fontName.getName());
                label.setFont(new Font(fontName.getName(), label.getFont().getStyle(), label.getFont().getSize()));
            }
        });
    }

    public static void main(String[] args) {
        ComboBox frame = new ComboBox("Combo loco");
        frame.setVisible(true);
    }

    public class CustomComboBoxRenderer extends JLabel implements ListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Font font = (Font) value;
            setText(font.getName());
            setFont(new Font(font.getName(), font.getStyle(), 13));
            return this;
        }
    }
}

