package objetos;

public class PersonaTest {
    public static void main(String[] args) {
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

    }
}
