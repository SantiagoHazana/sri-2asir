package primeraEvaluacion.files;

import java.io.*;

public class ReadWrite {

    public static char hackLetter(char c) {
        switch (c) {
            case 'a':
            case 'A':
                return '4';
            case 'e':
            case 'E':
                return '3';
            case 'i':
            case 'I':
                return '1';
            case 'o':
            case 'O':
                return '0';
            default:
                return c;
        }
    }

    public static char dehackLetter(char c) {
        switch (c) {
            case '4':
                return 'a';
            case '3':
                return 'e';
            case '1':
                return 'i';
            case '0':
                return 'o';
            default:
                return c;
        }
    }

    public static void main(String[] args) {
        boolean hack = true;
        if (args.length == 0) {
            System.out.println("Ingrese algun parametro");
            System.exit(0);
        } else if (args[0].equals("-h"))
            hack = true;
        else if (args[0].equals("-d"))
            hack = false;
        else {
            System.out.println("Ingrese una opcion valida");
            System.exit(0);
        }
        if (args.length == 1) {
            System.out.println("Ingrese un fichero");
            System.exit(0);
        } else {
            File f = new File(args[1]);
            if (!f.exists()) {
                System.out.println("Ese fichero no existe");
                System.exit(0);
            }
        }

        try {
            RandomAccessFile file = new RandomAccessFile(args[1], "rw");
            System.out.println("El tamaño del fichero es: " + file.length());
            char c;
            boolean eof = false;
            do {
                try {
                    c = (char) file.readByte();
                    file.seek(file.getFilePointer() - 1);
                    if (hack)
                        file.writeByte(hackLetter(c));
                    else
                        file.writeByte(dehackLetter(c));
                } catch (EOFException e) {
                    eof = true;
                    file.close();
                    System.out.println("Has sido hackeado");
                }
            } while (!eof);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Problemas con el archivo");
        }
    }
}

