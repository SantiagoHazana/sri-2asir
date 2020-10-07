package relacion2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num;
        int count = 0;

        System.out.printf("Ingrese un numero: ");
        num = scanner.nextFloat();

        while (num > 0){
            count++;
            System.out.printf("Ingrese un numero: ");
            num = scanner.nextFloat();
        }

        System.out.printf("Se han ingresado %d numeros positivos", count);
    }
}
