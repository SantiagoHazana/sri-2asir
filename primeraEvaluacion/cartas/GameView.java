package primeraEvaluacion.cartas;

import javax.swing.*;

public class GameView extends JFrame {
    JPanel panel1;
    private JPanel dealerPanel;
    private JPanel playerPanel;
    private JButton button1;
    private JButton buttonGivePlayerCard;
    private JLabel playerPointsLabel;
    Baraja baraja;
    Player jugador;
    Dealer dealer;

    public GameView(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
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

    private void startGame() {
        baraja = new Baraja(false);
        jugador = new Player();
        dealer = new Dealer();
        baraja.shuffle();

        jugador.getCarta(baraja.giveCard());
        jugador.getCarta(baraja.giveCard());

        dealer.getCarta(baraja.giveCard());
        dealer.getCarta(baraja.giveCard());

    }

    public void renderCard(String imageUrl, boolean renderPlayerCard){
        JLabel card = new JLabel("");
        card.setIcon(new ImageIcon(imageUrl));
        if (renderPlayerCard){
            playerPanel.add(card);
            playerPanel.revalidate();
            playerPanel.repaint();
        }else{
            dealerPanel.add(card);
            dealerPanel.revalidate();
            dealerPanel.repaint();
        }
    }

    public void giveCardToPlayer(){
        Carta carta = baraja.giveCard();
        renderCard(carta.getImagenURL(), true);
        jugador.getCarta(carta);
        updatePoints();
        if (jugador.calculateHandPoints()>21){
            jugador.lose();
        }

    }

    public void giveCardToDealer() throws InterruptedException {
        Carta carta = baraja.giveCard();
        renderCard(carta.getImagenURL(), false);
        dealer.getCarta(carta);
        updatePoints();
        Thread.sleep(2000);
        checkHandEnd();
    }

    private void updatePoints() {
        playerPointsLabel.setText("Puntos: " + jugador.calculateHandPoints());
        // actualizar puntos dealer
    }

    public int checkHandEnd() throws InterruptedException {
        while(dealer.calculateHandPoints() < jugador.calculateHandPoints()) {
            if (dealer.calculateHandPoints() < 16) {
                giveCardToDealer();
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

    public static void main(String[] args) {
        GameView game = new GameView("Black Jack");
        game.setVisible(true);
    }
}
