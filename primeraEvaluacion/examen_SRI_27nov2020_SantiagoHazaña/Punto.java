package primeraEvaluacion.examen_SRI_27nov2020_SantiagoHazaña;

public class Punto {

    private double x;
    private double y;
    private String color;

    public Punto() {
        this.x = Math.random()*200-100;
        this.y = Math.random()*200-100;
        this.color = "Negro";
    }

    public Punto(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mover(float x, float y){
        this.x += x;
        this.y += y;
    }

    public double distanciaOrigen(){
        return Math.sqrt(x*x + y*y);
    }

    public double distanciaEntreDosPuntos(Punto p){
        return Math.sqrt(Math.pow(p.x - this.x ,2) + Math.pow(p.y - this.y ,2));
    }

    public String toString(){
        return String.format("(%.1f, %.1f)", this.x, this.y);
    }

}
