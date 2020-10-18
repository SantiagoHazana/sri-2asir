package clases.Sara;

import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        System.out.println( (int) (Math.random()*10)); // Me esta dando un numero entre 0 y 9
        System.out.println( (int) (Math.random()*10+1)); // Me esta dando un numero entre 1 y 10

        Random random = new Random();
        System.out.println(random.nextInt()); // Un numero entero aleatorio entre todo el rango de los int
        System.out.println(random.nextInt(50)); // Un numero entero aleatorio entre 1 y el numero especificado, incluyendo el 1 y excluyendo el limite superior, esto me daria un numero entre 1 y 49

        Random random2 = new Random(1234);
        Random random3 = new Random(1234);

        System.out.println(random.nextInt());
        System.out.println(random2.nextInt());
        System.out.println(random3.nextInt());
        String resultado = "";
        for (int i = 0; i < 10; i++) {
            resultado += (int)(random2.nextInt(151)) + " - ";
        }

        System.out.println(resultado);

        /*
        * Hacer un programa con 4 metodos, donde me genere en cada uno 5 numeros aleatorios, uno de ellos con Math.random
        * otro con la clase Random sin semilla y otros dos con la clase random pero con la misma semilla ambos.
        * Mostrar los resultados de los 5 numeros aleatorios
        * */

        //codigo de Sara
    }
}
