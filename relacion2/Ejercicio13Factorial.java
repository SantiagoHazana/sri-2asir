package relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Ejercicio13Factorial {

    private static BigInteger factorialSequential(BigInteger n){
        BigInteger result = BigInteger.ONE;

        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }

        return result;
    }

    public static BigInteger factorialRecursive(long n){
        return (n == 1 || n == 0) ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorialRecursive(n - 1));
    }

    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        long num = -1;

        do {
            try {
                System.out.printf("Ingrese un numero mayor o igual a 0 para calcular su factorial: ");
                num = Long.parseLong(scanner.readLine());
            }catch (IOException e) {
                System.out.println("No se pudo leer del teclado");
            }catch (NumberFormatException e){
                System.out.println("Por favor ingrese un numero mayor a 0.\n");
            }
        }while (num < 0);


//        System.out.printf("El factorial de %d es %d\n", num, factorialRecursive(num));
        System.out.printf("El factorial de %d es %d\n", num, factorialSequential(BigInteger.valueOf(num)));
    }

}
