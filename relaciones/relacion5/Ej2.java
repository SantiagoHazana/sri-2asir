package relaciones.relacion5;

import java.io.*;

public class Ej2 {

    public static void main(String[] args) {
        String nombreArchivo = "cesar.txt";
        String nombreArchivoCifrado = "cifrado.txt";
        RandomAccessFile abierto = null;
        RandomAccessFile cifrado = null;
        int desplazamiento = 5;
        try {
            abierto = new RandomAccessFile(nombreArchivo, "r");
            cifrado = new RandomAccessFile(nombreArchivoCifrado, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        char caracter;
        boolean endOfFile = false;
        do {
            try {
                caracter = (char) abierto.readByte();
                cifrado.writeByte(cifradoCesar(caracter, desplazamiento));
            }catch (EOFException e){
                endOfFile = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while (!endOfFile);

    }

    public static char cifradoCesar(char caracter, int despl) {
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
}
