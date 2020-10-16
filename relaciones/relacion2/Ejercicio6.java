package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        boolean incorrect;
        int option = 0;

        game(scanner);

        do {
            try {
                incorrect = false;
                System.out.println("Desea jugar nuevamente? 1=si, 2=no");
                option = Integer.parseInt(scanner.readLine());
            } catch (IOException e) {
                incorrect = true;
                e.printStackTrace();
            } catch (NumberFormatException e){
                incorrect = true;
                System.out.println("Ingrese un numero!!!");
            }

            if (!incorrect){
                switch (option){
                    case 1:
                        incorrect = true;
                        game(scanner);
                        break;
                    case 2:
                        System.out.println("Adios!");
                        break;
                    default:
                        incorrect = true;
                        System.out.println("Ingrese una opcion correcta.");
                }
            }

        }while (incorrect);

    }

    private static void game(BufferedReader scanner) {
        int max = 100;
        int min = 1;
        int guess = (min+max)/2;
        int instruction=-1;
        boolean correct;
        System.out.printf("Piense un numero entre %d y %d y se intenteara adivinar\n", min, max);

        while (instruction != 0){
            System.out.printf("\nSu numero es %d?\n", guess);
            try {
                correct = true;
                System.out.printf("Ingrese 1 si es menor, 2 si es mayor o 0 si es correcto: ");
                instruction = Integer.parseInt(scanner.readLine());
            }catch (IOException e) {
                correct = false;
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                correct = false;
                System.out.println("Ingrese un numero!!!");
            }

            if (instruction == 1 && correct){
                max = guess;
                guess = (min + max)/2;
            }else if (instruction == 2 && correct){
                min = guess;
                guess = (min + max)/2;
            }
        }
        System.out.println("\nAdivine!");
    }
}
