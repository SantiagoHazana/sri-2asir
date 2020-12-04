package primeraEvaluacion.relaciones.relacionHerencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private static int contadorPersonas=0; // atributo de clase, lo comparten todas las clases

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        contadorPersonas++;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        contadorPersonas++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return String.format("Persona [Nombre: %10s, Apellido: %10s, Edad: %3d, Contador: %d]", nombre, apellido, edad, contadorPersonas);
    }

    public static int getCountPersonas(){
        return contadorPersonas;
    }
}
