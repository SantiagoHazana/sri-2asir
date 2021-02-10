package segundaEvaluacion.UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;

public class MultiMatrixTabbedPane extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTable firstTable;
    private JPanel firstPanel;
    private JPanel secondPanel;
    private JPanel additionPanel;
    private JPanel multiplicationPanel;
    private JTable secondTable;
    private JTable additionTable;
    private JTable multiplicationTable;

    public MultiMatrixTabbedPane(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 900, 600);


        firstTable.setModel(new DefaultTableModel(new Object[][]{
                {String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1))},
                {String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1))},
                {String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1))}},
                new Object[] {"A", "B", "C"}));
        secondTable.setModel(new DefaultTableModel(new Object[][]{
                {String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1))},
                {String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1))},
                {String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1)),String.valueOf((int)(Math.random()*10+1))}},
                new Object[] {"A", "B", "C"}));
        additionTable.setModel(new DefaultTableModel(new Object[][]{{0,0,0}, {0,0,0}, {0,0,0}}, new Object[] {"A", "B", "C"}));
        multiplicationTable.setModel(new DefaultTableModel(new Object[][]{{0,0,0}, {0,0,0}, {0,0,0}}, new Object[] {"A", "B", "C"}));
        firstTable.setGridColor(Color.black);
        secondTable.setGridColor(Color.black);
        multiplicationTable.setGridColor(Color.black);
        additionTable.setGridColor(Color.black);

        tabbedPane1.addChangeListener(e -> {
            TableModel first = firstTable.getModel();
            TableModel second = secondTable.getModel();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    additionTable.getModel().setValueAt(Integer.parseInt((String) first.getValueAt(i, j)) + Integer.parseInt((String)second.getValueAt(i, j)), i, j);;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    multiplicationTable.getModel().setValueAt(Integer.parseInt((String) first.getValueAt(i, j)) * Integer.parseInt((String)second.getValueAt(i, j)), i, j);;
                }
            }

        });
    }

    public static void main(String[] args) {
        MultiMatrixTabbedPane frame = new MultiMatrixTabbedPane("Operaciones matrices");
        frame.setVisible(true);
    }

}
