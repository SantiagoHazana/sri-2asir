package relacion1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}
