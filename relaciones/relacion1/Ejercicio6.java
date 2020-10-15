package relaciones.relacion1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();

        if (num1%num2 != 0){
            System.out.println("num1 es multiplo de num2");
        }

    }



}
