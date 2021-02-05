package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Tree extends JFrame {
    private JTree tree1;
    private JPanel panel1;
    private JLabel selectionLabel;

    public Tree(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 450, 300);


        tree1.addPropertyChangeListener(evt -> selectionLabel.setText(tree1.getLastSelectedPathComponent().toString()));
    }

    public static void main(String[] args) {
        Tree frame = new Tree("Arbol");
        frame.setVisible(true);
    }

}
