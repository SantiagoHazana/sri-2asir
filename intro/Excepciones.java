package intro;

import com.sun.org.apache.xpath.internal.operations.Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        excepxion2();
    }

    // Utilizando buffer reader
    private static void excepxion1(){
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int numero = -1;
        int intentos = 0;

        do {
            try {
                System.out.printf("Ingrese un numero entre 0 y 100: ");
                numero = Integer.parseInt(scanner.readLine());
            }catch (IOException e){
                System.out.println("No se puedo leer del tecaldo.");
            }catch (NumberFormatException e){
                System.out.println("Debe ingresar un numero entre 0 y 100!\n\n");
            }finally {
                intentos++;
            }
        }while (numero < 0 || numero > 100);

        System.out.printf("Se ingreso en numero %d en %d intentos.", numero, intentos);
    }

    // Utilizando scanner
    private static void excepxion2(){
        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        int intentos = 0;

        do {
            try {
                System.out.printf("Ingrese un entero entre 0 y 100: ");
                numero = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Debe ingresar un numero entre 0 y 100!\n\n");
                // es necesario vaciar el buffer del scanner porque sino genera un bucle infinito al quedar el enter en el buffer
                scanner.next();
            }finally {
                intentos++;
            }
        }while (numero < 0 || numero > 100);

        System.out.printf("Se ingreso en numero %d en %d intentos.", numero, intentos);
    }
}
