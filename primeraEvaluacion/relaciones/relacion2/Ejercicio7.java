package primeraEvaluacion.relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int num = -1;

        while (num != 0){
            try {
                System.out.printf("Ingrese un numero para ir sumandolo, ingrese 0 para terminar: ");
                num = Integer.parseInt(scanner.readLine());
                if (num != 0)
                    total += num;
            }catch (IOException e) {
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero!!!");
            }



        }

        System.out.printf("El total es: %d", total);
    }
}
