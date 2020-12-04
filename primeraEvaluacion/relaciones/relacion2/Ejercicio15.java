package primeraEvaluacion.relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
public class Ejercicio15 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> sueldos = new ArrayList();
        boolean correct;
        int sueldo = 0;

        for (int i = 0; i < 10; i++) {
            try {
                correct = true;
                System.out.printf("Ingrese un sueldo: ");
                sueldo = Integer.parseInt(scanner.readLine());
            }catch (IOException e) {
                i--;
                correct = false;
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                i--;
                correct = false;
                System.out.println("Ingrese un numero!!!");
            }
            if (correct)
                sueldos.add(sueldo);

        }

        int lowCount = 0;
        int total = 0;

        for (Integer sue : sueldos) {
            if (sue < 1000)
                lowCount++;
            total += sue;
        }

        System.out.printf("El total de los sueldos es %d€, de los cuales %d son menores a 1000€", total, lowCount);
    }
}
