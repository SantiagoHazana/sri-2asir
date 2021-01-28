package primeraEvaluacion.cartas;


public class Game {
    Baraja baraja;
    Player jugador;
    Dealer dealer;

    public Game(){
        baraja = new Baraja(false);
        jugador = new Player();
        dealer = new Dealer();
        startGame();
    }

    private void startGame() {
        baraja.shuffle();

        jugador.getCarta(baraja.giveCard());
        jugador.getCarta(baraja.giveCard());

        dealer.getCarta(baraja.giveCard());
        dealer.getCarta(baraja.giveCard());

    }

    public void giveCardToPlayer(){
        jugador.getCarta(baraja.giveCard());
        if (jugador.calculateHandPoints()>21)
            jugador.lose();
    }

    public void restart(){
        baraja = new Baraja(false);
        // opciones de ganar
        if (jugador.calculateHandPoints()==21){
            jugador.win((int) (jugador.apuesta + (jugador.apuesta)*1.5));
            dealer.reset();
        }else if (jugador.calculateHandPoints()>21){
            jugador.lose();
            dealer.reset();
        }else if (jugador.calculateHandPoints() == dealer.calculateHandPoints()){
            jugador.win(jugador.apuesta);
            dealer.reset();
        }else{
            jugador.win(jugador.apuesta*2);
            dealer.reset();
        }
        startGame();
    }

    public int playerPoints(){
        return jugador.calculateHandPoints();
    }

    public static void main(String[] args) {
        new Game();
    }

}
