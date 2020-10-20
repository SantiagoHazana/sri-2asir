package extras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuhnTest {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Luhn luhn = new Luhn();
        String numberString = "";
        String luhnNumber = "5146713835433";

        try {
            System.out.printf("Ingrese un numero para comprobar si es un numero Luhn: ");
            numberString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.printf("El numero %s %s un numero Luhn.\n", numberString, luhn.checkNumber(numberString) ? "es":"no es");
        System.out.printf("El siguiente numero Luhn a %s es: %s\n", numberString, luhn.getNextLuhn(numberString));


    }
}
