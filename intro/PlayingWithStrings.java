package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayingWithStrings {

    public static String hack(String text){
        return text.replace('a', '4').replace('e', '3').replace('i', '1').replace('o', '0');
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String phrase = "";
        boolean incorrect = true;

        while (incorrect){
            try {
                incorrect = false;
                System.out.printf("Ingrese una frase para hackear: ");
                phrase = reader.readLine();
            } catch (IOException e) {
                incorrect = true;
                System.out.println("Error al leer del teclado");
            }
        }

        System.out.println(hack(phrase));
    }
}
