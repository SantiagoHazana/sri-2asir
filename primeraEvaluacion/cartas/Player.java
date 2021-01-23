package primeraEvaluacion.cartas;
import java.util.ArrayList;

public class Player {
    ArrayList<Carta> mano;
    int fichas;
    int apuesta;
    int playerNumber;
    boolean gano;

    public Player(int playerNumber){
        mano = new ArrayList<>();
        this.fichas = 100;
        this.playerNumber = playerNumber;
    }

    public void getCarta(Carta carta){
        mano.add(carta);
    }

    public void apuesta(int num){
        if (fichas-num<0){
            System.out.println("No tienes mas fichas");
            return;
        }
        fichas -= num;
        apuesta = num;
    }

    public void win(int fichas){
        this.fichas += fichas;
        reset();
    }

    public void lose(){
        apuesta = 0;
        reset();
    }

    private void reset(){
        mano.clear();
    }

    @Override
    public String toString() {
        return String.format("Jugador%d:");
    }
}
