package primeraEvaluacion.extras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VigenereTest {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Vigenere vigenere = new Vigenere();
        int option = -1;
        boolean incorrect;

        do {
            incorrect = true;
            System.out.println("\nPrograma de Cifrado de Vigenere\n\t\tSantiago Hazaña\n-------------------------------");
            System.out.println("Que desea hacer?\n1. Cifrar\n2. Decifrar\n0.Salir");
            while (incorrect) {
                try {
                    incorrect = false;
                    System.out.printf("\nOpcion: ");
                    option = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    incorrect = true;
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    incorrect = true;
                    System.out.println("Ingrese un numero!!!");
                }
            }

            switch (option){
                case 1:
                    encode(reader, vigenere);
                    break;
                case 2:
                    decode(reader, vigenere);
            }
        }while (option != 0);
        System.out.println("Adios!");
    }

    private static void decode(BufferedReader reader, Vigenere vigenere) {
        boolean incorrect = true;
        String phrase = "";
        String key = "";

        while (incorrect){
            try {
                incorrect = false;
                System.out.printf("Ingrese la frase a decodificar: ");
                phrase = reader.readLine();
                System.out.printf("Ingrese la clave: ");
                key = reader.readLine();
            } catch (IOException e) {
                incorrect = true;
                e.printStackTrace();
            }
        }

        System.out.printf("\nLa frase codificada es: %s\n-------------------------------", vigenere.decodeByWordWithTable(phrase, key));
    }

    private static void encode(BufferedReader reader, Vigenere vigenere){
        boolean incorrect = true;
        String phrase = "";
        String key = "";

        while (incorrect){
            try {
                incorrect = false;
                System.out.printf("Ingrese la frase a codificar: ");
                phrase = reader.readLine();
                System.out.printf("Ingrese la clave: ");
                key = reader.readLine();
            } catch (IOException e) {
                incorrect = true;
                e.printStackTrace();
            }
        }

        System.out.printf("\nLa frase codificada es: %s\n-------------------------------", vigenere.encodeByWordWithTable(phrase, key));
    }
}
