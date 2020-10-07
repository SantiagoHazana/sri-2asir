package relacion2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.printf("Ingrese un numero mayor a 1: ");
            num = scanner.nextInt();
        }while (num <= 1);

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
