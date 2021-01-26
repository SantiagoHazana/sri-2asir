package segundaEvaluacion.UI;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
        buttonShow.addActionListener(e -> {
            min = Integer.parseInt(textFieldMin.getText());
            max = Integer.parseInt(textFieldMax.getText());

            if (min > max){
                int temp = min;
                min = max;
                max = temp;
            }
            result = "";
            for (int i = min; i <= max; i++) {
                result += conjetura(i);
            }
            textAreaResult.setText(result);
        });

        PlainDocument doc = (PlainDocument) textFieldMin.getDocument();
        doc.setDocumentFilter(new MyIntFilter());
        PlainDocument doc2 = (PlainDocument) textFieldMax.getDocument();
        doc2.setDocumentFilter(new MyIntFilter());
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

class MyIntFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string,
                             AttributeSet attr) throws BadLocationException {

        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.insert(offset, string);

        if (test(sb.toString())) {
            super.insertString(fb, offset, string, attr);
        } else {
            // warn the user and don't allow the insert
        }
    }

    private boolean test(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text,
                        AttributeSet attrs) throws BadLocationException {

        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.replace(offset, offset + length, text);

        if (test(sb.toString())) {
            super.replace(fb, offset, length, text, attrs);
        } else {
            // warn the user and don't allow the insert
        }

    }

    @Override
    public void remove(FilterBypass fb, int offset, int length)
            throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.delete(offset, offset + length);

        if (test(sb.toString())) {
            super.remove(fb, offset, length);
        } else {
            // warn the user and don't allow the insert
        }

    }
}
