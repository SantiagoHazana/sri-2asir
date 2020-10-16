package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        int contador = 0; // Llevar la cuenta de cuantos numeros se introducen
        float total = 0; // Llevara el total de los numeros introducidos, para luego sacar la media

        while (numero >= 0){
            try {
                System.out.printf("Ingrese un numero: ");
                numero = Integer.parseInt(scanner.readLine());
                if (numero >= 0){
                    total = total + numero;
                    contador++;
                }
            }catch (IOException e) {
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero!!!");
            }
        }

        System.out.printf("La media de todos los numeros introducidos es: %5.2f", total / contador);
    }
}
