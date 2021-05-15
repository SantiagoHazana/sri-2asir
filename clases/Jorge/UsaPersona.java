package clases.Jorge;

import java.util.ArrayList;

public class UsaPersona {

    public static void main(String[] args) {
//        Persona jorge = new Persona("Jorge", "Escobar");
////        System.out.println("La edad de jorge es " + jorge.getEdad());
//        jorge.setEdad(21);
////        System.out.println("La edad de jorge es " + jorge.getEdad());
//        System.out.println("Hola, soy " + jorge.getNombreCompleto() + " y tengo " + jorge.getEdad() + " años");
//
//        Persona santi = new Persona("Santiago", "Hazaña");
//        santi.setEdad(25);
//        System.out.println("Hola, soy " + santi.getNombreCompleto() + " y tengo " + santi.getEdad() + " años");
//
//        // Crees a tu familia (padre, madre, hermano y vos) y muestres la informacion de cada uno
//
//        System.out.println(jorge);
//        System.out.println(santi);

        Alumno jorge = new Alumno("Jorge", "Escobar", 21, 182, 69420);
//        System.out.println(jorge);
        Alumno santi = new Alumno("Santiago", "Hazaña", 666);
//        System.out.println(santi);
        Persona panqueque = new Persona("Pan", "Queque");

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(panqueque);
        personas.add(jorge);
        personas.add(santi);

        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }

    }

}
