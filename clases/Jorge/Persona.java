package clases.Jorge;

public class Persona {

    // Atributos, definen caracteristicas de nuestra clase. Van al principio de la clase
    String nombre;
    String apellido;
    int edad;
    float altura;

    // Constructor, se encarga de inicializar nuestra clase/objeto
    public Persona(String nombre, String apellido){
        this.nombre = nombre; // la palabra reservada 'this' hace referencia a los atributos de la clase
        this.apellido = apellido;
        this.edad = -1;
        this.altura = 0;
    }

    // Esto se llama sobrecarga, dos metodos llamados iguales pero reciben distinta cantidad de atributos
    public Persona(String nombre, String apellido, int edad, float altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }

    // Metodos de la clase. Son los que tiene las acciones que puedo hacer

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }

    public String toString(){
        return "Persona[nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + "]";
    }

}
