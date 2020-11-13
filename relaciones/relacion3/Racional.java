package relaciones.relacion3;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional(){
        numerador = 0;
        denominador = 0;
    }

    public Racional(int numerador, int denominador) {
        int divisor = mcdEuclidesIterative(numerador, denominador);
        this.numerador = numerador/divisor;
        this.denominador = denominador/divisor;
    }

    public String toString(){
        return String.format(" %d / %d", numerador, denominador);
    }

    public float toFloat(int num){
        return (float)numerador/denominador;
    }

    public Racional sum(Racional racional){
        int newDenom = this.denominador * racional.denominador;
        int newNumer = (this.numerador * racional.denominador) + (racional.numerador * this.denominador);
        return new Racional(newNumer, newDenom);
    }

    public Racional res(Racional racional){
        int newDenom = this.denominador * racional.denominador;
        int newNumer = (this.numerador * racional.denominador) - (racional.numerador * this.denominador);
        return new Racional(newNumer, newDenom);
    }

    public Racional multi(Racional racional){
        return new Racional(this.numerador*racional.numerador, this.denominador*racional.denominador);
    }

    public Racional div(Racional racional){
        return new Racional(this.numerador*racional.denominador, this.denominador*racional.numerador);
    }

    private int mcdEuclidesIterative(int numerador, int denominador){
        int r;
        while (denominador != 0){
            r = denominador;
            denominador = numerador%denominador;
            numerador = r;
        }
        return numerador;
    }
}
