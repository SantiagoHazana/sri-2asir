package relacion1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingrese un numero entre 0 y 9999: ");
            num = scanner.nextInt();
        }while (num < 0 || num > 9999);

        System.out.println("El numero ingresado tiene " + Integer.toString(num).length() + " cifra/s");
    }
}
