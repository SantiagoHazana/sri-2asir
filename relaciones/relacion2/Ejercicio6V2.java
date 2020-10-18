package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio6V2 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int numberToGuess = 0;
        int playerGuess = 0;
        int max = 0;
        int guesses = 0;
        int maxGuesses = 15;
        boolean incorrect = true;

        do {
            try {
                incorrect = false;
                System.out.printf("Ingrese el numero maximo que se pueda generar: ");
                max = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                incorrect = true;
                e.printStackTrace();
            } catch (NumberFormatException e){
                incorrect = true;
                System.out.println("Ingrese un numero!");
            }
        }while (incorrect);

        numberToGuess = random.nextInt(max)+1;

        incorrect = true;
        do {
            try {
                incorrect = false;
                System.out.println("Intenta adivinar el numero!");
                System.out.printf("Adivinanza: ");
                playerGuess = Integer.parseInt(reader.readLine());
                if (numberToGuess != playerGuess){
                    System.out.printf("El numero que debes adivinar es %s\n\n", playerGuess>numberToGuess ? "menor":"mayor");
                    guesses++;
                }
            } catch (IOException e) {
                incorrect = true;
                e.printStackTrace();
            } catch (NumberFormatException e){
                incorrect = true;
                System.out.println();
            }
        }while (incorrect || (playerGuess != numberToGuess && guesses<maxGuesses));


    }

}
