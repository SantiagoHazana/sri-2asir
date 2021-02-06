package segundaEvaluacion.db;

import java.sql.*;

public class FirstConnection {

    public static void main(String[] args) {

        Connection db = null;

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

        System.out.println("\nAll clients from my database");
        try {
            db.createStatement().executeUpdate("delete from clientes where dni=39069364");
            ResultSet resultSet = db.createStatement().executeQuery("select dni, nombre, apellido from clientes");
            while (resultSet.next()){
                System.out.printf("DNI: %s, Nombre: %s, Apellido: %s\n",
                        resultSet.getString("DNI"),
                        resultSet.getString("NOMBRE"),
                        resultSet.getString("APELLIDO"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        System.out.println("\nInserting new client");

        try{
            db.createStatement().executeUpdate("insert into clientes value('39069364', 'Santiago', 'Hazaña', 'Benalmadena', '1995-08-06')");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.println("\nAll clients from my database");
        try {
            ResultSet resultSet = db.createStatement().executeQuery("select dni, nombre, apellido from clientes");
            while (resultSet.next()){
                System.out.printf("DNI: %s, Nombre: %s, Apellido: %s\n",
                        resultSet.getString("DNI"),
                        resultSet.getString("NOMBRE"),
                        resultSet.getString("APELLIDO"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
