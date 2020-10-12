package clases.Dani;

import java.util.Scanner;

//Pedir el radio de una circunferencia y calcular su longitud L=2*PI*r.
public class R1_Ej3 {

    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int radio;
        double longitud;

        System.out.printf("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextInt(); // lee lo que la persona ingrese que sea de tipo int.

        longitud = 2 * Math.PI * radio;

        System.out.printf("La longitud de la circunferencia es: " + longitud);

    }

}
