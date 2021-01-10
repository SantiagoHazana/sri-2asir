package clases.Sara;

public class Alumno extends Persona {

    int matricula;

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        matricula = (int) (Math.random()*1000000+1);
    }

    @Override
    public String toString() {
        return String.format("Alumno[nombre: %s, apellido: %s, edad: %d, Matricula: %d]", getNombre(), getApellido(), getEdad(), matricula);
    }
}
