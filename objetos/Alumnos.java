package objetos;

public class Alumnos {
    public static void main(String[] args) {
        Alumno pepe = new Alumno();
        Alumno pepa = new Alumno();

        pepe.setNombre("Pepe");

        System.out.println(pepe.getNombre());
    }
}
