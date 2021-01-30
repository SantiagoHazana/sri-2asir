package primeraEvaluacion.cartas;


public class Game {
    Baraja baraja;
    Player jugador;
    Dealer dealer;
    boolean playing;

    public Game(){
        baraja = new Baraja(false);
        jugador = new Player();
        dealer = new Dealer();
        startGame();
    }

    private void startGame() {
        baraja = new Baraja(false);
        jugador = new Player();
        dealer = new Dealer();
        startGame();
        baraja.shuffle();

        jugador.getCarta(baraja.giveCard());
        jugador.getCarta(baraja.giveCard());

        dealer.getCarta(baraja.giveCard());
        dealer.getCarta(baraja.giveCard());

    }

    public void turn(){
        if (jugador.isPlaying()){

        }
    }

    public void giveCardToPlayer(){
        jugador.getCarta(baraja.giveCard());
        if (jugador.calculateHandPoints()>21)
            jugador.lose();
    }

    public int checkHandEnd(){
        while(dealer.calculateHandPoints() < jugador.calculateHandPoints()) {
            if (dealer.calculateHandPoints() < 16) {
                dealer.getCarta(baraja.giveCard());
            } else if (jugador.calculateHandPoints() < dealer.calculateHandPoints()) {
                dealer.getCarta(baraja.giveCard());
            } else if(jugador.calculateHandPoints() == dealer.calculateHandPoints()) {
                restart();
            }else
                dealer.calculateHandPoints();
        }

        return dealer.calculateHandPoints();
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

    }

    public int playerPoints(){
        return jugador.calculateHandPoints();
    }
    public void giveCardToDealer() {
        dealer.getCarta(baraja.giveCard());
    }
    public static void main(String[] args) {
        new Game();
    }


}
