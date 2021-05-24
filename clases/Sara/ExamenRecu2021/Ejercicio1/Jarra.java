package clases.Sara.ExamenRecu2021.Ejercicio1;

public class Jarra {

    private final int capacidad;
    private int contenido;

    public Jarra(int capacidad) {
        this.capacidad = capacidad;
        this.contenido = 0;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public void llena() {
        contenido = capacidad;
    }

    public void vacia(){
        contenido = 0;
    }

    public void llenarDesde(Jarra other){
        if (contenido + other.getContenido() <= capacidad){
            contenido += other.getContenido();
            other.vacia();
        }else{
            other.setContenido(other.getContenido()-(capacidad-contenido));
            llena();
        }
    }

    @Override
    public String toString() {
        return "Jarra{" +
                "capacidad=" + capacidad +
                ", contenido=" + contenido +
                '}';
    }
}
