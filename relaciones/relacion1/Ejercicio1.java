package relaciones.relacion1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a;
        float b;
        float c;

        float x1;
        float x2;

        float sqrt;

        System.out.println("Ingrese los coeficientes de la ecuacion: ");
        System.out.print("a: ");
        a = scanner.nextFloat();
        System.out.print("b: ");
        b = scanner.nextFloat();
        System.out.print("c: ");
        c = scanner.nextFloat();

        sqrt = (float) (Math.pow(b, 2) - (4 * a * c));

        if(sqrt < 0){
            System.out.println("No hay solucion real");
        }else{
            x1 = (float) ((-b + Math.sqrt(sqrt))/ (2*a));
            x2 = (float) ((-b - Math.sqrt(sqrt))/ (2*a));
            if(x1 == x2){
                System.out.println("Las raices son iguales, su valor es x1=x2= " + x1);
                System.out.printf("Las raices son iguales, su valor es %5.2f", x1);
            }else{
                System.out.println("Las raices son x1= " + x1 + " y x2= " + x2);
                System.out.printf("Las raices son x1=%5.2f y x2=%5.2f", x1, x2);
            }
        }
    }


}
