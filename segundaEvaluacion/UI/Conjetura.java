package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conjetura extends JFrame {
    private JTextArea textAreaResult;
    private JButton buttonShow;
    private JTextField textFieldMin;
    private JTextField textFieldMax;
    private JPanel panel1;
    private int min;
    private int max;
    private String result;

    public Conjetura(String title){
        super(title);
        result = "";
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 1200, 600);
        buttonShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                min = Integer.parseInt(textFieldMin.getText());
                max = Integer.parseInt(textFieldMax.getText());
                for (int i = min; i <= max; i++) {
                    result += conjetura(i);
                }
                textAreaResult.setText(result);
            }
        });
    }

    public String conjetura(int num){
        String res = "";
        int pasos = 0;
        while (num!=1){
            pasos++;
            if (num%2==0){
                res += num + "(par) -> ";
                num/=2;
            }else{
                res += num + "(impar) -> ";
                num = num * 3 + 1;
            }
        }
        res += num + "(" + pasos + " pasos)\n";
        return res;
    }

    public static void main(String[] args) {
        Conjetura frame = new Conjetura("Conjetura");
        frame.setVisible(true);
    }

}
