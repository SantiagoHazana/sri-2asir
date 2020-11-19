package clases.Sara.susRelaciones.relacion5;

import java.io.*;
import java.util.StringTokenizer;


public class Ejercicio3 {

    public static int numeroLetras(String linea){ // ascii A-Z = 65-90, a-z = 91-122
        int acum = 0;
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 91 && c <= 122))
                acum++;
        }
        return acum;
    }

    public static int numeroPalabras(String archivo){
        StringTokenizer st = new StringTokenizer(archivo);
        return st.countTokens();
    }

    public static void main(String[] args){
        String nombreArchivo="cesar.txt";
        int totalLineas = 0;
        int totalPalabras = 0;
        int totalLetras = 0;

        File f = new File(nombreArchivo);

        FileReader leerArchivo;
        BufferedReader bufferReader;
        String linea;
        try{
            leerArchivo = new FileReader(nombreArchivo);
            bufferReader = new BufferedReader(leerArchivo);
            linea = bufferReader.readLine();
            while (linea != null){
                totalLineas++;
                totalPalabras += numeroPalabras(linea);
                totalLetras += numeroLetras(linea);
                linea =  bufferReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.printf("a) El tamaño del fichero es %d bytes\n", f.length());
        System.out.printf("b) El total de letras es %d\n", totalLetras);
        System.out.printf("c) El numero de lineas es %d\n", totalLineas);
        System.out.printf("d) El numero de palabras es %d\n", totalPalabras);

    }
}

