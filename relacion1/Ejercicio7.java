package relacion1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean incorrect = true;

        do{
            try {
                incorrect = false;
                System.out.print("Ingrese el primer numero: ");
                num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                num2 = scanner.nextInt();
            }catch (InputMismatchException e){
                incorrect = true;
                scanner.next();
                System.out.println("Eso no es un numero! Intenta nuevamente.");
            }
        }while (incorrect);


        if (num1 > num2){
            System.out.println(num1 + " > " + num2);
        }else if (num2 > num1){
            System.out.println(num2 + " > " + num1);
        }else{
            System.out.println(num1 + " = " + num2);
        }

    }
}
