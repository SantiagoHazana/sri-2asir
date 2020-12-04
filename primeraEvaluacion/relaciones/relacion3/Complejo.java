package primeraEvaluacion.relaciones.relacion3;

public class Complejo {

    private float realPart;
    private float imaginaryPart;

    public Complejo() {
        this.realPart = (float) (Math.random()*5);
        this.imaginaryPart = (float) (Math.random()*5);
    }

    public Complejo(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complejo sum(Complejo complejo){
        return new Complejo(realPart+complejo.realPart, imaginaryPart+complejo.imaginaryPart);
    }

    public Complejo subs(Complejo complejo){
        return new Complejo(realPart-complejo.realPart, imaginaryPart-complejo.imaginaryPart);
    }

    public String toString(){
        return String.format("%f %s %f i", realPart, imaginaryPart<0? "-":"+", imaginaryPart);
    }

}
