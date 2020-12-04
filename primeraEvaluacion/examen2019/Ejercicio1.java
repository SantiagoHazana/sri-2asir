package primeraEvaluacion.examen2019;

public class Ejercicio1 {

    public static void main(String[] args) {
        // a) Crear una tabla con dichos datos numéricos.
        int[][] notas = {{0, 1, 2, 6, 6, 5, 2, 2, 0, 1}, {1, 3, 1, 3, 4, 2, 1, 1, 1, 1}};

        // b) Calcular el total de alumnos de la clase A y de la Clase B, así como el total de alumnos con
        //cada una de las distintas calificaciones.

        int totalClaseA=0;
        int totalClaseB=0;
        for (int i = 0; i < notas[0].length; i++) {
            totalClaseA += notas[0][i];
            totalClaseB += notas[1][i];
        }
        System.out.printf("El total de alumnos de la Clase A es: %d\n", totalClaseA);
        System.out.printf("El total de alumnos de la Clase B es: %d\n", totalClaseB);
        for (int i = 0; i < notas[0].length; i++) {
            System.out.printf("El total de alumnos con nota %d es %d\n", i+1, notas[0][i]+notas[1][i]);
        }

        // c) Calcula la media de cada curso.
        int mediaClaseA=0;
        int mediaClaseB=0;
        for (int i = 0; i < notas[0].length; i++) {
            mediaClaseA += (notas[0][i]*(i+1));
            mediaClaseB += (notas[1][i]*(i+1));
        }
        System.out.printf("La media de la Clase A es %3.2f\n", (float)mediaClaseA/totalClaseA);
        System.out.printf("La media de la Clase B es %3.2f\n", (float)mediaClaseB/totalClaseB);

        // d) Calcula la media del total de datos
        System.out.printf("La media de las dos clases es %3.2f\n", (float)(mediaClaseA+mediaClaseB)/(totalClaseA+totalClaseB));

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("| ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("%d | ", notas[i][j]);
            }
            System.out.println("");
        }
    }

}
