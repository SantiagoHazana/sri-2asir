package primeraEvaluacion.relaciones.relacionHerencia;

public class Profesor extends Persona {

    private String dpto;
    private int nrp;

    public Profesor(String nombre, String apellido, int nrp) {
        super(nombre, apellido);
        this.nrp = nrp;
    }

    public Profesor(String nombre, String apellido, int edad, int nrp, String departamento) {
        super(nombre, apellido, edad);
        this.nrp = nrp;
        this.dpto = departamento;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public String toString(){
        return String.format("Profesor [Nombre: %10s, Apellido: %10s, Edad: %3d, NRP: %d, Departamento: %s]", getNombre(), getApellido(), getEdad(), nrp, dpto);
    }
}
