package relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int num = -1;
        boolean correct;

        while (num != 0){
            try {
                correct = true;
                System.out.printf("Ingrese un numero para ir sumandolo, ingrese 0 para terminar: ");
                num = Integer.parseInt(scanner.readLine());
            }catch (IOException e) {
                correct = false;
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                correct = false;
                System.out.println("Ingrese un numero!!!");
            }

            if (num != 0 && correct)
                total += num;

        }

        System.out.printf("El total es: %d", total);
    }
}
