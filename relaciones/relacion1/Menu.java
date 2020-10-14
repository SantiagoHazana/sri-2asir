package relaciones.relacion1;

import java.util.Scanner;

/*
* Clase menu que me genera un menu con todos los ejercicios de la relacion 1
* y se pueden ejecutar
* */

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        
        // Menu de opciones
        do {
            menu();

            option = scanner.nextInt();

            options(option, scanner);

        }while (option != 0);

        System.out.println("Bye, gracias por utilizarme!");
    }

    private static void options(int option, Scanner scanner) {

        switch (option){
            case 1:
                longitudCirculo(scanner);
                break;
            case 2:
                cifrasNumero(scanner);
                break;
            case 3:
                invertNumber(scanner);
                break;
            case 4:
                dimeNota(scanner);
        }

    }

    public static void menu() {
        System.out.println("Relacion 1 - Java");
        System.out.println("Santiago Hazaña");
        System.out.println("-----------------------");
        System.out.println("1. Longitud circulo.");
        System.out.println("2. Cifras numero.");
        System.out.println("3. Invertir numero.");
        System.out.println("4. Dime tu nota.");
        System.out.println("0. Salir.");
        System.out.printf("Opcion: ");
    }

    public static void dimeNota(Scanner scanner){
        float nota;

        System.out.printf("Ingrese su nota: ");
        nota = scanner.nextFloat();

        if (nota >=0 && nota < 5){
            System.out.println("Suspenso");
        }else if (nota < 6){
            System.out.println("Suficiente");
        }else if (nota < 8){
            System.out.println("Bien");
        }else if (nota < 10){
            System.out.println("Sobresaliente");
        }else if (nota == 10){
            System.out.println("Honor");
        }else{
            System.out.println("Nota fuera de rango");
        }
        System.out.println("");
    }

    public static void invertNumber(Scanner scanner){
        int num;

        System.out.println("Ingrese un numero: ");
        num = scanner.nextInt();

        // Hecho matematicamente
        System.out.printf("El number %d inverso es %d\n\n", num, invert(num));
    }

    private static int invert(int num){
        int n;
        int inverse = 0;

        while (num != 0){
            n = num%10;
            num /= 10;
            inverse = inverse * 10 + n;
        }

        return inverse;
    }

    public static void cifrasNumero(Scanner scanner){
        int num;

        do {
            System.out.println("Ingrese un numero entre 0 y 9999: ");
            num = scanner.nextInt();
        }while (num < 0 || num > 9999);

        System.out.printf("El numero tiene %d cifras.\n\n", number(num));
    }

    public static int number(int num){
        int count = 0;
        while (num != 0){
            count++;
            num /= 10;
        }
        return count;
    }

    public static void longitudCirculo(Scanner scanner){
        float radio;
        float longitud;

        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextFloat();
        longitud = (float) (2 * Math.PI * radio);
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.printf("La longitud de la circunferencia con radio %5.2f es: %5.2f\n\n", radio, longitud);
    }

}
