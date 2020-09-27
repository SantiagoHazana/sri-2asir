package intro.relacion1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float radio;
        float longitud;

        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextFloat();
        longitud = (float) (2 * Math.PI * radio);
        System.out.println("La longitud de la circunferencia es: " + longitud);
    }
}
