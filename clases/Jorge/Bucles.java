package clases.Jorge;

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        int contador = 0;
        System.out.println("Bucle while");
        while (contador < 10){
            System.out.println(contador);
            contador++;
        }

        contador = 0;

        System.out.println("Bucle do while");
        do {
            System.out.println(contador);
            contador++;
        }while (contador < 10);

        System.out.println("Bucle for");
        for (int cont = 0; cont<10; cont++){
            System.out.println(cont);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Tu primer numero es: " + num + ", tu segundo numero es: " + num2);

    }

}
