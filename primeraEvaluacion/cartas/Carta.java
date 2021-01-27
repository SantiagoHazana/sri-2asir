package primeraEvaluacion.cartas;

import java.util.Objects;

public class Carta {
    private String valor;
    private String palo;

    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor() {
        switch (valor){
            case "As":
                return 1;
            case "Dos":
                return 2;
            case "Tres":
                return 3;
            case "Cuatro":
                return 4;
            case "Cinco":
                return 5;
            case "Seis":
                return 6;
            case "Siete":
                return 7;
            case "Ocho":
                return 8;
            case "Nueve":
                return 9;
            case "Diez":
            case "Q":
            case "J":
            case "K":
                return 10;
            case "Sota":
                return 11;
            case "Caballo":
                return 12;
            case "Rey":
                return 13;
            default:
                return 0;
        }
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", valor, palo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(valor, carta.valor) &&
                Objects.equals(palo, carta.palo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, palo);
    }



}
