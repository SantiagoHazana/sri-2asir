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

        System.out.println("Ingrese un numero: ");
        num = scanner.nextInt();

        System.out.printf("El number %d inverso es %d", num, invertNumber(num));
    }
}
