package segundaEvaluacion.UI;

import javax.swing.*;

public class ResizeWindows extends JFrame{
    private JButton agrandarArribaButton;
    private JButton agrandarAbajoButton;
    private JButton agrandarDerechaButton;
    private JButton agrandarIzquierdaButton;
    private JPanel panel1;

    public ResizeWindows(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 300, 400, 300);

        agrandarArribaButton.addActionListener(e -> setBounds(this.getX(), this.getY()-5, this.getWidth(), this.getHeight()+5));
        agrandarAbajoButton.addActionListener(e -> setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight()+5));
        agrandarDerechaButton.addActionListener(e -> setBounds(this.getX(), this.getY(), this.getWidth()+5, this.getHeight()));
        agrandarIzquierdaButton.addActionListener(e -> setBounds(this.getX()-5, this.getY(), this.getWidth()+5, this.getHeight()));
    }

    public static void main(String[] args) {
        ResizeWindows frame = new ResizeWindows("Cambiar Tamaño");
        frame.setVisible(true);
    }

}
