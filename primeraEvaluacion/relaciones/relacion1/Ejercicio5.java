package primeraEvaluacion.relaciones.relacion1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num;

        System.out.print("Introducir un numero: ");
        num = scanner.nextFloat();
        if (num >= 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }
}
