package relacion1;

import java.util.Scanner;

public class Ejercicio16 {

    private static String writtenNumber(Integer num) {
        String number = "";
        int unidades = num%10;
        int decenas = num/10;

        if (num >= 10 && num <=15 || num == 0 || num == 20) {
            switch (num) {
                case 0:
                    number = "Cero";
                    break;
                case 10:
                    number = "Diez";
                    break;
                case 11:
                    number = "Once";
                    break;
                case 12:
                    number = "Doce";
                    break;
                case 13:
                    number = "Trece";
                    break;
                case 14:
                    number = "Catorce";
                    break;
                case 15:
                    number = "Quince";
                    break;
                case 20:
                    number = "Veinte";
                    break;
            }
        }else {
            switch (decenas) {
                case 0:
                    number += "";
                    break;
                case 1:
                    number += ("diesi");
                    break;
                case 2:
                    number += ("veinti");
                    break;
                case 3:
                    number += ("treinta");
                    break;
                case 4:
                    number += ("cuarenta");
                    break;
                case 5:
                    number += ("cincuenta");
                    break;
                case 6:
                    number += ("sesenta");
                    break;
                case 7:
                    number += ("setenta");
                    break;
                case 8:
                    number += ("ochenta");
                    break;
                case 9:
                    number += ("noventa");
                    break;
            }
            if (decenas != 0 && unidades != 0 && decenas != 2)
                number += " y ";

            switch (unidades) {
                case 0:
                    number += ("");
                    break;
                case 1:
                    number += ("uno");
                    break;
                case 2:
                    number += ("dos");
                    break;
                case 3:
                    number += ("tres");
                    break;
                case 4:
                    number += ("cuatro");
                    break;
                case 5:
                    number += ("cinco");
                    break;
                case 6:
                    number += ("seis");
                    break;
                case 7:
                    number += ("siete");
                    break;
                case 8:
                    number += ("ocho");
                    break;
                case 9:
                    number += ("nueve");
                    break;
            }
        }
        return number;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.printf("Ingrese un numero entre 0 y 99: ");
            num = scanner.nextInt();
        }while (num < 0 || num > 99);

        System.out.println(writtenNumber(num));
    }
}
