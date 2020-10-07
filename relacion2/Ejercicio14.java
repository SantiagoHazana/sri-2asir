package relacion2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int zeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese un numero: ");
            int num = scanner.nextInt();
            if (num > 0) {
                pos.add(num);
            } else if (num < 0){
                neg.add(num);
            } else {
                zeros++;
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
