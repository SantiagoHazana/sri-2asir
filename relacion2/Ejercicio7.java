package relacion2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int num;

        System.out.printf("Ingrese un numero para ir sumandolo, ingrese 0 para terminar: ");
        num = scanner.nextInt();

        while (num != 0){
            total += num;
            System.out.printf("Ingrese un numero para ir sumandolo, ingrese 0 para terminar: ");
            num = scanner.nextInt();
        }

        System.out.printf("El total es: %d", total);
    }
}
