package clases.Sara;
// Una loteria que genere 6 numero aleatorios entre 0 y 49 y ordenados
// Generar un intento de un usuario, con 6 numeros aleatorios y comprobar si gana o no
// Si no gana, se genera otro intento de la persona, hasta que gane
public class Loteria {

    public static void main(String[] args) {
        int[] loteria;
        int[] intento;
        int contadorDeIntentos = 0;

        long inicioTimer = System.currentTimeMillis();
        //bucle
            // generando y comparando los intentos del jugador
            // aumentar el contador
            // Cuando gana, se termina el bucle
        //fin bucle
        long finTimer = System.currentTimeMillis();

        long tiempoTotal = finTimer - inicioTimer;

        System.out.println(); // los intentos hasta ganar y el tiempo
    }

}
