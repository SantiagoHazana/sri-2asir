package clases.Jorge;

public class Figura {

    private String color;
    private double area;

    public Figura(String color) {
        this.color = color;
        this.area = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString() {
        return "Figura{" + "color='" + color + '\'' + ", area=" + area + '}';
    }
}
