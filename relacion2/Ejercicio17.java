package relacion2;

import java.util.Scanner;

// Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.printf("Ingrese un numero entre 0 y 10: ");
            num = scanner.nextInt();
        }while (num < 0 || num > 10);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x %2d = %3d\n", num, i, num*i);
        }
    }
}
