package clases.Marine.ejercicioExamen;

import java.io.*;
import java.util.Scanner;

public class TestCifrador {
    public static void main(String[] args) {
        Cifrador cifrador = new Cifrador();
        Scanner scanner = new Scanner(System.in);
        if (args.length != 1){
            System.out.println("Ingrese un solo parametro!");
            System.exit(0);
        }
        File f = new File(args[0]);
        if (!f.exists()){
            System.out.println("El fichero debe existir!");
            System.exit(0);
        }
        boolean hack = true;

        boolean correct = false;
        do {
            String answer = "";
            System.out.printf("Desea hackear(h) o deshackear(d)? ");
            answer = scanner.next();
            answer = answer.toLowerCase();
            if (answer.equals("h") || answer.equals("d")){
                correct = true;
                hack = answer.equals("h");
            }
        }while (!correct);

        try {
            RandomAccessFile file = new RandomAccessFile(args[0], "r");
            RandomAccessFile exitFile = new RandomAccessFile("salida.txt", "rw");
            boolean eof = false;
            do {
                try {
                    char c = (char) file.readByte();
                    if (hack){
                        exitFile.writeByte(cifrador.hackLetter(c));
                    }else{
                        exitFile.writeByte(cifrador.dehackLetter(c));
                    }
                }catch (EOFException e){
                    eof = true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }while (!eof);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
