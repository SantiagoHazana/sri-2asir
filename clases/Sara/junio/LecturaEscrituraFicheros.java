package clases.Sara.junio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class LecturaEscrituraFicheros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("clases/Sara/junio/frases.txt", "rw");
            // Escribir 3 frases
            for (int i = 0; i < 3; i++) {
                System.out.print("Escriba una frase: ");
                String frase = scanner.nextLine();
                randomAccessFile.writeBytes(frase + "\n");
            }
            // hay que reiniciar el puntero porque queda al final despues de escribir
            randomAccessFile.seek(0);
            // Mostrar contenido
            String linea = randomAccessFile.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = randomAccessFile.readLine();
            }
            randomAccessFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
