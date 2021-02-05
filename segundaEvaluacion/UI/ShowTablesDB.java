package segundaEvaluacion.UI;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowTablesDB extends JFrame {

    private JPanel panel1;
    private JTable clientsTable;
    private JButton showClientsButton;
    private JScrollPane scrollPaneClients;
    private Connection db;

    public ShowTablesDB(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 600, 400);

        // Database driver and connection
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Did not found driver");
        }

        try {
            db = DriverManager.getConnection("jdbc:mysql://localhost/concesionario", "root", "");
        } catch (SQLException throwables) {
            System.out.println("Can't connect to database");
        }

        clientsTable.setGridColor(Color.black);

        showClientsButton.addActionListener(e -> {
            try {
                DefaultTableModel tableModel = new DefaultTableModel(0, 5);

                ResultSet resultSet = db.createStatement().executeQuery("select * from clientes");
                while (resultSet.next()){
                    Object[] data = {
                            resultSet.getInt("DNI"),
                            resultSet.getString("NOMBRE"),
                            resultSet.getString("APELLIDO"),
                            resultSet.getString("CIUDAD"),
                            resultSet.getString("fechanaci")
                    };
                    tableModel.addRow(data);
                }
                clientsTable.setTableHeader(new JTableHeader(new DefaultTableColumnModel()));
                clientsTable.setModel(tableModel);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        ShowTablesDB frame = new ShowTablesDB("Clients");
        frame.setVisible(true);
    }

}
