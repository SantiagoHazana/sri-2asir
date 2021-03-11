package clases.Sara;

import javax.swing.*;

public class DbTable extends JFrame {

    public DbTable(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 600, 400);

    }

}
