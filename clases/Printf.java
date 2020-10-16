package clases;

public class Printf {
    public static void main(String[] args) {
        int edad = 31;
        float altura = 1.59f; // lleva una f para especificar que es un float y no double
        double altura2 = 1.59; // esta altura no lleva f porque ya lo toma como double
        String nombre = "Marine";
        boolean aprobado = true;

        // %d entero, %f con coma. %s un String, %b boolean
        System.out.printf("Mi nombre es %s, tengo %d años y mido %5.2f metros y esta aprobada == %b en SRI", nombre, edad, altura, aprobado);
    }
}
