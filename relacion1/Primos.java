package relacion1;

import java.util.Scanner;

public class Primos {

    public static boolean primo(int num){

        // Con while
        int divisor = 2;

        while (divisor * divisor <= num){
            if (num%divisor == 0){
                return false;
            }
            divisor++;
        }
        return true;
    }

    public static boolean primo2(int num){

        // Con for

        for (int i = 2; (i*i) < num; i++) {
            if (num%i == 0)
                return false;
        }
        return true;
    }

    public static String primosString(int num){
        String res = "";

        for (int i = 2; i <= num; i++) {
            if (primo(i)){
                res += i + "\n";
            }
        }

        return res;
    }

    public static int numPrimos(int num){
        int res = 0;

        for (int i = 2; i <= num; i++) {
            if (primo(i)){
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.printf("Ingrese un numero para comprobar si es primo y dar los numeros primos antes de el: ");
        num = scanner.nextInt();

        System.out.printf(primo2(num) ? "El numero %d es primo\n":"El numero %d no es primo\n", num);
        System.out.printf("Hasta el numero %d hay %d numeros primos y son: \n", num, numPrimos(num));
        System.out.printf(primosString(num));
    }
}
