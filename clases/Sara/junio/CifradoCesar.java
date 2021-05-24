package clases.Sara.junio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CifradoCesar {

    public static void main(String[] args) {

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("clases/Sara/junio/frases.txt", "rw");
            int caracter = randomAccessFile.readByte();
            while (caracter != -1){
                char cifrado = descifradoCesar((char)caracter, 5);
                randomAccessFile.seek(randomAccessFile.getFilePointer()-1);
                randomAccessFile.writeByte(cifrado);
                caracter = randomAccessFile.readByte();
            }
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static char cifradoCesar(char caracter, int despl) {
        despl = despl % 26;
        if (caracter >= 'a' && caracter <= 'z') {
            if (caracter + despl > 'z') {
                return (char) (caracter + despl - 26);
            } else {
                return (char) (caracter + despl);
            }
        } else if (caracter >= 'A' && caracter <= 'Z') {
            if (caracter + despl > 'Z') {
                return (char) (caracter + despl - 26);
            } else {
                return (char) (caracter + despl);
            }
        }
        return caracter;
    }

    private static char descifradoCesar(char caracter, int despl) {
        despl = despl % 26;
        if (caracter >= 'a' && caracter <= 'z') {
            if (caracter - despl < 'a') {
                return (char) (caracter - despl + 26);
            } else {
                return (char) (caracter - despl);
            }
        } else if (caracter >= 'A' && caracter <= 'Z') {
            if (caracter - despl < 'a') {
                return (char) (caracter - despl + 26);
            } else {
                return (char) (caracter - despl);
            }
        }
        return caracter;
    }

}
