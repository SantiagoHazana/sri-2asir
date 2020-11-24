package relaciones.relacionHerencia;

public class Alumno extends Persona {
    int id;
    String curso;

    public Alumno(String nombre, String apellido, int id) {
        super(nombre, apellido);
        this.id = id;
    }

    public Alumno(String nombre, String apellido, int edad, int id) {
        super(nombre, apellido, edad);
        this.id = id;
    }

    public Alumno(String nombre, String apellido, int edad, int id, String curso){
        super(nombre, apellido, edad);
        this.id = id;
        this.curso = curso;
    }

    public Alumno(String nombre, String apellido, int id, String curso){
        super(nombre, apellido);
        this.id = id;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString(){
        return String.format("Alumno [Nombre: %10s, Apellido: %10s, Edad: %3d, Id: %d, Curso: %s]", getNombre(), getApellido(), getEdad(), id, curso);
    }
}
