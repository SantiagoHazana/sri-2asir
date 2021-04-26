package clases.Jorge;

import java.util.ArrayList;

public class UsaFigura {

    public static void main(String[] args) {

        // Crear 10 figuras aleatorias con valores y colores aleatorios
        ArrayList<Figura> figuras = new ArrayList<>();
        String[] colores = {"azul", "rojo", "verde", "negro", "blanco", "amarillo"};
        for (int i = 0; i < 10; i++) {
            String color = colores[(int)(Math.random() * colores.length)]; // este random me da siempre una posicion aleatoria de la matriz de colores
            int num = (int)(Math.random()*3); // esto me da un numero entre 0 y 2, dependiendo que numero me da, creo una figura diferente
            if (num == 0){
                Figura figura = new Figura(color);
                figuras.add(figura);
            }else if (num == 1){
                Circulo circulo = new Circulo(color, (float) (Math.random()*10));
                circulo.calcularArea();
                circulo.calcularPerimetro();
                figuras.add(circulo);
            }else{
                Triangulo triangulo = new Triangulo(color, (float) (Math.random()*10), (float) (Math.random()*10), (float) (Math.random()*10), (float) (Math.random()*10), (float) (Math.random()*10));
                triangulo.calcularArea();
                triangulo.calcularPerimetro();
                figuras.add(triangulo);
            }
        }

        // Recorrer y mostrar todas mis figuras
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println(figuras.get(i));
        }

        // crear la clase Rectangulo y agregarlo a nuestro programa

    }

}
