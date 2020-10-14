package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int num = -1;
        boolean correct = true;

        //Forma original sin try catch
//        while (num != 0){
//            System.out.println( num%2==0 ? "Par":"Impar");
//            /* La linea de arriba equivale a lo siguiente
//            * if (num%2 == 0)
//            *   System.out.println("Par");
//            * else
//            *   System.out.println("Inpar");
//            * */
//            System.out.printf("Ingrese un numero: ");
//            num = scanner.nextInt();
//        }

        while (num != 0){

            try {
                correct = true;
                System.out.printf("Ingrese un numero: ");
                num = Integer.parseInt(scanner.readLine());
            } catch (IOException e) {
                correct = false;
                System.out.println("Error al leer del teclado\n");
            } catch (NumberFormatException e){
                correct = false;
                System.out.println("Metiste cualquier cosa.\n");
            }

            if (num != 0 && correct)
                System.out.println( num%2==0 ? "Par\n":"Impar\n");

        }
        System.out.println("\nAdios!");
    }
}
