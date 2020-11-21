package objetos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PersonaTest {
    public static void main(String[] args) {
        /*
        System.out.printf("El numero de Personas creadas es: %d\n", Persona.getCountPersonas());
        Persona santiago = new Persona("Santiago", "Hazaña", 25);
        Persona marine = new Persona("Marina", "Moreno");
        marine.setEdad(31);

        System.out.println(santiago.toString());
        System.out.println(marine); // cohercion implicita, queriendo imprimir el objeto llama implicitamente a toString()

        Persona sara = new Persona("Sara", "Aguilera");
        System.out.println(sara);
        System.out.println(santiago);

        System.out.println("\n------Cominezo de uso de Alumno------\n");

        Alumno santi = new Alumno("Santiago", "Hazaña", 25, 123, "2ASIR");
        System.out.println(santi);

        System.out.println("\n------Flipando con el polimorfismo------\n");
        Persona unaPersona = new Alumno("Pepe", "Pepon", 22); // esto lo puedo hacer porque un alumno es una persona

        // Alumno alu = new Persona("Pepe", "Pepon", 24); esto no se puede porque una persona no es alumno
        //Esto lo podemos verificar con instanceOf
        Alumno alu = null;
        if (alu instanceof Persona){
            alu = (Alumno) new Persona("Pepe", "Pepon", 24);
            System.out.println(alu);
        }else {
            System.out.println("No se puede crear un alumno como persona");
        }

        System.out.println("\n------Comienzo de uso de Profesor------\n");
        Profesor paco = new Profesor("Paco", "P", 123, "Info");
        Profesor rosalia = new Profesor("Rosalia", "Guerrero", 124, "Info");
        System.out.println(paco);
        System.out.println(rosalia);

        System.out.println("\n---------------Array de Personas----------------\n");

        Persona[] clase2Asir = new Persona[6];

        clase2Asir[0] = paco; // profesor
        clase2Asir[1] = santi; // alumno
        clase2Asir[2] = marine; // persona
        clase2Asir[3] = santiago; // persona
        clase2Asir[4] = rosalia; // profesor
        clase2Asir[5] = sara; // persona

        //Hecho con for
        for (int i = 0; i < clase2Asir.length; i++) {
            System.out.println(clase2Asir[i]);
        }

        // Hecho con foreach
        for (Persona persona:clase2Asir) {
            System.out.println(persona);
        }
        */

        String[] nombres = { "Santiago", "Carlos", "Maria", "Sara", "Manuel", "Jorge", "Marina", "Pedro", "Araceli" };
        String[] apellidos = { "Hazaña", "Perez", "Fernandez", "Moreno", "Aguilera", "Sanchez", "Perez" };
        String[] cursos = { "1ASIR", "2ASIR", "1ESO", "2ESO", "3ESO", "4ESO" };
        String[] departamentos = { "Informatica", "Matematicas", "Economia", "Lengua", "Ingles" };

        ArrayList<Persona> personal = new ArrayList<Persona>(50);

        Random random = new Random();

        // Cargamos aleatoriamente 50-100 personas
        for (int i = 0; i < random.nextInt(51)+50; i++) {
            int tipo = random.nextInt(3);
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            int edad = random.nextInt(54)+12;

            switch (tipo){
                case 0:
                    personal.add(new Persona(nombre, apellido, edad));
                    break;
                case 1:
                    personal.add(new Profesor(nombre, apellido, edad, random.nextInt(10000)+1000, departamentos[random.nextInt(departamentos.length)]));
                    break;
                default:
                    personal.add(new Alumno(nombre, apellido, edad, random.nextInt(10000)+1000, cursos[random.nextInt(cursos.length)]));
                    break;
            }
        }

        // Sacar total de personas, total de alumnos y total de profesores
        int totalAlumnos = 0;
        int totalProfesores = 0;
        int totalPersonas = 0;
        Persona masViejo = personal.get(0);
        Persona masJoven = personal.get(0);

        for (Persona p : personal) {
//            System.out.println(p);

            if (p.getEdad()>masViejo.getEdad())
                masViejo = p;
            if (p.getEdad()<masJoven.getEdad())
                masJoven = p;

            // pregunto si la persona que lei del arraylist (p) es una instancia de alumno, pregunto si es un alumno
            if (p instanceof Alumno){
                totalAlumnos++;
                // Sacar solo los alumnos que cursen 1 o 2 de asir
                Alumno al = (Alumno) p; // variable momentanea porque Persona no tiene curso, entonces hago cast de p para convertirlo en alumno
                if (al.getCurso().equals("1ASIR") || al.getCurso().equals("2ASIR") )
                    System.out.println(al);
            }

            else if (p instanceof Profesor){
                totalProfesores++;
                // Mostrar los profesores de informatica
                Profesor profesor = (Profesor) p;
                if (profesor.getDpto().equals("Informatica"))
                    System.out.println(profesor);
            }
            else
                totalPersonas++;
        }

        System.out.printf("En total hay %d, de los cuales hay %d Alumnos, %d Profesores, %d Personas\n", personal.size(), totalAlumnos, totalProfesores, totalPersonas);
        System.out.printf("Mas viejo: %s\n", masViejo);
        System.out.printf("Mas joven: %s\n", masJoven);

    }
}
