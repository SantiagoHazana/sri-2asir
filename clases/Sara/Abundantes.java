package clases.Sara;

import java.util.ArrayList;

public class Abundantes {

    public static boolean abundante(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0)
                suma += i;
        }
        return suma > 2*n;
    }

    public static void main(String[] args) {
        ArrayList<Integer> abun = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (abundante(i))
                abun.add(i);
        }
        for ( Integer num : abun ) {
            System.out.println(num);
        }
    }
}