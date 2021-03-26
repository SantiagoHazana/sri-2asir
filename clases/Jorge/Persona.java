package clases.Jorge;

public class Persona {

    // Atributos, definen caracteristicas de nuestra clase. Van al principio de la clase
    String nombre;
    String apellido;
    int edad;
    float altura;

    // Constructor, se encarga de inicializar nuestra clase/objecto
    public Persona(String nombre, String apellido){
        this.nombre = nombre; // la palabra reservada 'this' hace referencia a los atributos de la clase
        this.apellido = apellido;
        this.edad = 0;
        this.altura = 0;
    }

    // Metodos de la clase. Son los que tiene las acciones que puedo hacer

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }

    // crear los metodos para cambiar (setEdad) y pedir la altura (getAltura)

}
