package relacion1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String numString = "";

        do {
            System.out.println("Ingrese un numero entre 0 y 9999: ");
            num = scanner.nextInt();
        }while (num < 0 || num > 9999);

        for (int i = Integer.toString(num).length()-1; i >= 0; i--) {
            numString += Integer.toString(num).charAt(i);
        }
        System.out.println("El numero ingresado al reves es: " + numString);
    }
}
