package primeraEvaluacion.cartas;

import java.util.ArrayList;

public class Game {
    Baraja baraja;
    ArrayList<Carta> manoDealer;
    Player jugador;

    public Game(){
        baraja = new Baraja(false);
        manoDealer = new ArrayList<>();
        jugador = new Player(1);
        startGame();
    }

    private void startGame() {
        baraja.shuffle();

        jugador.getCarta(baraja.giveCard());
        jugador.getCarta(baraja.giveCard());

        manoDealer.add(baraja.giveCard());
        manoDealer.add(baraja.giveCard());



    }

    public void giveCardToPlayer(){
        jugador.getCarta(baraja.giveCard());
        if (jugador.calculateHandPoints()>21)
            jugador.lose();
    }
    private void giveCardToDealer(){
        manoDealer.add(baraja.giveCard());
    }

    public void restart(){
        baraja = new Baraja(false);
        jugador.win(300);
    }

}
