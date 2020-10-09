package relacion2;

import java.util.Scanner;
// Pedir 5 números e indicar si alguno es múltiplo de 3.
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Ingrese un numero: ");
            int n = scanner.nextInt();
            if (n%3 == 0)
                System.out.printf("%d es multiplo de 3\n", n);
        }
    }
}
