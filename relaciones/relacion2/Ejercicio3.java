package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        float num = -1;
        boolean correct = true;

        while (num != 0){
            try {
                correct = true;
                System.out.printf("Ingrese un numero: ");
                num = Integer.parseInt(scanner.readLine());
            }catch (IOException e) {
                correct = false;
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                correct = false;
                System.out.println("Ingrese un numero!!!");
            }
            if (num != 0 && correct)
                System.out.println( num>0 ? "Positivo":"Negativo");
        }
    }
}
