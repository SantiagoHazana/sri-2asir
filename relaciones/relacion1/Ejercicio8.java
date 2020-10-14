package relaciones.relacion1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.printf("Ingrese un numero: ");
        num1 = scanner.nextInt();
        System.out.printf("Ingrese otro numero: ");
        num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " es el mayor");
        }else if (num2 > num1){
            System.out.println(num2 + " es el mayor");
        }else{
            System.out.println("Son iguales");
        }

        String res = (num1==num2) ? "Son iguales":(num1>num2) ? "es mayor que":"es menor que";
        System.out.printf("%d %s %d", num1, res, num2);
    }
}
