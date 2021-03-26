package clases.Jorge;

public class UsaPersona {

    public static void main(String[] args) {
        Persona jorge = new Persona("Jorge", "Escobar");
//        System.out.println("La edad de jorge es " + jorge.getEdad());
        jorge.setEdad(21);
//        System.out.println("La edad de jorge es " + jorge.getEdad());
        System.out.println("Hola, soy " + jorge.getNombreCompleto() + " y tengo " + jorge.getEdad() + " años");

        Persona santi = new Persona("Santiago", "Hazaña");
        santi.setEdad(25);
        System.out.println("Hola, soy " + santi.getNombreCompleto() + " y tengo " + santi.getEdad() + " años");

        // Crees a tu familia (padre, madre, hermano y vos) y muestres la informacion de cada uno


    }

}
