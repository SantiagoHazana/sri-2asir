package clases.ExamenRecu;

import java.util.ArrayList;

public class Ej3 {

    public static void main(String[] args) {
        String[] colores = {"Rojo", "Verde", "Azul"};

        ArrayList<Shape> figuras = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random()*3);
            String color = colores[(int) (Math.random()* colores.length)];
            boolean filled = 0 == (int)(Math.random()*2);
            switch (rand){
                case 0:
                    figuras.add(new Shape(color, filled));
                    break;
                case 1:
                    figuras.add(new Circle(color, filled, Math.random()*10+1));
                    break;
                case 2:
                    figuras.add(new Rectangle(color, filled, Math.random()*10+1, Math.random()*10+1));
                    break;
                default:
                    i--;
                    break;
            }
        }

        figuras.forEach(System.out::println);
    }

}
