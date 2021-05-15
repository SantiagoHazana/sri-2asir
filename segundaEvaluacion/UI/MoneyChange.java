package segundaEvaluacion.UI;

import javax.swing.*;

public class MoneyChange extends JFrame {
    private JPanel panel1;

    public MoneyChange(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 600, 300);
    }

    public static void main(String[] args) {
        MoneyChange frame = new MoneyChange("Converson de Monedas");
        frame.setVisible(true);
    }

}
