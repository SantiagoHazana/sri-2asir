package relacion2;

import java.util.ArrayList;
import java.util.Scanner;

// Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sueldos = new ArrayList();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese un sueldo: ");
            sueldos.add(scanner.nextInt());
        }

        int lowCount = 0;
        int total = 0;

        for (Integer sueldo :
                sueldos) {
            if (sueldo < 1000)
                lowCount++;
            total += sueldo;
        }

        System.out.printf("El total de los sueldos es %d€, de los cuales %d son menores a 1000€", total, lowCount);
    }
}
