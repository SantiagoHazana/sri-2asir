package clases.Sara;

import java.util.Objects;

// alt + ins, te da opciones de crear constructores, metodos, etc
public class Persona {

    // Atributos, caracteristicas del objeto que queremos representar, seran unicos por cada instancia
    private String nombre;
    private String apellido;
    private int edad;

    // Constructores, puedo tener varios (sobrecarga de metodo) para los diferentes casos en los que pueda crear una persona.
    // En este caso solo necesito nombre y apellido para crear la persona, la edad se la doy por defecto yo (aleatoria)
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = (int)(Math.random()*50+1);
    }

    // En este caso necesito nombre, apellido y edad para crear la persona
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // En este caso no necesito nada para crear la persona, pongo yo los valores por defecto
    public Persona(){
        this.nombre = "nombre";
        this.apellido = "apellido";
        this.edad = 0;
    }

    // getters, me devuelen los valores de mis atributos
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }


    // setters, me cambian el valor de mis atributos, aqui podria poner condiciones para que solo se cambie bajo ciertas condiciones
    // Por ejemplo, si el nombre no es el que pongo por defecto ("nombre"), no dejo cambiar el nombre, if(this.nombre.equals("nombre"))
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodos, acciones que puede realizar ese objeto
    public void dimeTuNombre(){
        System.out.println(nombre + " " + apellido + " y tengo " + edad);
    }

    public String toString(){
        return String.format("Persona[nombre: %s, apellido: %s, edad: %d]", nombre, apellido, edad);
    }

}
