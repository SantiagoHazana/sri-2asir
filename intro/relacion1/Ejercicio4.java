package intro.relacion1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1;
        float num2;
        System.out.print("Ingrese un numero: ");
        num1 = scanner.nextFloat();
        System.out.print("Ingrese otro numero: ");
        num2 = scanner.nextFloat();

        if(num1 == num2){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("Los numeros son distintos");
        }
    }
}
