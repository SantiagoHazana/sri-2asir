package primeraEvaluacion.relaciones.relacion1;

import java.util.Scanner;

public class Ejercicio14 {

    public static int monthDays(int month){
        switch (month){
            case 2:
                return 28;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return 0;
    }

    public static boolean checkDate(int days, int month, int year){
        if(month < 1 || month > 12)
            return false;
        else if (days > monthDays(month) || days < 1)
            return false;
        else return year <= 2020;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        int month;
        int year;

        do{
            System.out.println("Fecha incorrecta, por favor intente nuevamente.");
            System.out.print("Introducir el dia: ");
            days = scanner.nextInt();
            System.out.print("Introducir el mes: ");
            month = scanner.nextInt();
            System.out.print("Introducir el año: ");
            year = scanner.nextInt();
        }while (!checkDate(days, month, year));

        System.out.println("La fecha introducida es correcta.");




    }
}
