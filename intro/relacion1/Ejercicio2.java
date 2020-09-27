package intro.relacion1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float radio;
        float area;

        System.out.print("Ingrese el radio del circulo: ");
        radio = scanner.nextFloat();
        area = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("El area del circulo es " + area);


    }
}
