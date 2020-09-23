package intro;

public class Persona {

    private String nombre;
    public String apellidos;
    private int edad;

    public String dimeTuNombre() {
        return nombre + " " + apellidos;
    }

    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public int getEdad() {
        return edad;
    }
}
