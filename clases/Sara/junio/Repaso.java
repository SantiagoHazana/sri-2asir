package clases.Sara.junio;

import java.util.Arrays;
import java.util.Scanner;

public class Repaso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = scanner.nextInt();
        System.out.println();

        System.out.println("Rango entre " + num1 + " y " + num2);
        mostrarRango(num1, num2);
        System.out.println();
        System.out.println();

//        System.out.println("Sumatoria entre " + num1 + " y " + num2 + ": " + sumarIntervalo(num1, num2));
        System.out.printf("Sumatoria entre %d y %d: %d", num1, num2, sumarIntervalo(num1, num2));
        System.out.println();

        System.out.println("Matriz con numeros aleatorios");
        int[] mat = matrizDeAleatorios(num1);
        System.out.print("| ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i] + " | ");
        }
        System.out.println();
        System.out.println();
//        System.out.println(Arrays.toString(matrizDeAleatorios(num1)));

        //Ver cual de los dos numeros es mayor
//        if (num1 > num2)
//            System.out.println("El primero es mayor");
//        else
//            System.out.println("El segundo es mayor");

        // Como utilizar el operador ternario para lo anterior
        System.out.println(num1 > num2 ? "El primero es mayor":"El segundo es mayor");



    }

    // Para mostrar todos los numeros entre dos numeros dados
    public static void mostrarRango(int n1, int n2){
        System.out.print("| ");
        for (int i = n1; i <= n2; i++) {
            System.out.print(i + " | ");
        }
    }

    public static void mostrarRango(int start, int end, int hop){
        System.out.print("| ");
        for (int i = start; i <= end; i+=hop) {
            System.out.print(i + " | ");
        }
    }

    // Funcion que recibe dos numeros y me da la suma de todos los numeros entre ellos
    public static int sumarIntervalo(int n1, int n2){
        int acum = 0;
        for (int i = n1; i <= n2; i++) {
            acum += i;
        }
        return acum;
    }

    // Funcion que recibe un numero y me devuelve una matriz con esa cantidad de numeros aleatorios entre 10 y 99
    public static int[] matrizDeAleatorios(int n){
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = (int) (Math.random()*89+10);
        }
        return numeros;
    }

    // Funcion que me devuelve el mayor numero entre dos dados
    public static int mayor(int n1, int n2){
        return n1 > n2 ? n1 : n2;
//        return Math.max(n1, n2);
    }

}
