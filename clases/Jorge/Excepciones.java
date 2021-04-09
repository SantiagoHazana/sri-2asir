package clases.Jorge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean incorrecto = true;

        // como pedir un numero entero hasta que se ingrese lo correcto
//        while (incorrecto){
//            try{
//                System.out.print("Ingrese un numero entero: ");
//                num = scanner.nextInt();
//                incorrecto = false;
//            }catch (InputMismatchException e){
//                System.out.println("No metiste un numero, bobo");
//                scanner.next();
//            }
//        }
//
//        System.out.println("Al fin metiste un numero: " + num);


        // ingresar un numero positivo
//        while (incorrecto){
//            try{
//                System.out.print("Ingrese un numero entero positivo: ");
//                num = scanner.nextInt();
//                if (num > 0){
//                    incorrecto = false;
//                }else{
//                    System.out.println("Ingrese un numero positivo");
//                }
//            }catch (InputMismatchException e){
//                System.out.println("No metiste un numero entero, bobo");
//                scanner.next();
//            }
//        }
//
//        System.out.println("Al fin metiste un numero entero positivo: " + num);


        // pedir 10 numeros positivos
        for (int i = 0; i < 10; i++) {
            incorrecto = true;
            while (incorrecto){
                try{
                    System.out.print("Ingrese un numero positivo: ");
                    num = scanner.nextInt();
                    if (num > 0){
                        incorrecto = false;
                    }else{
                        System.out.println("Ingrese un numero positivo");
                    }
                }catch (InputMismatchException e){
                    System.out.println("No metiste un numero, bobo");
                    scanner.next();
                }
            }
            System.out.println("Uno de los numeros es: " + num + " te faltan " + (9-i) + " numeros");
        }

    }

}
