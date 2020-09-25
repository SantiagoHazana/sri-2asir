package intro.askingData;

import java.util.Scanner;

public class AskData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio;
        double height;
        double area;

        System.out.println("Introducir datos del cilindro: ");
        System.out.print("Radio: ");
        radio = scanner.nextDouble();
        System.out.print("Altura: ");
        height = scanner.nextDouble();
        area = Math.PI * radio * height;
        System.out.println("El area es " + area);
    }

}
