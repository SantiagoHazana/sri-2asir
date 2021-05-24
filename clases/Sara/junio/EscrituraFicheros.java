package clases.Sara.junio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraFicheros {

    public static void main(String[] args) {

        // Programa para escribir 10 numeros aleatorios
//        try {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));
//            // Vamos a escribir 10 numeros aleatorios
//            for (int i = 0; i < 10; i++) {
//                int num = (int) (Math.random()*89+10);
//                bufferedWriter.write(num + "");
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            System.out.println("Problema al escribir");
//        }

        //Programa que pida 3 frases y las escriba en el fichero
        Scanner scanner = new Scanner(System.in);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("clases/Sara/junio/frases.txt"));
            // con true en el contructor de fileWriter lo ponemos en modo append
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("clases/Sara/junio/frases.txt", true));
            for (int i = 0; i < 3; i++) {
                System.out.print("Escriba una frase: ");
                String frase = scanner.nextLine();
                bufferedWriter.write(frase);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
