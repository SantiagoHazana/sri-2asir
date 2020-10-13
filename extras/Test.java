package extras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Vigenere vigenere = new Vigenere();

        String phrase = "";
        String key = "";
        String encoded;
        String encoded2;

        try {
            System.out.printf("Ingrese la frase a codificar: ");
            phrase = reader.readLine();
            System.out.printf("Ingrese la clave: ");
            key = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        encoded = vigenere.encodeByWord(phrase, key);
        encoded2 = vigenere.encodeByWordWithTable(phrase, key);
        System.out.printf("La frase codificada es: %s\n", encoded);
        System.out.printf("La frase codificada es: %s\n", encoded2);

        System.out.printf("La frase decodificada es: %s\n", vigenere.decodeByWord(encoded, key));
        System.out.printf("La frase decodificada es: %s", vigenere.decodeByWordWithTable(encoded2, key));
    }
}
