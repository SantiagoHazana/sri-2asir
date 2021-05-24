package clases.Jorge.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    public static void main(String[] args) {
//        try {
//            FileWriter fileWriter = new FileWriter("clases/jorge/ficheros/test.txt"); // cuando abre el fichero lo borra, si no existe lo crea
//            fileWriter.write('a'); // escribe UN SOLO caracter
//            fileWriter.write('\n');
//            fileWriter.write("Hola Mundo!\n"); // escribe un string
//            fileWriter.close(); // cerrarlo para aplicar los cambios
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        // Escribir en el fichero 10 numeros aleatorios entre -100 y 100
//        try {
//            FileWriter fileWriter = new FileWriter("clases/jorge/ficheros/test.txt");
//            for (int i = 0; i < 10; i++) {
//                int num = (int) (Math.random()*200-100);
//                fileWriter.write(num + "\n");
//            }
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("clases/jorge/ficheros/test.txt"));
            for (int i = 0; i < 10; i++) {
                int num = (int) (Math.random()*200-100);
                bufferedWriter.write(num + ""); // le concateno un string vacio porque sino lo toma como un char
                bufferedWriter.newLine(); // escribo el salto de linea
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Pedir al usuario 10 frases y escribirlas en un fichero llamado frases.txt (utilizar el nextline() del scanner)
    }

}
