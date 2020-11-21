package clases.Dani;

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {

        // Bucle for
        for (int i = 0; i < 10; i++){
            System.out.println(i); //1 2 3 4 5 6 7 8 9 10
        }
        System.out.println("");
        // Bucle while
        int i =0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("");
        // Bucle do while
        int j =0;
        do {
            System.out.println(j);
            j++;
        }while (j < 10);


        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Ingrese un numero entre 1 y 10: ");
            numero = scanner.nextInt();
        }while (numero <= 0 || numero > 10);

        System.out.println("Tu numero es: " + numero);

    }

}
