package segundaEvaluacion.UI;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.*;

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
    private JButton commonOSButton;
    private JButton commonHobbyButton;
    private JButton averageHoursButton;
    private ButtonGroup osGroup;
    private Connection conexionBases;

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
            String res = String.format("Su sistema operativo preferido es %s %s %s %s %s \n y sus horas dedicadas a PC son %d",
                    osGroup.getSelection().getActionCommand(),
                    (programmingCheckBox.isSelected() || graphicsDesignCheckBox.isSelected() || administrationCheckBox.isSelected()) ? "\nsu/s aficion/es son":"",
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
        commonOSButton.addActionListener(e -> {
            ArrayList<String> os = getAllOS();
            int countMacOS = Collections.frequency(os, "MacOS");
            int countLinux = Collections.frequency(os, "Linux");
            int countWindows = Collections.frequency(os, "Windows");
            TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
            map.put(countMacOS, "MacOS");
            map.put(countLinux, "Linux");
            map.put(countWindows, "Windows");
            String res = "";

            for (Integer count : map.keySet()) {
                res += map.get(count) + " aparece " + count + " veces\n";
            }

            JOptionPane.showMessageDialog(this, res, "Muestra SO", JOptionPane.INFORMATION_MESSAGE);

        });
        commonHobbyButton.addActionListener(e -> {
            ArrayList<String> hobbies = getAllHobbies();
            int countProg = Collections.frequency(hobbies, "Programacion");
            int countDesign = Collections.frequency(hobbies, "Diseño grafico");
            int countAdmin = Collections.frequency(hobbies, "Administracion");
            TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
            map.put(countProg, "Programacion");
            map.put(countDesign, "Diseño grafico");
            map.put(countAdmin, "Administracion");
            String res = "";

            for (Integer count : map.keySet()) {
                res += map.get(count) + " aparece " + count + " veces\n";
            }

            JOptionPane.showMessageDialog(this, res, "Muestra Aficiones", JOptionPane.INFORMATION_MESSAGE);

        });
        averageHoursButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, String.format("Las horas promedio de uso de PC es: %.2f", getAVGHours()), "Horas promedio", JOptionPane.INFORMATION_MESSAGE);

        });

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent winEvt){
                String res = "";
                try {
                    Statement statement =  conexionBases.createStatement();
                    ResultSet resultSet = statement.executeQuery("select count(os) as linux from mini_form where os='Linux'");
                    resultSet.next();
                    int countLinux = resultSet.getInt("linux");
                    res += "Linux: " + countLinux;
                    resultSet = statement.executeQuery("select count(os) as windows from mini_form where os='Windows'");
                    resultSet.next();
                    int countWin = resultSet.getInt("windows");
                    res += "Windows: " + countWin;
                    resultSet = statement.executeQuery("select count(os) as macos from mini_form where os='MacOS'");
                    resultSet.next();
                    int countMac = resultSet.getInt("macos");
                    res += "MacOS: " + countMac;



                    conexionBases.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }

    private double getAVGHours() {
        Connection db;
        double res = -1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            db = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

            ResultSet resultSet = db.createStatement().executeQuery("select avg(hours) as avg from mini_form");
            resultSet.next();
            res = resultSet.getDouble("avg");

            db.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    private ArrayList<String> getAllHobbies(){
        Connection db;
        ArrayList<String> hobbies = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            db = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

            ResultSet resultSet = db.createStatement().executeQuery("select hobby from mini_form");

            while (resultSet.next()){
                String[] result = resultSet.getString("hobby").split("\t");
                hobbies.addAll(Arrays.asList(result));
            }
            db.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return hobbies;
    }

    private ArrayList<String> getAllOS() {
        Connection db;
        ArrayList<String> os = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            db = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

            ResultSet resultSet = db.createStatement().executeQuery("select os from mini_form");

            while (resultSet.next()){
                os.add(resultSet.getString("os"));
            }

            db.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return os;

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
