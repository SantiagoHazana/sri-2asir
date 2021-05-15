package clases.Jorge;

public class Circulo extends Figura {

    private float radio;
    // privado, solo se tiene acceso a la variable dentro de la misma clase, para acceder desde fuera, se utilizan metodos
    private float perimetro;

    // atributos de ejemplo, no se utilizan
    // protected, hace publico el atributo para los del mismo paquete, misma "grupo/carpeta"
    protected int algo;
    // public, tiene acceso completo todo el mundo desde cualquier lado
    public int algo2;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if (radio <= 0)
            this.radio = 1;
        else
            this.radio = radio;
    }

    public void calcularArea(){
        setArea(Math.PI*radio*radio);
    }

    public void calcularPerimetro(){
        perimetro = (float) (2 * Math.PI * radio);
    }

    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", perimetro=" + perimetro +
                ", color='" + getColor() + '\'' +
                ", area=" + getArea() +
                '}';
    }
}
