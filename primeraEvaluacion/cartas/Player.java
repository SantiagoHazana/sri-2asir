package primeraEvaluacion.cartas;
import java.util.ArrayList;

public class Player {
    ArrayList<Carta> mano;
    int fichas;
    int apuesta;
    boolean gano;
    boolean hasAce = false;

    public Player(){
        mano = new ArrayList<>();
        this.fichas = 100;
    }

    public void getCarta(Carta carta){
        mano.add(carta);
    }

    public int calculateHandPoints() {
        int points = 0;
        for (Carta c : mano) {
            if (c.getValor()==1) {
                points+=10;
                hasAce = true;
            }
            points += c.getValor();
        }
        if (hasAce && points>21){
            points -= 10;
            hasAce = false;
        }
        return points;
    }

    public void apuesta(int num){
        if (fichas-num<0){
            System.out.println("No tienes mas fichas");
            return;
        }
        fichas -= num;
        apuesta += num;
    }

    public void win(int fichas){
        this.fichas += fichas;
        reset();
    }

    public void lose(){
        apuesta = 0;
        reset();
    }

    void reset(){
        mano.clear();
    }

    @Override
    public String toString() {
        return String.format("Jugador%d:");
    }
}
