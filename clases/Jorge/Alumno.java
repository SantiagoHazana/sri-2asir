package clases.Jorge;

public class Alumno extends Persona {

    int matricula;

    public Alumno(String nombre, String apellido, int matricula){
        super(nombre, apellido);
        this.matricula = matricula;
    }

    public Alumno(String nombre, String apellido, int edad, float altura, int matricula) {
        super(nombre, apellido, edad, altura);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alumno[" +
                " matricula = " + matricula +
                ", nombre = '" + nombre + '\'' +
                ", apellido = '" + apellido + '\'' +
                ", edad = " + edad +
                ", altura = " + altura +
                ']';
    }

}
