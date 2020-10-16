package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        float num = -1;

        while (num != 0){
            try {
                System.out.printf("Ingrese un numero: ");
                num = Integer.parseInt(scanner.readLine());
                if (num != 0)
                    System.out.println( num>0 ? "Positivo":"Negativo");
            }catch (IOException e) {
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero!!!");
            }

        }
    }
}
