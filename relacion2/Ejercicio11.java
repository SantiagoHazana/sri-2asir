package relacion2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 15; i++) {
            System.out.printf("Ingrese un numero: ");
            total += scanner.nextInt();
        }

        System.out.printf("El total es: %d", total);
    }
}
