package relacion1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;

        do{
            System.out.println("Ingreso una hora incorrecta, intente nuevamente.");
            System.out.printf("Ingrese la hora: ");
            hours = scanner.nextInt();
            System.out.printf("Ingrese los minutos: ");
            minutes = scanner.nextInt();
            System.out.printf("Ingrese los segundos: ");
            seconds = scanner.nextInt();
        }while (!checkTime(hours, minutes, seconds));

        System.out.printf("La hora en el siguiente segundo es: %s", nextTime(hours, minutes, seconds));
    }

    private static String nextTime(int hours, int minutes, int seconds) {
        seconds++;
        if (seconds == 60){
            seconds = 0;
            minutes ++;
        }
        if (minutes == 60){
            minutes = 0;
            hours++;
        }
        if (hours == 24){
            hours = 0;
        }

        return (hours/10==0 ? ("0"+hours):(hours)) + ":" +
                (minutes/10==0 ? ("0"+minutes):(minutes)) + ":" +
                (seconds/10==0 ? ("0"+seconds):(seconds)) + "hs";
    }

    private static boolean checkTime(int hours, int minutes, int seconds) {
        return hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60;
    }
}
