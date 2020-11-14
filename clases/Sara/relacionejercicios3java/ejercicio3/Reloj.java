public class Reloj {
    int modo;
    int hora;
    int minutos;
    int segundos;

    // contructor con todos los argumentos
    Reloj(int modo, int h, int m, int s) {
        this.hora = h % 24;
        this.minutos = m % 60;
        this.segundos = s % 60;
        this.modo = 24; // por defecto 24h
    }

    // metodo para poner la hora y el modo
    public void ponerEnHora(int md, int hh, int mm, int ss) {
        modo = md;
        hora = hh % 24;
        minutos = mm % 60;
        segundos = ss % 60;
    }

    //metodo para avanzar el tiempo un segundo
    public void unSegundoMas() {
        segundos++;
        if (segundos == 60) { // un minuto mas
            segundos = 0; // a cero los segundos
            minutos++; // y un minuto mas
            if (minutos == 60) { // una hora mas
                minutos = 0;
                horas = (horas + 1) % 24;
            }
        }
    }

    String dameHora(){
        return hora +":"+minutos+":"+segundos;
    }

}
