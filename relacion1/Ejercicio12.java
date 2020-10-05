package relacion1;

import java.util.Scanner;

public class Ejercicio12 {


    public static boolean palindrome(Integer num){
        for (int i = 0; i < num.toString().length()/2; i++) {
            if (num.toString().charAt(i) != num.toString().charAt(num.toString().length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingrese un numero entre 0 y 9999: ");
            num = scanner.nextInt();
        }while (num < 0 || num > 9999);

        if (palindrome(num)){
            System.out.println("El numero SI ES capicua");
        }else{
            System.out.println("El numero NO ES capicua");
        }
    }
}
