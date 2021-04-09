package clases.Jorge;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        // Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
        Scanner scanner = new Scanner(System.in);
        int num = 5165465;
        int suma = 0;
        while (num != 0){
            // Pedir al usuario un numero
            System.out.print("Ingrese un numero: ");
            num = scanner.nextInt();
            // sumamos el numero
            suma = suma + num;// suma += num
        }

        System.out.println("La suma de todos los numeros es: " + suma);



    }

}
