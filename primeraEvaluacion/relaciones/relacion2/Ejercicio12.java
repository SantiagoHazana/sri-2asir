package primeraEvaluacion.relaciones.relacion2;

public class Ejercicio12 {
    public static void main(String[] args) {
        int total = 1;

        for (int i = 1; i < 20; i+=2) {
            total *= i;
        }

        System.out.printf("El total de la multiplicacion 10 primeros numeros impares es: %d", total);
    }
}
