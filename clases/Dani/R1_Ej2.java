package clases.Dani;

import java.util.Scanner;

// Pedir el radio de un círculo y calcular su área. A=PI*r2
public class R1_Ej2 {

    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in); // el scanner leera el numero del usuario
        int radio; // va a tomar el valor que me de el usuario
        double area; // va a guardar el area resultante, el resultado de la formula A=PI*radio^2

        // Pedimos al usuario el radio
        System.out.printf("Ingrese el radio del circulo: ");
        radio = scanner.nextInt(); // aca el usuario ingresa el numero y se lo asignamos al radio

        // calculamos el area con la formula, tuvimos que cambiar de int a double porque el resultado da en double
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area es: " + area); // concatenamos el texto con el numero

    }

}
