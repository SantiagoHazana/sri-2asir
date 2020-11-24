package objetos.cartas;

import java.util.ArrayList;

public class TestBaraja {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
//        System.out.println(baraja);
        baraja.shuffle();
//        System.out.println(baraja);

        System.out.println("------------------------------Simulacion de juego las cuarenta------------------------------");

        ArrayList<Carta> player1 = new ArrayList<>(7);
        ArrayList<Carta> player2 = new ArrayList<>(7);
        ArrayList<Carta> player3 = new ArrayList<>(7);

        for (int i = 0; i < 7; i++) {
            player1.add(baraja.giveCard());
            player2.add(baraja.giveCard());
            player3.add(baraja.giveCard());
        }

        System.out.println("------------------------------Jugador 1------------------------------");
        player1.forEach(carta -> System.out.println(carta));
        System.out.println("------------------------------Jugador 2------------------------------");
        player2.forEach(carta -> System.out.println(carta));
        System.out.println("------------------------------Jugador 3------------------------------");
        player3.forEach(carta -> System.out.println(carta));
        System.out.printf("\nQuedan %d cartas\n", baraja.deckSize());

    }
}
