package relacion2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int guess = (min+max)/2;
        int intruction=-1;

        System.out.printf("Elija un numero entre %d y %d y se intenteara adivinar\n", min, max);

        while (intruction != 0){
            System.out.printf("Su numero es %d?\n", guess);
            System.out.printf("Ingrese 1 si es menor, 2 si es mayor o 0 si es correcto: ");
            intruction = scanner.nextInt();
            if (intruction == 1){
                max = guess;
                guess = (min+max)/2;
            }else if (intruction == 2){
                min = guess;
                guess = (min+max)/2;
            }
        }

        System.out.println("Adivine!");
    }
}
