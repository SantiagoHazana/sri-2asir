package primeraEvaluacion.cartas;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private ArrayList<Carta> mazo;

    public Baraja(boolean espanola){
        mazo = new ArrayList<>();
        String[] palos;
        String[] valores;
        if (espanola){
            palos = new String[]{"Oros", "Copas", "Espadas", "Bastos"};
            valores = new String[]{"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Sota", "Caballo", "Rey"};
        }else{
            palos = new String[]{"Corazones", "Copas", "Espadas", "Bastos"};
            valores = new String[]{"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Sota", "Caballo", "Rey"};
        }

        for (String palo : palos) {
            for (String valor : valores) {
                mazo.add(new Carta(valor, palo));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(mazo);
    }

    public Carta giveCard(){
        if (mazo.size()>0){
            Carta carta = mazo.get(0);
            mazo.remove(0);
            return carta;
        } else {
            return null;
        }
    }

    public int deckSize(){
        return mazo.size();
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < mazo.size(); i++) {
            res.append(i+1).append(". ").append(mazo.get(i)).append("     ");
            if (i%4==0)
                res.append("\n");
        }
        return res.toString();
    }

}
