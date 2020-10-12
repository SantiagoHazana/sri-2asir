package relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int num = -1;

        do {
            try {
                System.out.printf("Ingrese un numero mayor a 1: ");
                num = Integer.parseInt(scanner.readLine());
            }catch (IOException e) {
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero!!!");
            }

        }while (num <= 1);

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
