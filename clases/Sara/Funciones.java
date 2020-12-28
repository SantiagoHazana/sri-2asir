package clases.Sara;

public class Funciones {
    // Cuatro tipos de funciones

    // La que no recibe nada y no devuelve nada
    public static void imprimir() {
        System.out.println("Linea 1");
        System.out.println("Linea 2");
        System.out.println("Linea 3");
        System.out.println("Linea 4");
        System.out.println("Linea 5");
    }

    // La que recibe algo y no devuelve nada, por ejemplo los setters
    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
        System.out.println(mensaje);
        System.out.println(mensaje);
        System.out.println(mensaje);
    }

    // La que no recibe nada y devuelve algo, por ejemplo los getters
    public static int dameNumRandom() {
        return (int) (Math.random() * 20);
    }

    // La que recibe algo y devuelve algo
    public static int suma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int res = suma(3, 7);
        int res2 = suma(dameNumRandom(), dameNumRandom());

        imprimir("El resultado de la suma es: " + (suma(dameNumRandom(), dameNumRandom())));

    }
}
