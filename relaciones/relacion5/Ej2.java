package relaciones.relacion5;

import java.io.*;

public class Ej2 {

    public static void main(String[] args) {
        String nombreArchivo = "";
        String nombreArchivoCifrado = "";
        if (args.length==0 || args.length>2){
            System.out.println("Por favor ingrese uno o dos parametros");
            System.exit(0);
        }else if (args.length==1){
            nombreArchivo = args[0];
            nombreArchivoCifrado = "cifrado.txt";
            File f = new File(nombreArchivo);
            if (!f.exists()){
                System.out.println("El fichero no existe");
                System.exit(0);
            }
        }else{
            nombreArchivo = args[0];
            nombreArchivoCifrado = args[1];
        }


        RandomAccessFile origen = null;
        RandomAccessFile destino = null;
        int desplazamiento = 5;
        try {
            origen = new RandomAccessFile(nombreArchivo, "r");
            destino = new RandomAccessFile(nombreArchivoCifrado, "rw");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro alguno de los ficheros");
        }

        char caracter;
        boolean endOfFile = false;
        do {
            try {
                caracter = (char) origen.readByte();
                destino.writeByte(cifradoCesar(caracter, desplazamiento));
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
