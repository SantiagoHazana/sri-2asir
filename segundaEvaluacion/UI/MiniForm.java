package segundaEvaluacion.UI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class MiniForm extends JFrame {

    private JPanel panel1;
    private JLabel titleLabel;
    private JLabel osLabel;
    private JRadioButton linuxRadioButton;
    private JRadioButton macOSRadioButton;
    private JRadioButton windowsRadioButton;
    private JLabel specializationLabel;
    private JCheckBox programmingCheckBox;
    private JCheckBox graphicsDesignCheckBox;
    private JCheckBox administrationCheckBox;
    private JLabel hoursLabel;
    private JSlider hoursSlider;
    private JLabel hoursSliderLabel;
    private JButton generateButton;
    private ButtonGroup osGroup;

    public MiniForm(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 300, 600);

        osGroup = new ButtonGroup();
        linuxRadioButton.setActionCommand("Linux");
        macOSRadioButton.setActionCommand("MacOS");
        windowsRadioButton.setActionCommand("Windows");
        osGroup.add(linuxRadioButton);
        osGroup.add(macOSRadioButton);
        osGroup.add(windowsRadioButton);
        osGroup.setSelected(macOSRadioButton.getModel(), true);

        hoursSlider.addChangeListener(e -> hoursSliderLabel.setText(String.valueOf(hoursSlider.getValue())));
        generateButton.addActionListener(e -> {
            String res = String.format("Su sistema operativo preferido es %s\n %s %s %s %s \n y sus horas dedicadas a PC son %d",
                    osGroup.getSelection().getActionCommand(),
                    (programmingCheckBox.isSelected() || graphicsDesignCheckBox.isSelected() || administrationCheckBox.isSelected()) ? "su/s aficion/es son":"",
                    programmingCheckBox.isSelected() ? "Programacion,":"",
                    graphicsDesignCheckBox.isSelected() ? "Diseño grafico,":"",
                    administrationCheckBox.isSelected() ? "Administracion,":"",
                    hoursSlider.getValue());
            JOptionPane.showMessageDialog(this, res, "Muestra de datos", JOptionPane.INFORMATION_MESSAGE);
            ArrayList<String> hobbies = new ArrayList<>();
            if (programmingCheckBox.isSelected())
                hobbies.add("Programacion");
            if (graphicsDesignCheckBox.isSelected())
                hobbies.add("Diseño grafico");
            if (administrationCheckBox.isSelected())
                hobbies.add("Administracion");


            insertFormResult(osGroup.getSelection().getActionCommand(), hobbies, hoursSlider.getValue());
        });
    }

    private int insertFormResult(String os, ArrayList<String> hobbies, int hours){
        Connection db;
        int res = -1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            db = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            String hobby = "";
            for (String s : hobbies) {
                hobby+=s+"\t";
            }
            // Forma fea y no correcta
//            db.createStatement().executeQuery("insert into mini_form(os, hobby, hours) value (" + os + "," + hobby + "," + hours +" )");
            PreparedStatement preparedStatement = db.prepareStatement("insert into mini_form(os, hobby, hours) value (?, ?, ?)");
            preparedStatement.setString(1, os);
            preparedStatement.setString(2, hobby);
            preparedStatement.setInt(3, hours);
            res = preparedStatement.executeUpdate();
            db.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    public static void main(String[] args) {
        MiniForm frame = new MiniForm("Mini Encuesta");
        frame.setVisible(true);
    }

}
