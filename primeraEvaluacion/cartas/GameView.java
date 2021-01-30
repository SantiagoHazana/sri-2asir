package primeraEvaluacion.cartas;

import javax.swing.*;

public class GameView extends JFrame {
    JPanel panel1;
    private JButton buttonGivePlayerCard;
    private JLabel playerPointsLabel;
    private JLabel carta;
    Baraja baraja;
    Player jugador;
    Dealer dealer;

    public GameView(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 300, 900, 600);
        startGame();

        playerPointsLabel.setText("Puntos: " + jugador.calculateHandPoints());
        buttonGivePlayerCard.addActionListener(e -> {
            if (jugador.isPlaying()){
                giveCardToPlayer();
                if (jugador.calculateHandPoints()>21){
                    buttonGivePlayerCard.setEnabled(false);
                    jugador.playing = false;
                }

                playerPointsLabel.setText("Puntos: " + jugador.calculateHandPoints());
            }
        });
    }

    public void renderCards(){
//        panel1.removeAll(); // sacar todas las cartas y volver a renderizarlas
        for (Carta c : jugador.getMano()) {
            // JLabel newCard = new JLabel("");
            carta.setText("");
            carta.setIcon(new ImageIcon(c.getImagenURL()));
        }
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
    public void giveCardToDealer() {
        dealer.getCarta(baraja.giveCard());
    }

    public static void main(String[] args) {
        GameView game = new GameView("Black Jack");
        game.setVisible(true);
    }
}
