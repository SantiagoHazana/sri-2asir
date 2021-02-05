package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.*;

public class OptionPane extends JFrame {

    private JPanel panel1;
    private JButton dialogButton;
    private JButton yesNoButton;
    private JButton optionsButton;
    private JButton selectorButton;
    private JButton inputButton;
    private JButton exitButton;
    private JLabel centerLabel;

    public OptionPane(String title){
        super(title);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2-400, Toolkit.getDefaultToolkit().getScreenSize().height/2-150, 800, 300);
        exitButton.addActionListener(e -> {
            int option = JOptionPane.showConfirmDialog(this,
                    "Seguro que desea salir?",
                    "Exit",
                    JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION)
                System.exit(0);
        });
        inputButton.addActionListener(e -> {
            String text = JOptionPane.showInputDialog("Un mensaje");
            if (text != null)
                centerLabel.setText(text);
        });
        selectorButton.addActionListener(e -> {
            Object[] options = {"GTA V", "Minecraft", "Cyberpunk 2077", "Escape From Tarkov"};
            String optionSelected = (String) JOptionPane.showInputDialog(this,
                    "Favourite game",
                    "Title",
                    JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon("resources/images/judy_alvarez___cyberpunk_2077___icon_by_jee_yong_de74gki-fullview.png"),
                    options,
                    options[2]);
            if (optionSelected != null)
                centerLabel.setText("Your favourite game is " + optionSelected);
        });
        yesNoButton.addActionListener(e -> {
            int option = JOptionPane.showConfirmDialog(this,
                    "Mensaje de opciones",
                    "Title",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION){
                centerLabel.setText("Yesssssss");
            }else if (option == JOptionPane.NO_OPTION){
                centerLabel.setText("Nooooooo");
            }else{
                centerLabel.setText("Cancellllll");
            }
        });
        dialogButton.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Warning message",
                "Warning",
                JOptionPane.WARNING_MESSAGE,
                new ImageIcon("resources/images/warning.png")));
        optionsButton.addActionListener(e ->  {
                Object[] options = {"Quien", "Te", "Pregunto"};
                int option = JOptionPane.showOptionDialog(this,
                        "Message option dialog",
                        "Title",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[1]);
            if (option == JOptionPane.YES_OPTION){
                centerLabel.setText("Quien");
            }else if (option == JOptionPane.NO_OPTION){
                centerLabel.setText("Te");
            }else{
                centerLabel.setText("Pregunto");
            }
        });
    }

    public static void main(String[] args) {
        OptionPane frame = new OptionPane("Options Panes");
        frame.setVisible(true);
    }
}
