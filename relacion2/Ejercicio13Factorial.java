package relacion2;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio13Factorial {

    public static BigInteger factorial(long n){
        return (n == 1 || n == 0) ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num;

        do {
            System.out.printf("Ingrese un numero mayor o igual a 0 para calcular su factorial: ");
            num = scanner.nextInt();
        }while (num < 0);

        System.out.printf("El factorial de %d es %d", num, factorial(num));
    }

}
