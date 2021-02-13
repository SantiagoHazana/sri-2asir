package segundaEvaluacion.db;

import java.sql.*;

public class Querys {
    private static Connection db;

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Can not load driver");
        }

        try {
            db = DriverManager.getConnection("jdbc:mysql://localhost/concesionario", "root", "");
        } catch (SQLException throwables) {
            System.out.println("Can not connect to database");
        }

        try {
            Statement statement = db.createStatement();
            ResultSet resultQuery = statement.executeQuery("select * from coches");
            while (resultQuery.next()){
                System.out.printf("Nombre: %s, Modelo: %s, Precio: %d€\n",
                        resultQuery.getString("nombre"),
                        resultQuery.getString("modelo"),
                        resultQuery.getInt("precio"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
