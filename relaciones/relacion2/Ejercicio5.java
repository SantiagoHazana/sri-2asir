package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        float num = 1;
        int count = 0;
        boolean correct;

        while (num > 0){
            try {
                System.out.printf("Ingrese un numero: ");
                num = Integer.parseInt(scanner.readLine());
                if (num > 0)
                    count++;
            }catch (IOException e) {
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero!!!");
            }


        }

        System.out.printf("\nSe han ingresado %d numeros positivos", count);
    }
}
