package relacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos
// mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
public class Ejercicio16 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> edades = new ArrayList();
        ArrayList<Integer> alturas = new ArrayList();
        int edad = 0;
        int altura = 0;
        boolean correct;

        for (int i = 0; i < 5; i++) {
            try {
                correct = true;
                System.out.println("Ingrese la edad y altura (en cm) de un alumno");
                System.out.printf("Edad: ");
                edad = Integer.parseInt(scanner.readLine());
                System.out.printf("Altura: ");
                altura = Integer.parseInt(scanner.readLine());
            }catch (IOException e) {
                i--;
                correct = false;
                System.out.println("Error al leer del teclado");
            } catch (NumberFormatException e){
                i--;
                correct = false;
                System.out.println("Ingrese un numero!!!");
            }

            if (correct){
                edades.add(edad);
                alturas.add(altura);
            }
        }

        float promEdades = 0;
        int mayores = 0;

        for (int ed : edades) {
            promEdades+=ed;
            if (ed >= 18)
                mayores++;
        }

        float promAlturas = 0;
        int altos = 0;

        for (int alt : alturas) {
            promAlturas+=alt;
            if (alt >= 175)
                altos++;
        }

        System.out.printf("\nDe los alumnos ingresados, la edad promedio es %f, de los cuales %d son mayores de edad\n", promEdades/edades.size(), mayores);
        System.out.printf("\nDe los alumnos ingresados, la altura promedio es %f, de los cuales %d son mas altos de 1.75m\n", promAlturas/alturas.size(), altos);

    }
}
