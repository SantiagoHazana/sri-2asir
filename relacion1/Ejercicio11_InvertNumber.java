package relacion1;

import java.util.Scanner;

public class Ejercicio11_InvertNumber {

    private static int invertNumber(int num){
        int n;
        int inverse = 0;

        while (num != 0){
            n = num%10;
            num /= 10;
            inverse = inverse * 10 + n;
        }

        return inverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String numString = "";

        //do {
            System.out.println("Ingrese un numero: ");
            num = scanner.nextInt();
        //}while (num < 0 || num > 9999);

        /*
        // Hecho con String
        for (int i = Integer.toString(num).length()-1; i >= 0; i--) {
            numString += Integer.toString(num).charAt(i);
        }
        System.out.println("El numero ingresado al reves es: " + numString);
        */

        // Hecho matematicamente
        System.out.printf("El number %d inverso es %d", num, invertNumber(num));
    }
}
