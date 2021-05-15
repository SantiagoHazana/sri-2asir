package clases.Jorge;

public class Complejo {

    private float parteReal;
    private float parteCompleja;

    public Complejo(float parteReal, float parteCompleja) {
        this.parteReal = parteReal;
        this.parteCompleja = parteCompleja;
    }
    // Esto se llama sobre carga, donde se crean dos metodos llamados iguales pero reciben distinta cantidad de
    // parametros o la misma cantidad de parametros pero de distinto tipo
    // Por defecto nos asigna dos numeros aleatorios entre -10 y 10
    // Formula num aleatorio intervalo (a, b). [rand()*(b-a)]+a
    public Complejo(){
        this.parteReal = (float)((Math.random()*20)-10);
        this.parteCompleja = (float)((Math.random()*20)-10);
    }

    public Complejo suma(Complejo otro){
        float sumaReal = this.parteReal + otro.parteReal;
        float sumaCompleja = this.parteCompleja + otro.parteCompleja;
        Complejo resultado = new Complejo(sumaReal, sumaCompleja);
        return resultado;
    }

    public Complejo resta(Complejo otro){
        float restaReal = this.parteReal - otro.parteReal;
        float restaCompleja = this.parteCompleja - otro.parteCompleja;
        Complejo resultado = new Complejo(restaReal, restaCompleja);
        return resultado;
    }

    public String toString(){
        return String.format("(%.2f + %.2f i)", parteReal, parteCompleja);
    }

}
