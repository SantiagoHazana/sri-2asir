package relacion2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0; // Llevar la cuenta de cuantos numeros se introducen
        float total = 0; // Llevara el total de los numeros introducidos, para luego sacar la media

        System.out.printf("Ingrese un numero: ");
        numero = scanner.nextInt();

        while (numero >= 0){
            total = total + numero;
            contador++;
            System.out.printf("Ingrese un numero: ");
            numero = scanner.nextInt();
        }

        total = total / contador;

        System.out.printf("La media de todos los numeros introducidos es: %5.2f", total);
    }
}
