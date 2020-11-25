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
        this.potencia = (int) (Math.random()*50+10); // potencia aleatoria entre 10 - 60, multiplicas por tu maximo menos el minimo y luego le sumas el minimo
        this.tiempo = (int) (Math.random()*100+30); // tiempo aleatorio entre 30 - 130
    }

    public Bombilla(String sitio, boolean estado, int potencia, int tiempo){
        this.sitio=sitio;
        this.estado=estado;
        this.potencia=potencia;
        this.tiempo=tiempo;
    }

    public float coste(){
        float consumo = (float) (0.2 * tiempo * potencia / 1000);
        return consumo;
    }

    public String toString(){
        return String.format("Bombilla[Lugar: %s, Encendida: %s, Potencia: %d w, Tiempo: %d horas", sitio, estado ? "ON":"OFF", potencia, tiempo);
    }

    // getters

    //getter de sitio
    public String getSitio(){
        return sitio;
    }

    //getter de estado
    public boolean getEstado(){
        return estado;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getTiempo() {
        return tiempo;
    }

//setters

    //setter de sitio
    public void setSitio(String sitio){
        this.sitio = sitio;
    }

    //setter de estado
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
