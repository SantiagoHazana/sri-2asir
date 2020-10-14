package relaciones.relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ejercicio14 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int num = 0;
        int zeros = 0;
        int count = 0;
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
                    pos.add(num);
                } else if (num < 0){
                    neg.add(num);
                } else {
                    zeros++;
                }
                count++;
            }

        }


        float totalPos = 0;
        if (pos.size() > 0){
            totalPos = pos.stream().mapToInt(n -> n).sum();
        }
        float totalNeg = 0;
        if (neg.size() > 0){
            totalNeg = neg.stream().mapToInt(n -> n).sum();
        }

        System.out.printf("La media de los numeros positivos es: %6.2f\n", totalPos /pos.size());
        System.out.printf("La media de los numeros negativos es: %6.2f\n", totalNeg /neg.size());
        System.out.printf("El total de 0 introducidos es: %d", zeros);
    }
}
