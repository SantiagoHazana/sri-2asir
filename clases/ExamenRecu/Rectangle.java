package clases.ExamenRecu;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return width*2+height*2;
    }

    public String toString(){
        return String.format("Un rectangulo de color %s y %s, con ancho %.2f y alto %.2f", getColor(), isFilled()?"relleno":"no relleno", width, height);
    }


}
