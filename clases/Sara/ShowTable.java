package clases.Sara;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowTable extends JFrame {
    private JTable table1;
    private JPanel panel1;
    private JButton mostrarClientesButton;
    Connection baseDeDatos;

    public ShowTable(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 600, 400);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Did not found driver");
        }

        try {
            baseDeDatos = DriverManager.getConnection("jdbc:mysql://localhost/concesionario", "root", "");
        } catch (SQLException throwables) {
            System.out.println("Can't connect to database");
        }

        mostrarClientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDatosTabla();
            }
        });
    }

    public void mostrarDatosTabla(){
        // ResultSet es el objeto que tendra la tabla resultante de la consulta select
        try {
            int num = baseDeDatos.createStatement().executeUpdate("delete from clientes where dni=39069364");
            System.out.println(num);
            ResultSet resultSet = baseDeDatos.createStatement().executeQuery("select * from clientes");
            DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[] {"DNI", "Nombre", "Apellido", "Fecha Nacimiento"}, 0);

            while (resultSet.next()){
                Object[] row = new Object[] {
                        resultSet.getInt("DNI"),
                        resultSet.getString("NOMBRE"),
                        resultSet.getString("APELLIDO"),
                        resultSet.getDate("fechanaci")
                };

                defaultTableModel.addRow(row);
            }

            table1.setModel(defaultTableModel);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ShowTable frame = new ShowTable("Mostrar datos");
        frame.setVisible(true);
    }

}
