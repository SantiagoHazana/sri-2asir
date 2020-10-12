package relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int max = 100;
        int min = 1;
        int guess = (min+max)/2;
        int intruction=-1;
        boolean correct;

        System.out.printf("Elija un numero entre %d y %d y se intenteara adivinar\n", min, max);

        while (intruction != 0){
            System.out.printf("\nSu numero es %d?\n", guess);
            try {
                correct = true;
                System.out.printf("Ingrese 1 si es menor, 2 si es mayor o 0 si es correcto: ");
                intruction = Integer.parseInt(scanner.readLine());
            }catch (IOException e) {
                correct = false;
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                correct = false;
                System.out.println("Ingrese un numero!!!");
            }

            if (intruction == 1 && correct){
                max = guess;
                guess = (min+max)/2;
            }else if (intruction == 2 && correct){
                min = guess;
                guess = (min+max)/2;
            }
        }

        System.out.println("\nAdivine!");
    }
}
