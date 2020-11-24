package clases.Sara.examen2019;

public class Bombilla {

    //Atributos de la clase bombilla 
    String sitio;
    boolean estado;
    int potencia;
    int tiempo; 

    //contructores de la clase bombilla 


    public Bombilla(String sitio, boolean estado) {
        this.sitio = sitio;
        this.estado = estado;
        this.potencia = 0;
        this.tiempo = 0;
    }

    public Bombilla(String sitio, boolean estado, int potencia, int tiempo){
        this.sitio=sitio;
        this.estado=estado;
        this.potencia=potencia;
        this.tiempo=tiempo;
    }

//    //metodo de la clase bombilla
//    public static boolean estado(){
//
//    }



}
