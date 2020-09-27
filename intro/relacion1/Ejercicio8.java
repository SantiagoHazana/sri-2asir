package intro.relacion1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        if (num1 > num2){
            System.out.println(num1 + " es el mayor");
        }else if (num2 > num1){
            System.out.println(num2 + " es el mejor");
        }else{
            System.out.println("Son iguales");
        }
    }
}
