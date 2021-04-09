package clases.Jorge;

import java.util.ArrayList;

public class UsaFigura {

    public static void main(String[] args) {
//        Figura primera = new Figura("Verde");
//        primera.setArea(52.68);
//        System.out.println(primera);

        ArrayList<Figura> figuras = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Figura nueva = new Figura("Azul");
            nueva.setArea(Math.random()*50);
            figuras.add(nueva);
        }

        for (int i = 0; i < figuras.size(); i++) {
            System.out.println(figuras.get(i));
        }

    }

}
