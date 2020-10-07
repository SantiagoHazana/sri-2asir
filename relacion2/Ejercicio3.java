package relacion2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num;

        System.out.printf("Ingrese un numero: ");
        num = scanner.nextFloat();

        while (num != 0){
            System.out.println( num>0 ? "Positivo":"Negativo");
            System.out.printf("Ingrese un numero: ");
            num = scanner.nextFloat();
        }
    }
}
