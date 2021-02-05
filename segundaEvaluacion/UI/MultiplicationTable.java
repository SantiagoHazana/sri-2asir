package segundaEvaluacion.UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MultiplicationTable extends JFrame {
    private JTable multiTable;
    private JPanel panel1;
    private JButton multiplyButton;

    public MultiplicationTable(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 450, 300);

        DefaultTableModel tableModel = new DefaultTableModel(11, 11);
        tableModel.setValueAt("1", 0, 1);
        tableModel.setValueAt("2", 0, 2);
        tableModel.setValueAt("3", 0, 3);
        tableModel.setValueAt("4", 0, 4);
        tableModel.setValueAt("5", 0, 5);
        tableModel.setValueAt("6", 0, 6);
        tableModel.setValueAt("7", 0, 7);
        tableModel.setValueAt("8", 0, 8);
        tableModel.setValueAt("9", 0, 9);
        tableModel.setValueAt("10", 0, 10);
        tableModel.setValueAt("1", 1, 0);
        tableModel.setValueAt("2", 2, 0);
        tableModel.setValueAt("3", 3, 0);
        tableModel.setValueAt("4", 4, 0);
        tableModel.setValueAt("5", 5, 0);
        tableModel.setValueAt("6", 6, 0);
        tableModel.setValueAt("7", 7, 0);
        tableModel.setValueAt("8", 8, 0);
        tableModel.setValueAt("9", 9, 0);
        tableModel.setValueAt("10", 10, 0);
        multiTable.setModel(tableModel);
        multiTable.setGridColor(Color.black);
        multiTable.setShowGrid(true);


        multiplyButton.addActionListener(e -> {
            for (int i = 1; i < 11; i++) {
                for (int j = 1; j < 11; j++) {
                    multiTable.getModel().setValueAt(i*j, i, j);
                }
            }
        });
    }

    public static void main(String[] args) {
        MultiplicationTable frame = new MultiplicationTable("Tabla de multiplicar");
        frame.setVisible(true);
    }

}
