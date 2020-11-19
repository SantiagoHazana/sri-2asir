package relaciones.relacion5;

import java.io.*;

public class Ej1 {

    public static void main(String[] args) {
        String nombreArchivo = "naturales.txt";

        FileWriter escribirArchivo; // me escribira sobre mi archivo
        BufferedWriter bufferedWriter; // me permite escribir una linea completa
        try{
            escribirArchivo = new FileWriter(nombreArchivo); // asigno el nombre del fichero
            bufferedWriter = new BufferedWriter(escribirArchivo); // asigno el archivo
            String numeros = ""; // 1 2 3 4 5 6.....100, en este string escribire todos los numeros
            for (int i = 1; i < 101; i++) {
                numeros += i + " "; // escribo todos los numeros con el bucle
            }
            bufferedWriter.write(numeros); // escribo sobre el archivo el string completo, la linea completa
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("imposible abrir el archivo para leer.");
        }

        FileReader leerArchivo; // abrire el archivo para leerlo
        BufferedReader bufferedReader; // se utiliza para leer lineas completas
        String linea; // almaceno aca la linea que leo
        try {
            leerArchivo = new FileReader(nombreArchivo);
            bufferedReader = new BufferedReader(leerArchivo);
            linea = bufferedReader.readLine(); // tengo que leer una linea antes de empezar el bucle
            while (linea != null){ // el bucle se termina cuando leo null, es decir no hay mas lineas
                System.out.println(linea);
                linea = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("imposible abrir el archivo para leer.");
        }
    }

}
