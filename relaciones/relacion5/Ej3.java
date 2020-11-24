package relaciones.relacion5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ej3 {

    public static int lettersCount(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(0);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                count++;
        }
        return count;
    }

    public static int wordCount(String text){
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        return stringTokenizer.countTokens();
    }

    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Debe introducir un solo parametro");
            System.exit(0);
        }
        File f = new File(args[0]);
        if (!f.exists()){
            System.out.println("Ingrese un fichero que exista");
            System.exit(0);
        }

        FileReader leerArchivo;
        BufferedReader bufferedReader;
        String linea;

        int lettersCount = 0;
        int wordsCount = 0;
        int linesCount = 0;

        try {
            leerArchivo = new FileReader(args[0]);
            bufferedReader = new BufferedReader(leerArchivo);
            linea = bufferedReader.readLine();
            while (linea != null){
                linesCount++;
                lettersCount += lettersCount(linea);
                wordsCount += wordCount(linea);
                linea = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("imposible abrir el archivo para leer.");
        }

        System.out.println("Tamaño del fichero: " + f.length());
        System.out.println("Numero de letras: " + lettersCount);
        System.out.println("Numero de lineas: " + linesCount);
        System.out.println("Numero de palabras: " + wordsCount);

    }

}
