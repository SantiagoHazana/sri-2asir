package clases;

import java.util.Scanner;

public class sara03_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = 45.135459f;
        int num2 = 5;
        System.out.printf("El numero es: %5.2f y %d", num, num2);

        // Switch
        switch (num2){
            case 6:
                System.out.println("Vale 6");
                break;
            case 10:
                System.out.println("Vale 10");
                break;
            default:
                System.out.println("No se cuanto vale");
                break;
        }

        while (num2 > 10){
            System.out.println("AAAAAAAAAAA");
        }

        do {
            System.out.println("AAAAAAAAAAA");
        }while (num2 > 10);


        int edad = 17;

        do {
            System.out.printf("Ingrese su edad: ");
            edad = scanner.nextInt();
        }while (edad < 18);

//        For
        int[] numeros = {5, 6, 9, 4, 3};
        String[] nombres = {"Sara", "Santi"};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
//         Imprimir los pares entre 1 y 100
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        }

//         Forma de hacer un if else
        if (edad < 18){
            System.out.println("Menor de edad");
        }else{
            System.out.println("Mayor de edad");
        }

        System.out.println( edad<18 ? "Menor de edad" : "Mayor de edad" );



    }

}
