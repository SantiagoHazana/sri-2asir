package relaciones.relacion3;

public class TestRacional {

    public static void main(String[] args) {
        Racional num1 = new Racional(4, 6);
        Racional num2 = new Racional(2, 4);

        System.out.println(num1);
        System.out.println(num2);

        System.out.printf("La suma %s + %s = %s\n", num1, num2, num1.sum(num2));
        System.out.printf("La resta %s + %s = %s\n", num1, num2, num1.res(num2));
        System.out.printf("La division %s + %s = %s\n", num1, num2, num1.multi(num2));
        System.out.printf("La multiplicacion %s + %s = %s\n", num1, num2, num1.div(num2));

        

    }

}
