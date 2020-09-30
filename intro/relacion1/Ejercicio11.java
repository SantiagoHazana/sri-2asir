package intro.relacion1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num;

        System.out.print("Ingrese un numero entre 0 y 9999: ");
        num = scanner.nextInt();
        while (num < 0 || num > 9999){
            System.out.println("Ingrese un numero entre 0 y 9999: ");
            num = scanner.nextInt();
        }

        String numString = "";
        for (int i = num.toString().length()-1; i >= 0; i--) {
            numString += num.toString().charAt(i);
        }
        System.out.println("El numero ingresado al reves es: " + numString);
    }
}
