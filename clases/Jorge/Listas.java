package clases.Jorge;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        // los arraylist solo guardan clases dentro, por eso los int se pone Integer, float se pone Float
        ArrayList<Integer> numeros = new ArrayList<>(3); // la capacidad inicial es opcional

        // agregar elementos
        numeros.add(8);
        numeros.add(4);
        numeros.add(3);
        numeros.add(-10);

        // leer un numero
        numeros.get(0); // en los arrays vos ponias numeros[0]

        // como meter un valor en una posicion especifica
        numeros.add(2, 10); // se pone la posicion donde lo queres y luego el valor

        // imprimir todos los valores, necesitamos el tamaño de la matriz que se pide numeros.size()
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        System.out.println();// salto de linea vacio
        System.out.println();

        // para eliminar un valor
        numeros.remove(3);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }

}
