package relacion1;

import java.util.Scanner;

public class Ejercicio10 {

    public static int number(int num){
        int count = 0;
        while (num != 0){
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingrese un numero entre 0 y 9999: ");
            num = scanner.nextInt();
        }while (num < 0 || num > 9999);

        System.out.printf("El numero tiene %d cifras.", number(num));
    }
}
