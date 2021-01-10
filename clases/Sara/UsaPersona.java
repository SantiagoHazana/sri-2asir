package clases.Sara;

import java.util.ArrayList;

public class UsaPersona {

    public static void main(String[] args) {
//        Persona sara = new Persona("Sara", "Aguilera", 26);
//        sara.dimeTuNombre();
//
//        Persona lucia = new Persona();
//        lucia.setNombre("Lucia");
//        lucia.setApellido("Montes");
//        lucia.setEdad(35);
//        lucia.dimeTuNombre();
//
//        System.out.println(sara);
//
//        System.out.println("El nombre de esta persona es: " + sara.getNombre());

        String[] nombres = {"Sara", "Marina", "Carlos", "Oscar", "Santiago", "Pedro"};
        String[] apellidos = {"Aguilera", "Moreno", "Perez", "Montes"};

        ArrayList<Persona> personas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String nomb = nombres[(int) (Math.random()*nombres.length)];
            String apell = apellidos[(int) (Math.random()*apellidos.length)];
            Persona p = new Persona(nomb, apell);
            personas.add(p);
        }

        for (Persona p :
                personas) {
            System.out.println(p);
        }

//        ArrayList<Persona> personas = new ArrayList<>();
//        Alumno al = new Alumno("Pepe", "Perez", 10);
//        Persona sara = new Persona("Sara", "Aguilera");
//        personas.add(al);
//        personas.add(sara);

    }

}
