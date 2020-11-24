package examen2019.ejercicio3;

import java.util.ArrayList;

public class Casa {

    ArrayList<Bombilla> bombillas = new ArrayList<>(10);

    public Casa() throws Exception {
        String[] lugares={"Salón","Cocina","Baño","Dormitorio 1","Dormitorio 2","Dormitorio 3","Entrada","Balcón"};

        for (int i = 0; i < 10; i++) {
            int state = (int)(Math.random()*2);
            bombillas.add(new Bombilla(lugares[(int)(Math.random()*lugares.length)], state==0));
        }

    }

    public float consumoTotal(){
        float consumo = 0;
        for (Bombilla bom :
                bombillas) {
            consumo += bom.coste();
        }
        return consumo;
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Casa[ ");
        for (int i = 0; i < bombillas.size(); i++) {
            res.append("Bombilla ").append(i).append(": ").append(bombillas.get(i).toString()).append(", \n");
        }
        res.append("Consumo : ").append(consumoTotal()).append("€");
        return res.toString();
    }

}
