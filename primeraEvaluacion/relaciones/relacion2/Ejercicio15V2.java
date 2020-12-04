package primeraEvaluacion.relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio15V2 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int sueldos = 0;
        boolean correct;
        int sueldo = 0;
        int lowCount = 0;

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
            if (correct){
                sueldos += sueldo;
                if (sueldo < 1000)
                    lowCount++;
            }
        }

        System.out.printf("El total de los sueldos es %d€, de los cuales %d son menores a 1000€", sueldos, lowCount);
    }
}
