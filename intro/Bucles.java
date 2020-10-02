package intro;

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.printf("Ingrese un numero entre 1 y 10 para mostrar su tabla: ");
            num = scanner.nextInt();
        }while (num<1 || num>10);

        for (int i = 1; i < 11; i++) {
            System.out.printf("%2d x %2d = %3d\n", num, i, num*i); // Imprimo formateado para que salga alineado
        }

    }
}
