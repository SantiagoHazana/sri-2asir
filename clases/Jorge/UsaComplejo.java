package clases.Jorge;

public class UsaComplejo {

    public static void main(String[] args) {

        Complejo num1 = new Complejo(4.2f, -6.9f);
        Complejo num2 = new Complejo();
        Complejo num3 = new Complejo(-3.5f, 3.2f);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // Probamos la suma num1 + num2
        System.out.println("El resultado de la suma de num1 y num 3 es: " + num1.suma(num3));

        // Probamos la resta num3 - num2
        Complejo resta = num3.resta(num2);
        System.out.println("El resultado de la resta de num3 y num2 es: " + resta);

    }

}
