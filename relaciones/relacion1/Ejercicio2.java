package relaciones.relacion1;

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

        // Como imprimir con X numero de decimales
        System.out.printf("El area del circulo es: %5.2f \n", area); // con % hacemos referencia a las siguientes variables que se pasen
        // Si pongo f o d solo el numero sale completo, sino le puedo decir cuantos numeros tendra y cuantos de ellos son decimales
        // Cada tipo lleva su respectiva letra, string s, float f, double d
        System.out.printf("El area del circulo con radio %f es: %5.2f \n" ,radio ,area); // Podemos tener mas de una variable


    }
}
