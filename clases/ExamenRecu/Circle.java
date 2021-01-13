package clases.ExamenRecu;

public class Circle extends Shape{

    private double radius;

    public Circle(){
        super();
        radius = 1;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimetro(){
        return 2 * radius * Math.PI;
    }

    public String toString(){
        return String.format("Un circulo de color %s, %s y radio %f", getColor(), isFilled()?"relleno":"no relleno", radius);
    }
}
