package primeraEvaluacion.relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;

        while (num > 0){
            try {
                System.out.printf("Ingrese un numero para mostrar su cuadrado: ");
                num = Integer.parseInt(scanner.readLine());
                if (num > 0)
                    System.out.printf("El cuadrado de %d es: %5.1f \n", num, Math.pow(num, 2));
            }catch (IOException e) {
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero!");
            }

        }
    }
}
