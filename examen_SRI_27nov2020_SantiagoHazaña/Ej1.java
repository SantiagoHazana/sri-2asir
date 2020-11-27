package examen_SRI_27nov2020_SantiagoHazaña;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej1 {

    public static float convert(float temp, int mode) {
        switch (mode) {
            case 1:
                // convierto de C a F
                return temp * 9 / 5 + 32;
            case 2:
                // convierto de C a K
                return temp + 273.15f;
            case 3:
                // convierto de F a C
                return 5f / 9 * (temp - 32);
            case 4:
                // convierto de F a K
                return (temp - 273.15f) * 9 / 5 + 32;
            case 5:
                // convierto de K a C
                return temp - 273.15f;
            case 6:
                // convierto de K a F
                return 5f / 9 * (temp - 32) + 271.15f;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            int option = 0;
            boolean correct = false;

            do {
                System.out.println("\nSeleccione una opcion de conversion:");
                System.out.println("1. Convertir de C a F");
                System.out.println("2. Convertir de C a K");
                System.out.println("3. Convertir de F a C");
                System.out.println("4. Convertir de F a K");
                System.out.println("5. Convertir de K a C");
                System.out.println("6. Convertir de K a F");
                System.out.println("7. Salir");

                System.out.print("Opcion: ");
                try {
                    option = Integer.parseInt(reader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("\nIngrese un numero!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (option >= 1 && option <= 7) {
                    if (option == 7)
                        System.exit(0);
                    correct = true;
                }
            } while (!correct);

            correct = false;
            float temp = 0;
            do {
                System.out.print("\nIngrese la temperatura a convertir: ");
                try {
                    temp = Float.parseFloat(reader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("\nIngrese un numero!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                correct = true;
            } while (!correct);

            switch (option) {
                case 1:
                    System.out.printf("%3.2f ºC son %3.2f ºF", temp, convert(temp, 1));
                    break;
                case 2:
                    System.out.printf("%3.2f ºC son %3.2f ºK", temp, convert(temp, 2));
                    break;
                case 3:
                    System.out.printf("%3.2f ºF son %3.2f ºC", temp, convert(temp, 3));
                    break;
                case 4:
                    System.out.printf("%3.2f ºF son %3.2f ºK", temp, convert(temp, 4));
                    break;
                case 5:
                    System.out.printf("%3.2f ºK son %3.2f ºC", temp, convert(temp, 5));
                    break;
                case 6:
                    System.out.printf("%3.2f ºK son %3.2f ºF", temp, convert(temp, 6));
                    break;

            }
            correct = false;
            do {
                System.out.println("\n\nDesea realizar otra conversion?");
                System.out.println("1. Si");
                System.out.println("2. No");
                System.out.printf("Opcion: ");
                try {
                    option = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (option == 1 || option == 2){
                    if (option == 2)
                        System.exit(0);
                    correct = true;
                }
            }while (!correct);

        } while (true);

    }


}
