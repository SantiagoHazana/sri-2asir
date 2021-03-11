package clases.Sara;

import java.sql.*;

public class db {

    public static void main(String[] args) {

        Connection baseDeDatos = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Did not found driver");
        }

        try {
            baseDeDatos = DriverManager.getConnection("jdbc:mysql://localhost/sara", "root", "");
        } catch (SQLException throwables) {
            System.out.println("Can't connect to database");
        }

        try{
            Statement statement = baseDeDatos.createStatement();
            statement.execute("drop table if exists test");
            statement.execute("create table test(" +
                    "id int primary key, " +
                    "texto text" +
                    ");");

            statement.executeUpdate("insert into test values (1, 'Test'), (2, 'Test2'), (3, 'Test3'), (4, 'Test4'), (5, 'Test5')");

            ResultSet resultSet = statement.executeQuery("select * from test");

            while(resultSet.next()){
                System.out.printf("Codigo: %d, texto: %s\n", resultSet.getInt("id"), resultSet.getString("texto"));
            }

            baseDeDatos.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }



}
