package primeraEvaluacion.relaciones.relacion5;

import java.io.*;

public class Ej1 {

    public static void main(String[] args) {
        String nombreArchivo = "naturales.txt";

        FileWriter escribirArchivo;
        BufferedWriter bufferedWriter;
        try{
            escribirArchivo = new FileWriter(nombreArchivo);
            bufferedWriter = new BufferedWriter(escribirArchivo);
            String numeros = "";
            for (int i = 1; i < 101; i++) {
                numeros += i + " ";
            }
            bufferedWriter.write(numeros);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("imposible abrir el archivo para leer.");
        }

        FileReader leerArchivo;
        BufferedReader bufferedReader;
        String linea;
        try {
            leerArchivo = new FileReader(nombreArchivo);
            bufferedReader = new BufferedReader(leerArchivo);
            linea = bufferedReader.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("imposible abrir el archivo para leer.");
        }
    }

}
