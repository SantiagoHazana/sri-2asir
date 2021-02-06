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
            palos = new String[]{"Corazones", "Diamantes", "Picas", "Trebol"};
            valores = new String[]{"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "J", "Q", "K"};
        }

        String[] imagenes = {
                "primeraEvaluacion/cartas/cardsImages/c01.gif",
                "primeraEvaluacion/cartas/cardsImages/c02.gif",
                "primeraEvaluacion/cartas/cardsImages/c03.gif",
                "primeraEvaluacion/cartas/cardsImages/c04.gif",
                "primeraEvaluacion/cartas/cardsImages/c05.gif",
                "primeraEvaluacion/cartas/cardsImages/c06.gif",
                "primeraEvaluacion/cartas/cardsImages/c07.gif",
                "primeraEvaluacion/cartas/cardsImages/c08.gif",
                "primeraEvaluacion/cartas/cardsImages/c09.gif",
                "primeraEvaluacion/cartas/cardsImages/c10.gif",
                "primeraEvaluacion/cartas/cardsImages/c11.gif",
                "primeraEvaluacion/cartas/cardsImages/c12.gif",
                "primeraEvaluacion/cartas/cardsImages/c13.gif",
                "primeraEvaluacion/cartas/cardsImages/d01.gif",
                "primeraEvaluacion/cartas/cardsImages/d02.gif",
                "primeraEvaluacion/cartas/cardsImages/d03.gif",
                "primeraEvaluacion/cartas/cardsImages/d04.gif",
                "primeraEvaluacion/cartas/cardsImages/d05.gif",
                "primeraEvaluacion/cartas/cardsImages/d06.gif",
                "primeraEvaluacion/cartas/cardsImages/d07.gif",
                "primeraEvaluacion/cartas/cardsImages/d08.gif",
                "primeraEvaluacion/cartas/cardsImages/d09.gif",
                "primeraEvaluacion/cartas/cardsImages/d10.gif",
                "primeraEvaluacion/cartas/cardsImages/d11.gif",
                "primeraEvaluacion/cartas/cardsImages/d12.gif",
                "primeraEvaluacion/cartas/cardsImages/d13.gif",
                "primeraEvaluacion/cartas/cardsImages/p01.gif",
                "primeraEvaluacion/cartas/cardsImages/p02.gif",
                "primeraEvaluacion/cartas/cardsImages/p03.gif",
                "primeraEvaluacion/cartas/cardsImages/p04.gif",
                "primeraEvaluacion/cartas/cardsImages/p05.gif",
                "primeraEvaluacion/cartas/cardsImages/p06.gif",
                "primeraEvaluacion/cartas/cardsImages/p07.gif",
                "primeraEvaluacion/cartas/cardsImages/p08.gif",
                "primeraEvaluacion/cartas/cardsImages/p09.gif",
                "primeraEvaluacion/cartas/cardsImages/p10.gif",
                "primeraEvaluacion/cartas/cardsImages/p11.gif",
                "primeraEvaluacion/cartas/cardsImages/p12.gif",
                "primeraEvaluacion/cartas/cardsImages/p13.gif",
                "primeraEvaluacion/cartas/cardsImages/t01.gif",
                "primeraEvaluacion/cartas/cardsImages/t02.gif",
                "primeraEvaluacion/cartas/cardsImages/t03.gif",
                "primeraEvaluacion/cartas/cardsImages/t04.gif",
                "primeraEvaluacion/cartas/cardsImages/t05.gif",
                "primeraEvaluacion/cartas/cardsImages/t06.gif",
                "primeraEvaluacion/cartas/cardsImages/t07.gif",
                "primeraEvaluacion/cartas/cardsImages/t08.gif",
                "primeraEvaluacion/cartas/cardsImages/t09.gif",
                "primeraEvaluacion/cartas/cardsImages/t10.gif",
                "primeraEvaluacion/cartas/cardsImages/t11.gif",
                "primeraEvaluacion/cartas/cardsImages/t12.gif",
                "primeraEvaluacion/cartas/cardsImages/t13.gif",
        };
        int contCarta = 0;
        for (String palo : palos) {
            for (String valor : valores) {
                mazo.add(new Carta(valor, palo, imagenes[contCarta]));
                contCarta++;
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

//    public int deckSize(){
//        return mazo.size();
//    }
//
//    public String toString(){
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < mazo.size(); i++) {
//            res.append(i+1).append(". ").append(mazo.get(i)).append("     ");
//            if (i%4==0)
//                res.append("\n");
//        }
//        return res.toString();
//    }

}
