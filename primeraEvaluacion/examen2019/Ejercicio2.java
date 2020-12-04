package primeraEvaluacion.examen2019;

import java.util.ArrayList;

public class Ejercicio2 {

    public static boolean abundante(int n){
        int sumaDivisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0)
                sumaDivisores+=i;
        }
        return sumaDivisores>n*2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> abundantes = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            if (abundante(i))
                abundantes.add(i);
        }

        for (Integer i : abundantes) {
            System.out.printf("%4d | ", i);
        }
    }
}
