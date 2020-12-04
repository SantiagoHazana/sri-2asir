package primeraEvaluacion.intro.askingData;

import java.util.Scanner;

public class Escaner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int suma;

        System.out.print("Ingresa un numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingresa un segundo numero:");
        num2 = scanner.nextInt();
        suma = num1 + num2;
        System.out.print("La suma de tus numeros es " + suma);
    }

}
