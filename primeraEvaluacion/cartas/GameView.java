package primeraEvaluacion.cartas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameView extends JFrame {
    Game game;
    JPanel panel1;
    private JButton buttonGivePlayerCard;
    private JLabel playerPointsLabel;

    public GameView(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 300, 500, 300);
        game = new Game();
        playerPointsLabel.setText("Puntos: " + game.playerPoints());
        buttonGivePlayerCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.giveCardToPlayer();
                playerPointsLabel.setText("Puntos: " + game.playerPoints());
            }
        });
    }

    public static void main(String[] args) {
        GameView game = new GameView("Black Jack");
        game.setVisible(true);
    }
}
