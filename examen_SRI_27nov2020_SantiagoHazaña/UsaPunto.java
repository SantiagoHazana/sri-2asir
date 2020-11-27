package examen_SRI_27nov2020_SantiagoHazaña;

import java.util.ArrayList;

public class UsaPunto {

    public static void main(String[] args) {
        ArrayList<Punto> puntos = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            puntos.add(new Punto());
        }

        System.out.printf("La suma del punto %s y %s es: %s\n", puntos.get(0), puntos.get(1), new Punto(puntos.get(0).getX()+puntos.get(1).getX(), puntos.get(0).getY() + puntos.get(1).getY(), "Azul"));
        System.out.printf("La distancia al origen del punto %s es: %.2f\n", puntos.get(2), puntos.get(2).distanciaOrigen());
        System.out.printf("La distancia entre el punto %s y %s es: %.2f\n", puntos.get(3), puntos.get(4), puntos.get(3).distanciaEntreDosPuntos(puntos.get(4)));
    }

}
