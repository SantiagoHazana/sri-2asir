package primeraEvaluacion.examen2019.ejercicio3;

public class Bombilla {
    private String sitio;
    private boolean estado;
    private int potencia;
    private int tiempo;

    public Bombilla(String sitio, boolean estado) throws Exception {
        if (sitio.equals(""))
            throw new Exception("No se puede crear bombillas con sito vacio");
        this.sitio = sitio;
        this.estado = estado;
        this.potencia = (int)(Math.random()*50+10);
        this.tiempo = (int)(Math.random()*100+10);
    }

    public Bombilla(String sitio, boolean estado, int potencia, int tiempo) throws Exception {
        if (sitio.equals(""))
            throw new Exception("No se puede crear bombillas con sito vacio");
        this.sitio = sitio;
        this.estado = estado;
        this.potencia = potencia;
        this.tiempo = tiempo;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public float coste(){
        return (float) (0.2 * tiempo * potencia / 1000);
    }

    @Override
    public String toString() {
        return String.format("Bombilla [Lugar: %s, Estado: %s, Potencia: %dW, Tiempo: %d horas]", sitio, estado? "ON":"OFF", potencia, tiempo);
    }
}
