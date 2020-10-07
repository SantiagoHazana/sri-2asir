package relacion2;

import java.util.ArrayList;
import java.util.Scanner;

// Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> notas = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.printf("Ingrese una nota: ");
            notas.add(scanner.nextFloat());
        }

        int aprobados = 0;
        int suspensos = 0;
        for (Float nota :
                notas) {
            if (nota < 5) {
                suspensos++;
            } else {
                aprobados++;
            }
        }

        System.out.printf("Hay %d aprobados y %d suspensos.", aprobados, suspensos);

    }
}
