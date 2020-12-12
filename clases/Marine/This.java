package clases.Marine;

public class This {
    private String nombre;
    private int num;

    public This(String nombre) {
        this.nombre = nombre;
        num = 5; // no hace falta this, porque no hay otro parametro o variable con el mismo nombre que mi atributo.
    }

    public void mostrar(String nombre){
        System.out.println(nombre);
        System.out.println(this.nombre);
    }
}
