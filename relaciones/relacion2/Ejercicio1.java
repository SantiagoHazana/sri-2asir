package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

    // Funcion o metodo para saber si un numero es primo
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

    // Funcion o metodo para saber si un numero es primo
    public static boolean primo2(int num){

        // Con for
        for (int i = 2; (i*i) < num; i++) {
            if (num%i == 0)
                return false;
        }
        return true;
    }

    // Funcion o metodo para saber todos los numeros primos hasta el numero dado
    public static String primosString(int num){
        String res = "";

        for (int i = 2; i <= num; i++) {
            if (primo(i)){
                res += i + "\n";
            }
        }

        return res;
    }

    // Funcion o metodo para saber la cantidad de numeros primos hasta un numero dado
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
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        boolean incorrect = true;

        do{
            try {
                incorrect = false;
                System.out.printf("Ingrese un numero para comprobar si es primo y dar los numeros primos antes de el: ");
                num = Integer.parseInt(scanner.readLine());
            } catch (IOException e) {
                incorrect = true;
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                incorrect = true;
                System.out.println("Ingrese un numero!");
            }
        }while (incorrect);


        System.out.printf(primo2(num) ? "El numero %d es primo\n":"El numero %d no es primo\n", num);

        System.out.printf("Hasta el numero %d hay %d numeros primos y son: \n", num, numPrimos(num));
        System.out.printf(primosString(num));
    }
}
