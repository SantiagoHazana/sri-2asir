package clases.Sara;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcioens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        boolean correct = false;

        do {
            System.out.printf("Ingrese un numero: ");
            try {
                num = scanner.nextInt();

                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Mete un numero, tonto");
                scanner.next();
            }
        } while (!correct);

        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }

        System.out.println("Mas codigo");
    }

}
