package relacion1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " > " + num2);
        }else if (num2 > num1){
            System.out.println(num2 + " > " + num1);
        }else{
            System.out.println(num1 + " = " + num2);
        }

    }
}
