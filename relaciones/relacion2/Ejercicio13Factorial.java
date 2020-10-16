package relaciones.relacion2;

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

    /**
     * Optimised for huge numbers.
     *
     * http://en.wikipedia.org/wiki/Logarithm#Change_of_base
     *
     * States that log[b](x) = log[k](x)/log[k](b)
     *
     * We can get log[2](x) as the bitCount of the number so what we need is
     * essentially bitCount/log[2](10). Sadly that will lead to inaccuracies so
     * here I will attempt an iterative process that should achieve accuracy.
     *
     * log[2](10) = 3.32192809488736234787 so if I divide by 10^(bitCount/4) we
     * should not go too far. In fact repeating that process while adding (bitCount/4)
     * to the running count of the digits will end up with an accurate figure
     * given some twiddling at the end.
     *
     * So here's the scheme:
     *
     * While there are more than 4 bits in the number
     *   Divide by 10^(bits/4)
     *   Increase digit count by (bits/4)
     *
     * Fiddle around to accommodate the remaining digit - if there is one.
     *
     * Essentially - each time around the loop we remove a number of decimal
     * digits (by dividing by 10^n) keeping a count of how many we've removed.
     *
     * The number of digits we remove is estimated from the number of bits in the
     * number (i.e. log[2](x) / 4). The perfect figure for the reduction would be
     * log[2](x) / 3.3219... so dividing by 4 is a good under-estimate. We
     * don't go too far but it does mean we have to repeat it just a few times.
     */
    private static int log10(BigInteger huge) {
        int digits = 0;
        int bits = huge.bitLength();
        // Serious reductions.
        while (bits > 4) {
            // 4 > log[2](10) so we should not reduce it too far.
            int reduce = bits / 4;
            // Divide by 10^reduce
            huge = huge.divide(BigInteger.TEN.pow(reduce));
            // Removed that many decimal digits.
            digits += reduce;
            // Recalculate bitLength
            bits = huge.bitLength();
        }
        // Now 4 bits or less - add 1 if necessary.
        if ( huge.intValue() > 9 ) {
            digits += 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        BigInteger result;
        long num = -1;

        long startTime;
        long endTime;

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


        // Calculate the factorial and record time to do it.
        startTime = System.currentTimeMillis();
        result = factorialSequential(BigInteger.valueOf(num));
        System.out.printf("El factorial de %d es %d\n", num, result);
        endTime = System.currentTimeMillis();

        // Calculate time in minutes and seconds
        long totalMilli = endTime - startTime;
        long endTimeMin = (endTime - startTime)/1000/60;
        long endTimeSec = (totalMilli/1000)-(endTimeMin*60);

        System.out.printf("\nTime to calculate factorial of %d: %d min %d sec\n", num, endTimeMin, endTimeSec);

        // Calculate the number of digits of the factorial number and the time to do it
        startTime = System.currentTimeMillis();
        int digits = log10(result);
        endTime = System.currentTimeMillis();
        System.out.printf("\nEl factorial de %d tiene %d digitos y tardo %d milisegundos en calcularlo.\n", num, digits, (endTime - startTime));


    }

}
