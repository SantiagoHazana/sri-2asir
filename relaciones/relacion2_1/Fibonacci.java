package relaciones.relacion2_1;

import java.math.BigInteger;

public class Fibonacci {
    public long fib(long n){
        if (n == 0 || n == 1)
            return n;

        return fib(n-1)+fib(n-2);
    }

    public BigInteger fibBig(BigInteger num){
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE))
            return num;

        return fibBig(num.subtract(BigInteger.ONE)).add(fibBig(num.subtract(BigInteger.valueOf(2))));
    }

}
