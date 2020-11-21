package examen2019.ejercicio3;

import java.util.ArrayList;

public class Casa {

    ArrayList<Bombilla> bombillas = new ArrayList<>(10);

    public Casa() throws Exception {
        String[] lugares={"Salón","Cocina","Baño","Dormitorio 1","Dormitorio 2","Dormitorio 3","Entrada","Balcón"};

        for (int i = 0; i < 10; i++) {
            bombillas.add(new Bombilla(lugares[(int)(Math.random()*lugares.length)], false));
        }

    }

}
