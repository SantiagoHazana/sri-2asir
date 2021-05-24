package clases.Jorge.ficheros;

import java.sql.*;

public class BaseDeDatos {

    public static void main(String[] args) {
        Connection baseDeDatos = null;

        // Cargar el driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado");
        }

        // Nos conectamos a la base de datos mysql
        try {
            baseDeDatos = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        } catch (SQLException throwables) {
            System.out.println("No se pudo conectar con la base de datos");
        }

        // Consultas simples (no devuelven resultado) - insert, delete, update, create table, etc
        try {
            Statement statement = baseDeDatos.createStatement();
            // los resultados de estas consultas no me interesan guardar
            statement.executeUpdate("drop table if exists jorge");
            statement.executeUpdate("create table jorge (id int primary key, frase text)");
            statement.executeUpdate("insert into jorge value (1, 'Jorge Escobar')");
            statement.executeUpdate("insert into jorge value (2, 'Santiago Hazaña')");
            statement.executeUpdate("insert into jorge value (3, 'Santiago Hazaña')");
            statement.executeUpdate("delete from jorge where id = 3");
            statement.executeUpdate("update jorge set frase = 'Jorgito Escobarcito' where id = 1");
        } catch (SQLException throwables) {
            System.out.println("Problema con alguna consulta simple");
        }

        // Consultas select
        try{
            Statement statement = baseDeDatos.createStatement(); // Statement = declaracion, es el que ejecuta las consultas
            // Aca nos interesa guardar el resultado para poder leerlo y mostrarlo
            ResultSet resultadoConsulta = statement.executeQuery("select * from jorge");

            // Para mostrar todos los resultados
            while (resultadoConsulta.next()){
                int tempId = resultadoConsulta.getInt("id");
                String tempFrase = resultadoConsulta.getString("frase");
                System.out.println("Dato con id: " + tempId + " y frase: " + tempFrase);
            }

        }catch (SQLException throwables){
            System.out.println("Problema con un select");
        }

        try {
            baseDeDatos.close();
        } catch (SQLException throwables) {
            System.out.println("Error al cerrar base de datos");
        }

        /* 1) Crear una tabla llamada personas, que guarde dni, nombre, apellido.
            Insertar por lo menos 4 valores en la tabla
            Actualizar al menos dos de ellos (porque somos bobos y nos confundimos al meterlo)
            Mostrar todos los datos de la tabla
         */

        /* 2) Crear una tabla llamada personas, que guarde dni, nombre, apellido.
            Insertar por lo menos 4 valores en la tabla, pidiendo al usuario esos valores con un Scanner
            Mostrar todos los datos de la tabla
            Ayuda: una consulta es un String, si yo guardo los valores que leo con el scanner, deberia concatenar
            esos valores con el string de la consulta
         */

    }

}
