package clases.Jorge.ficheros;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LecturaYEscritura {

    public static void main(String[] args) {
        try {
            RandomAccessFile lecturaEscritura = new RandomAccessFile("clases/jorge/ficheros/test.txt", "rw");
            // Escribimos numeros aleatorios
            for (int i = 0; i < 10; i++) {
                int num = (int) (Math.random()*200-100);
                lecturaEscritura.writeBytes(num + "\n");
            }
            System.out.println("El fichero tiene " + lecturaEscritura.length()  + " caracteres");

            // aca voy a leer el fichero
            System.out.println("Los numeros aleatorios recien escritos son:");
            lecturaEscritura.seek(0); // mover el puntero a la primera posicion
            String line = lecturaEscritura.readLine();
            while (line != null){
                System.out.println(line);
                line = lecturaEscritura.readLine();
            }
            System.out.println("Final de fichero");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Utilizando solamente el RandomAccessFile, pedir al usuario 5 frases y escribirlas en un fichero.
        // Luego utilizar el mismo RandomAccessFile y analizar el fichero viendo cuantas letras tiene (crear el metodo
        // que lo hicimos en clase, challenge), cuantos numeros, caracteres especiales, caracteres en total y
        // numero de lineas
    }

}
