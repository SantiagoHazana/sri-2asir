package intro.relacion1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num;

        System.out.print("Ingrese un numero entre 0 y 9999: ");
        num = scanner.nextInt();
        while (num < 0 || num > 9999){
            System.out.println("Ingrese un numero entre 0 y 9999: ");
            num = scanner.nextInt();
        }

        if (capicua(num)){
            System.out.println("El numero SI ES capicua");
        }else{
            System.out.println("El numero NO ES capicua");
        }
    }

    public static boolean capicua(Integer num){
        for (int i = 0; i < num.toString().length()/2; i++) {
            if (num.toString().charAt(0) != num.toString().charAt(num.toString().length()-1)){
                return false;
            }
        }
        return true;
    }
}
