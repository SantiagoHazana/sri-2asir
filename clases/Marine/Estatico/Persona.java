package clases.Marine.Estatico;

public class Persona {

    private String nombre;
    private String apellido;
    public static int cuentaPersonas = 0;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        cuentaPersonas++;
    }

}
