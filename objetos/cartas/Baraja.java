package objetos.cartas;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> mazo;

    public Baraja(){
        mazo = new ArrayList<>();
        String[] palos = { "Oros", "Copas", "Espadas", "Bastos" };
        String[] valores = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Sota", "Caballo", "Rey" };

        for (String palo : palos) {
            for (String valor : valores) {
                mazo.add(new Carta(valor, palo));
            }
        }
    }

    public String toString(){
        String res = "";
        for (Carta carta : mazo) {
            res += carta.toString() + "\n";
        }
        return res;
    }

}
