package primeraEvaluacion.relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14V2 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int pos = 0;
        int neg = 0;
        int num = 0;
        int zeros = 0;
        int count = 0;
        int countPos = 0;
        int countNeg = 0;
        boolean correct;

        while (count < 10) {
            try {
                correct = true;
                System.out.printf("Ingrese un numero: ");
                num = Integer.parseInt(scanner.readLine());
            }catch (IOException e) {
                correct = false;
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                correct = false;
                System.out.println("Ingrese un numero!!!");
            }
            if (correct){
                if (num > 0) {
                    pos += num;
                    countPos++;
                } else if (num < 0){
                    neg += num;
                    countNeg++;
                } else {
                    zeros++;
                }
                count++;
            }

        }
        try {
            System.out.printf("La media de los numeros positivos es: %6.2f\n", (float)pos/countPos);
            System.out.printf("La media de los numeros negativos es: %6.2f\n", (float)neg/countNeg);
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }

        System.out.printf("El total de 0 introducidos es: %d", zeros);
    }
}
