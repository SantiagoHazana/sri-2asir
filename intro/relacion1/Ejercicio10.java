package intro.relacion1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero entre 0 y 9999: ");
        num = scanner.nextInt();
        while (num < 0 || num > 9999){
            System.out.println("Ingrese un numero entre 0 y 9999: ");
            num = scanner.nextInt();
        }

        Integer num1 = num;
        System.out.println("El numero ingresado tiene " + num1.toString().length() + " cifra/s");
    }
}
