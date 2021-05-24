package clases.Manu;

public class UsaFigura {

    public static void main(String[] args) {

        Figura figura = new Figura();
        Figura figura2 = new Figura("Verde");

        System.out.println(figura);
        System.out.println(figura2);

        Circulo circulo = new Circulo(4.56, "Azul");
        System.out.println(circulo);

        Triangulo triangulo = new Triangulo();
        Triangulo triangulo2 = new Triangulo(6.3, 3,"Rojo");
        System.out.println(triangulo);
        System.out.println(triangulo2);

    }

}
