package segundaEvaluacion.UI;

import javax.swing.*;

public class OtherElements extends JFrame {
    private JCheckBox checkBoxBold;

    public OtherElements(String title){
        super(title);

    }

    public static void main(String[] args) {
        OtherElements frame = new OtherElements("More");
        frame.setVisible(true);
    }
}
