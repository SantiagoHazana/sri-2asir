package clases.Jorge.ficheros;

import java.io.*;

public class Lectura {

    public static void main(String[] args) {
        // Abriendo el fichero con la clase File, podemos verificar si el fichero existe o no, va ejemplo
//        File fichero = new File("clases/jorge/ficheros/test.txt");
//        if (fichero.exists()){
//            System.out.println("El fichero existe");
//        }else{
//            System.out.println("El fichero no existe");
//        }
//        // Como saber el tamaño del fichero
//        fichero.length();
//
//        // Leer el contenido del fichero, caracter a caracter
//        try {
//            FileReader lecturaFichero = new FileReader("clases/jorge/ficheros/test.txt");
//
//            for (int i = 0; i < fichero.length(); i++) { // utilizamos el largo del fichero
//                char c = (char) lecturaFichero.read(); // Leemos un solo caracter, no da el codigo ascii asique lo convertimos a char
//                System.out.print(c); // Lo mostramos
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("No existe el fichero. " + e.getMessage());
//        } catch (IOException e) {
//            System.out.println("Error de lectura");
//        }

        // Si queremos leer una linea completa
        try {
            // lee todos los caracteres, hasta el salto de linea O caracter a caracter
            BufferedReader bufferedReader = new BufferedReader(new FileReader("clases/jorge/ficheros/test.txt"));
            String linea = bufferedReader.readLine(); // leo la linea completa, si no hay mas lineas, es null
            int totalVocales = 0;
            int totalLetras = 0;
            while (linea != null){
                totalVocales = totalVocales + contarVocales(linea);
                totalLetras = totalLetras + contarLetras(linea);
                linea = bufferedReader.readLine();
            }
            System.out.println("El total de vocales es: " + totalVocales);
            System.out.println("El total de letras es : " + totalLetras);
            File fichero = new File("clases/jorge/ficheros/test.txt");
            System.out.println("El total de caracteres es: " + fichero.length()  + " de los cuales " + (fichero.length()-totalLetras) + " son especiales.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int contarVocales(String linea){
        int cuentaVocales = 0;
        // este bucle recorre caracter a caracter el string
        for (int i = 0; i < linea.length(); i++){
            char c = linea.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                cuentaVocales++;
            }
        }
        return cuentaVocales;
    }

    public static int contarLetras(String linea){
        int cuentaLetras = 0;
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            if (c >= 65 && c <= 90 || c >= 97 && c <= 122){
                cuentaLetras++;
            }
        }
        return cuentaLetras;
    }


}
