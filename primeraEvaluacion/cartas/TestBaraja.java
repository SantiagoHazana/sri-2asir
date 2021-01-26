package primeraEvaluacion.cartas;

import java.util.ArrayList;

public class TestBaraja { // el controlador
    public static void main(String[] args) {
        Baraja baraja = new Baraja(true);
        ArrayList<Carta> manoDealer = new ArrayList<>();
//        System.out.println(baraja);
        baraja.shuffle();
//        System.out.println(baraja);
        ArrayList<Player> jugadores = new ArrayList<>();


//        System.out.println("------------------------------Simulacion de juego las cuarenta------------------------------");

        System.out.println("Cuantos jugadores?");

        int numJug = 3;

        for (int i = 0; i < numJug; i++) {
            jugadores.add(new Player(i+1));
        }

        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).getCarta(baraja.giveCard());
            jugadores.get(i).getCarta(baraja.giveCard());
        }

        manoDealer.add(baraja.giveCard());
        manoDealer.add(baraja.giveCard());

        System.out.println(baraja);

        // Termina la mano
//        for (Player p : jugadores) {
//            if (p.gano) {
//                p.win(30);
//            } else {
//                p.lose();
//            }
//        }

//        System.out.println("------------------------------Jugador 1------------------------------");
//        player1.forEach(carta -> System.out.println(carta));
//        System.out.println("------------------------------Jugador 2------------------------------");
//        player2.forEach(carta -> System.out.println(carta));
//        System.out.println("------------------------------Jugador 3------------------------------");
//        player3.forEach(carta -> System.out.println(carta));
//        System.out.printf("\nQuedan %d cartas\n", baraja.deckSize());

    }
}
