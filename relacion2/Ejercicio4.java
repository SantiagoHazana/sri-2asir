package relacion2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.printf("Ingrese un numero: ");
        num = scanner.nextInt();

        while (num != 0){
            System.out.println( num%2==0 ? "Par":"Impar");
            System.out.printf("Ingrese un numero: ");
            num = scanner.nextInt();
        }
    }
}
