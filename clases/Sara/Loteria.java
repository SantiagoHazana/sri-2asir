package clases.Sara;

import java.util.Arrays;
import java.util.Scanner;

// Una loteria que genere 6 numero aleatorios entre 0 y 49 y ordenados
// Generar un intento de un usuario, con 6 numeros aleatorios y comprobar si gana o no
// Si no gana, se genera otro intento de la persona, hasta que gane
// 5 15 20 33 40 41
public class Loteria {

    public static int[] generarCombinacion(){
        int[] resultado = new int[6];

        for (int i = 0; i < 6; i++) {
            resultado[i] = (int) (Math.random() * 49) +1;
        }
        Arrays.sort(resultado);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Introducir las repeticiones: ");
        int repeticiones = scanner.nextInt();

        long[][] resultados = new long[repeticiones][2];

        for (int i = 0; i < repeticiones; i++) {
            int[] loteria = generarCombinacion();
            int[] intento = generarCombinacion();
            long contadorDeIntentos = 1;

            long inicioTimer = System.currentTimeMillis();
            while (!Arrays.equals(intento, loteria)){
                intento = generarCombinacion();
                contadorDeIntentos++;
            }
            long finTimer = System.currentTimeMillis();

            long tiempoTotal = finTimer - inicioTimer;

            //Guardado de resultados
            resultados[i][0] = contadorDeIntentos;
            resultados[i][1] = tiempoTotal;

            System.out.printf("%d. Has ganado la loteria despues de %9d intentos y tardo %2.2f segundos\n", i+1, contadorDeIntentos, (float)tiempoTotal/1000);
        }

        long acumIntentos = 0;
        long acumTiempo = 0;
        for (int i = 0; i < resultados.length; i++) {
            acumIntentos += resultados[i][0];
            acumTiempo += resultados[i][1];
        }

        acumTiempo = acumTiempo/1000;

        // Falta mostrar la repeticion con la mayor cantidad de intentos con su tiempo y mostrar la repeticion que tardo menos con sus intentos
        System.out.printf("La media de intentos es %d con un tiempo medio de %2.2f segundos\n", acumIntentos/repeticiones, (float)acumTiempo/repeticiones);

    }

}
