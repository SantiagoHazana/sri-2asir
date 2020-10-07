package relacion1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;

        System.out.println("Ingrese una hora en formato 24hs.");
        System.out.printf("Ingrese la hora: ");
        hours = scanner.nextInt();
        System.out.printf("Ingrese los minutos: ");
        minutes = scanner.nextInt();
        System.out.printf("Ingrese los segundos: ");
        seconds = scanner.nextInt();

        while (!checkTime(hours, minutes, seconds)){
            System.out.println("Ingreso una hora incorrecta, intente nuevamente.");
            System.out.printf("Ingrese la hora: ");
            hours = scanner.nextInt();
            System.out.printf("Ingrese los minutos: ");
            minutes = scanner.nextInt();
            System.out.printf("Ingrese los segundos: ");
            seconds = scanner.nextInt();
        }

        System.out.printf("La hora en el siguiente segundo es: %s", nextTime(hours, minutes, seconds));
    }

    private static String nextTime(Integer hours, Integer minutes, Integer seconds) {
        seconds++;
        if (seconds == 59){
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

        return (hours.toString().length()==1 ? ("0"+hours):(hours)) + ":" +
                (minutes.toString().length()==1 ? ("0"+minutes):(minutes)) + ":" +
                (seconds.toString().length()==1 ? ("0"+seconds):(seconds)) + "hs";
    }

    private static boolean checkTime(int hours, int minutes, int seconds) {
        return hours >= 0 && hours <= 24 && minutes >= 0 && minutes <= 60 && seconds >= 0 && seconds <= 60;
    }
}
