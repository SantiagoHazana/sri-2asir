package primeraEvaluacion.relaciones.relacion1;

import sorters.BubbleSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        BubbleSort bubbleSort = new BubbleSort();

        /*

        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            if (num2 > num3){
                System.out.println(num1 + " > " + num2 + " > " + num3);
            }else if (num3 > num2){
                System.out.println(num1 + " > " + num3 + " > " + num2);
            }else{
                System.out.println(num1 + " > " + num2 + " = " + num3);
            }
        }else if (num2 > num1 && num2 > num3){
            if (num1 > num3){
                System.out.println(num2 + " > " + num1 + " > " + num3);
            }else if (num3 > num1){
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }else{
                System.out.println(num2 + " > " + num3 + " = " + num1);
            }
        }else if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            } else if (num2 > num1){
                System.out.println(num3 + " > " + num2 + " > " + num1);
            } else{
                System.out.println(num3 + " > " + num2 + " = " + num1);
            }
        }else if (num1 == num2 && num2 == num3){
            System.out.println(num1 + " = " + num2 + " = " + num3);
        }else if(num1 == num2){
            System.out.println(num1 + " = " + num2 + " > " + num3);
        }else if (num1 == num3){
            System.out.println(num1 + " = " + num3 + " > " + num2);
        }else{
            System.out.println(num2 + " = " + num3 + " > " + num1);
        }
        */

        List<Integer> nums = new ArrayList<>();
        int next;

        do {
            System.out.printf("Ingrese numeros para ordenarlos, ingrese 0 para finalizar: ");
            next = scanner.nextInt();
            nums.add(next);
        }while (next != 0);

        bubbleSort.sort(nums);

        for (int n :
                nums) {
            System.out.printf("%d <= ", n);
        }
    }
}
