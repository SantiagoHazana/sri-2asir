package objetos;

public class Alumno {
    String nombre;
    String apellido;
    int yearMatriculacion;
    int id;
    String grupo;

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

    public int getYearMatriculacion() {
        return yearMatriculacion;
    }

    public void setYearMatriculacion(int yearMatriculacion) {
        this.yearMatriculacion = yearMatriculacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
