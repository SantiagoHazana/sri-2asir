package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int num = -1;

        while (num != 0){

            try {
                System.out.printf("Ingrese un numero: ");
                num = Integer.parseInt(scanner.readLine());
                if (num != 0)
                    System.out.println( num%2==0 ? "Par\n":"Impar\n");
            } catch (IOException e) {
                System.out.println("Error al leer del teclado\n");
            } catch (NumberFormatException e){
                System.out.println("Metiste cualquier cosa.\n");
            }


        }
        System.out.println("\nAdios!");
    }
}
