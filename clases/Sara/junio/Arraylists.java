package clases.Sara.junio;

import java.util.ArrayList;
import java.util.Random;

public class Arraylists {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        // Llenar arraylist con 10 numeros aleatorios entre 10 y 99
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(89)+10);
        }

        // Ordena los numeros con el compareTo de Integer
        numeros.sort(Integer::compareTo);

        numeros.forEach(System.out::println);
        // Meter un valor en una posicion especifica
        numeros.add(3, 100);
        System.out.println();
        numeros.forEach(System.out::println);
        // Leer un valor especifico, una posicion
        numeros.get(3);

        for (Integer num : numeros) {
            System.out.print(num + " | ");
        }

    }

}
