package clases.Dani;

import java.util.Scanner;

// Pedir dos números y decir si son iguales o no.
public class R1_Ej4 {

    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.printf("Introduzca un numero: ");
        num1 = scanner.nextInt(); // 2
        System.out.printf("Introduzca otro numero: ");
        num2 = scanner.nextInt(); // 2

        // Comparamos los numeros para saber si son iguales o no
        if (num1 == num2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

    }

}
