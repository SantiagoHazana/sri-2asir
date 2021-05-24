package clases.Sara.junio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LecturaFicheros {

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("clases/Sara/junio/frases.txt"));
            // Leer linea a linea
            String linea = bufferedReader.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = bufferedReader.readLine();
            }
            // leer caracter a caracter
            int ascii = bufferedReader.read();
            while (ascii != -1){
                System.out.print((char)ascii);
                ascii = bufferedReader.read();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
