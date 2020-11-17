package clases.Sara.susRelaciones.relacionejercicios3java.ejercicio3;

public class Reloj {
    int hora;
    int minutos;
    int segundos;

    Reloj(){
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // contructor con todos los argumentos
    Reloj(int h, int m, int s) {
        this.hora = h % 24;
        this.minutos = m % 60;
        this.segundos = s % 60;
    }

    // metodo para poner la hora, con segundos
    public void ponerEnHora(int hh, int mm, int ss) {
        // hago los modulos para que siempre me quede dentro del rango de la hora
        hora = hh % 24; // entre 0 y 24
        minutos = mm % 60; // entre 0 y 60
        segundos = ss % 60; // entre 0 y 60
    }

    //metodo para poner la hora, sin segundos
    public void ponerEnHora(int hh, int mm){
        hora = hh % 24;
        minutos = mm % 60;
        segundos = 0;
    }

    public String dameHora(boolean formato24){
        if (formato24){
            return dameHora();
        }else{
            return "Aca Sara va a implementar la hora en formato 12 horas";
        }
    }

    public String dameHora(){
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
//        return hora +":"+minutos+":"+segundos;
    }

}
