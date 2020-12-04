package primeraEvaluacion.relaciones.relacion5;

import java.io.*;

public class Ej5 {

    public static void main(String[] args) {

        // Comprobacion de que nos pasen un solo parametro
        if (args.length != 1){
            System.out.println("Ingrese un argumento, sera el nombre del fichero a invertir");
            System.exit(0);
        }

        // Comprobacion de si existe el fichero que nos dan por parametro
        File fichero = new File(args[0]);
        if (!fichero.exists()){
            System.out.println("Ese fichero no existe");
            System.exit(0);
        }

        // Si todo es correcto, leemos el archivo original y leemos o creamos el de destino
        RandomAccessFile ficheroOriginal = null;
        RandomAccessFile ficheroDestino = null;
        try{
            ficheroOriginal = new RandomAccessFile(args[0], "r");
            ficheroDestino = new RandomAccessFile("ej5Resultado.txt", "rw");
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra alguno de los ficheros");
        }

        char c;
        boolean eof = false;
        long posicionOriginal = 0;
        try {
            posicionOriginal = ficheroOriginal.length()-1;
        } catch (IOException e) {
            e.printStackTrace();
        }

        do {
            try {
                ficheroOriginal.seek(posicionOriginal);
                c = (char) ficheroOriginal.readByte();
                ficheroDestino.writeByte(c);
                posicionOriginal--;
                if (posicionOriginal<0)
                    eof = true;
            } catch (EOFException e) {
                eof = true;
            } catch (IOException e) {
                System.out.println("Algo loco paso");
            }
        }while (!eof);
    }

}
