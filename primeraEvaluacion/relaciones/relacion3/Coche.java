package primeraEvaluacion.relaciones.relacion3;

public class Coche {
    private enum Color {ROJO, AZUL, NEGRO, BLANCO, GRIS}
    private enum Tipo {DIESEL, GASOLINA, HIBRIDO, ELECTRICO}

    private String matricula;
    private String marca;
    private String modelo;
    private Color color;
    private int potencia;
    private Tipo tipo;
    private int year;
    private int consumo;
    private int km;
    private int velocidades;
    private int marcha;
    private boolean arrancado;

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche(String matricula, String marca, String modelo, Color color, Tipo tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
    }

    public void parar(){
        if (!arrancado)
            System.out.println("El coche ya esta parado");
        else
            this.arrancado = false;
    }

    public void arrancar(){
        if (arrancado)
            System.out.println("El coche ya esta arrancado");
        else
            this.arrancado = true;
    }

    public void aumentarMarcha(){
        if (marcha == velocidades)
            System.out.println("Ya estas en la maxima marcha");
        else
            marcha++;
    }

    public void disminuirMarcha(){
        if (marcha == -1)
            System.out.println("Ya estas en la minima marcha");
        else
            marcha--;
    }

    public void marchaAtras(){
        if (marcha != 0)
            System.out.println("Debes estar en punto muerto para pasar a marcha atras");
        else
            marcha--;
    }

    public void quitarMarchaAtras(){
        if (marcha != -1)
            System.out.println("No estas en marcha atras");
        else
            marcha++;
    }

    public boolean getEstado() {
        return arrancado;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
