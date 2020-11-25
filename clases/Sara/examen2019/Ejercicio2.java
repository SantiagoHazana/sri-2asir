package clases.Sara.examen2019;

import java.util.ArrayList;

public class Ejercicio2 {

    public static boolean abundante(int n){
        int suma = 0;
        //saber si es divisor
        for(int i=1; i<=n ; i++){
            if(n%i==0){
                suma += i;
            }
        }
        
        return suma > 2*n;
    }
    public static void main(String[] args){
        ArrayList<Integer> m = new ArrayList<>();

        for(int i=1; i<=1000; i++){
            if (abundante(i)){
                m.add(i);
            }
        }

        for (Integer i : m) {
            System.out.println(i);
        }

    }
    
}
