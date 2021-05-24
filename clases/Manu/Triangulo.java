package clases.Manu;

public class Triangulo extends Figura {

    double altura;
    double base;
    double area;

    public Triangulo(){
        super();
        altura = 5;
        base = 3;
        calcularArea();
    }

    public Triangulo (double altura, double base, String color){
        super(color);
        this.altura = altura;
        this.base = base;
        calcularArea();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calcularArea();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
        calcularArea();
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calcularArea(){
        this.area = (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "color=" + getColor() +
                ", altura=" + altura +
                ", base=" + base +
                ", area=" + area +
                '}';
    }
}
