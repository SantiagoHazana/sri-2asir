package clases;

import java.util.Scanner;

public class DaniSanchez{
    // Variables de clase
    // Empiezan siempre en minusculas, y si son varias palabras, las siguientes con mayusculas
    // = es asignacion, no compara (comparar es ==)
    int num = 5;
    long num1 = 65;
    float num2 = 5.2f; // con la f le decimos que es un float y no un double
    char letra = '5'; // los caracteres se ponen con comillas simples
    boolean aprobadoDani = false;
    String nombre = "Daniel"; // el String va con comillas dobles

    // Esto es un metodo
    public int suma(){
        // variable de metodo
        int resultado = 5 + 4;
        return resultado;
    }

    public int suma2(){
        int resultado = suma() + 5 + num; // suma me devuelve 9 y lo asigno a resultado
        resultado = resultado + suma3(5, 3);
        mensaje();
        return resultado;
    }

    public void mensaje(){
        System.out.println("Hola");
    }

    // Metodo que recibe dos parametros
    public static int suma3(int x, int y){
        int resultado = x + y;
        return resultado;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num;
        int num2;
        int resultado;
        // Una manera de sumarlos

        System.out.print("Introduzca un numero: ");
        num = scanner.nextInt();
        System.out.print("Introduzca otro numero: ");
        num2 = scanner.nextInt();

        resultado = num + num2;
        System.out.println("La suma de los dos numeros es: " + resultado );
        // Otra manera de sumarlos
        resultado = suma3(num, num2);
        System.out.println("La suma de los dos numeros es: " + resultado );
    }

}