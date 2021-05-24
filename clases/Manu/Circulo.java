package clases.Manu;

public class Circulo extends Figura {

    private double radio;
    private double perimetro;
    private double area;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
        calcularPerimetro();
        calcularArea();
    }

    public Circulo(){
        super();
        radio = 1;
        calcularPerimetro();
        calcularArea();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio <=0)
            this.radio = 1;
        else
            this.radio = radio;

        calcularPerimetro();
        calcularArea();
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    private void calcularArea(){
        this.area = Math.PI * radio * radio;
    }

    private void calcularPerimetro(){
        this.perimetro = 2 * Math.PI * radio;
    }

    public String toString() {
        return "Circulo{" +
                "color=" + getColor() +
                ", radio=" + radio +
                ", perimetro=" + perimetro +
                ", area=" + area +
                '}';
    }
}
