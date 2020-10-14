package relaciones.relacion2;

import java.util.Scanner;

// Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sueldoMax = 0;

        System.out.printf("Ingrese el numero de sueldos que se ingresaran: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese un sueldo: ");
            int sueldo = scanner.nextInt();
            if (sueldo > sueldoMax)
                sueldoMax = sueldo;
        }

        System.out.printf("El mayor sueldo es de %d€", sueldoMax);
    }
}
