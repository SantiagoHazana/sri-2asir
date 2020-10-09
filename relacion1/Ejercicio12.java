package relacion1;

import java.util.Scanner;

public class Ejercicio12 {


    public static boolean palindrome(int num){
        return num == reverse(num);
    }

    private static int reverse(int num){
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

        System.out.println("Ingrese un numero entre 0 y 9999: ");
        num = scanner.nextInt();

        System.out.printf(palindrome(num) ? "El numero %d es capicula":"El numero %d no es capicua", num);
    }
}
