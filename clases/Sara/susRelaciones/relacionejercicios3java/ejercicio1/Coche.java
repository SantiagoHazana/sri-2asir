package clases.Sara.susRelaciones.relacionejercicios3java.ejercicio1;

public class Coche{

    public static int contadorCoches=0;

    public enum MiColor {ROJO, VERDE, AZUL, BLANCO, NEGRO};

    //Atributos de la clase coche
    String matricula; 
    String marca;
    String modelo;
    MiColor miColor;
    float potencia;
    String tipo;
    int año;
    float consumo;
    int velocidades;
    int marcha;
    boolean arrarcado;


    //Contructor por defecto
    Coche(String matricula, String marca, String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }

    Coche(String matricula, String marca, String modelo, MiColor miColor, String tipo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.miColor = miColor;
        this.tipo=tipo;
    }

    //Metodos de la clase coche

    public String getTipo(){
        return tipo;
    }

    //Metodo modificador
    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public void arrancar(){
        if (!this.arrarcado)
            System.out.println("Ya esta arrancado");
        else
            this.arrarcado = true;
    }

    public void parar(){
        this.arrarcado = false;
    }
    
    //Cambiar la marcha
    public void aumentarMarcha(){
        if (this.marcha < 6)
            this.marcha++;
        else
            System.out.println("Ya estoy en 6ta");
    }
    
    public void disminuirMarcha(){
        this.marcha--;
    }

    public void marchaAtras(){
        this.marcha=-1;
    }

    public void quitarMarcha(){
        this.marcha=0;
    }

    public boolean estado(){
        return arrarcado;
    }

    //Creacion de un String
    public String toString(){
        return String.format("Coche[Matricula: %s, Marca: %s, Modelo: %s, Color: %s]",this.matricula,this.marca,this.modelo, this.miColor);
    }

}