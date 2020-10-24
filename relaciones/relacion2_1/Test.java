package relaciones.relacion2_1;

import java.math.BigInteger;

public class Test {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long number = 50;
        long fib;
        BigInteger fibBig;
        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        fib = fibonacci.fib(number);
        endTime = System.currentTimeMillis();
        System.out.printf("Fibonacci recursivo con long de %d es %d y tardo %d milisegundos en calcularlo\n\n", number, fib, endTime-startTime);

        startTime = System.currentTimeMillis();
        fibBig = fibonacci.fibBig(BigInteger.valueOf(number));
        endTime = System.currentTimeMillis();
        System.out.printf("Fibonacci recursivo con BigInteger de %d es %d y tardo %d milisegundos en calcularlo", number, fibBig, endTime-startTime);
    }

}
