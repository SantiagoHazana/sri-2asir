package clases.Sara;

public class Recursividad {

    public static long fibonacciRec(long num){
        // en una sola linea -> return num<=1 ? num:fibonacciRec(num-1)+fibonacciRec(num-2);
        if (num<=1)
            return num;
        return fibonacciRec(num-1)+fibonacciRec(num-2);
    }

    public static long factorialRec(long num){
        if (num<=1)
            return 1;
        return num * factorialRec(num-1);
    }

    public static long factorialSec(long num){
        long res = 1;
        for (int i = 1; i <= 5; i++) {
            res = res * i;
        }
        return res;
    }

    public static String multiplicationsString(long num){
        String res = "";
        for (int i = 1; i <= num; i++) {
            res += i + " * ";
        }

        return res.substring(0, res.length()-3);
    }

    public static int potencia(int base,int expo){
        // En una sola linea
//        return expo==1 ? base:( expo==0 ? 1: base * potencia(base,expo-1));

        if(expo==1)
            return base;
        else if(expo==0)
            return 1;

        return base * potencia(base,expo-1);
    }

    public static void imprimirNumeros2(int num){

    }

    public static void imprimirNumeros(int num){

        if (num == 1)
            System.out.println(num);
        else{
            System.out.println(num);
            imprimirNumeros(num-1);
        }

    }

    public static void imprimir1aN(int n){
        imprimir1aN(n, 1);
    }

    private static void imprimir1aN(int n, int count){
        if (count > n)
            return;

        System.out.println(count);
        imprimir1aN(n, count+1);
    }

    public static void main(String[] args) {
//        System.out.println(fibonacciRec(4));

        imprimir1aN(10);

//        imprimirNumeros(n);
    }

}
