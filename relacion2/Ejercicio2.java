package relacion2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.printf("Ingrese un numero para mostrar su cuadrado: ");
        num = scanner.nextInt();

        while (num > 0){
            System.out.printf("El cuadrado de %d es: %f \n", num, Math.pow(num, 2));
            System.out.printf("Ingrese un numero para mostrar su cuadrado: ");
            num = scanner.nextInt();
        }

    }
}
