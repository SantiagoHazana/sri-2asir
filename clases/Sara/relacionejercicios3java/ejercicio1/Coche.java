public class Coche{
    //Atributos de la clase coche
    String matricula; 
    String marca;
    String modelo;
    Enum color;
    Float potencia;
    String tipo;
    int año;
    Float consumo;
    int velocidades;
    int marcha;
    Boolean arrarcado;


    //Contructor por defecto
    Coche(String matricula,String marca,String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }

    Coche(String matricula,String marca,String modelo, String color,Enum tipo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.tipo=tipo;
    }

    //Metodos de la clase coche

    public Enum getTipo(){
        return tipo;
    }

    //Metodo modificador
    public void setTipo(String n){
        tipo=n;
    }

    public Boolean arrancar(){
        return arrancar;
    }

    public Boolean parar(){
        return parar;
    }
    
    //Cambiar la marcha
    public void aumentarmarcha(int marcha){
        this.marcha=marcha;
    }
    
    public void disminuirmarcha(int marcha){
        this.marcha=marcha;
    }

    public void marchaatras(int marcha){
        this.marcha=marcha;
    }

    public Boolean quitarmarcha(){
        return quitarmarcha();
    }

    public String estado(String estado){
        return estado;
    }

    //Creacion de un String
    public String toString(){
        return String.format("Coche[Matricula: %s,Marca: %s, Modelo: %s]",this.matricula,this.marca,this.modelo);
    }

}