package clases.Sara.ExamenRecu2021.Ejercicio1;

public class UsaJarra {
    public static void main(String[] args) {
        Jarra jarraA = new Jarra(7);
        Jarra jarraB = new Jarra(4);

        jarraA.llena();
        System.out.println(jarraA);
        System.out.println(jarraB);
        System.out.println();

        jarraB.llenarDesde(jarraA);
        System.out.println(jarraA);
        System.out.println(jarraB);
        System.out.println();

        jarraB.vacia();
        System.out.println(jarraA);
        System.out.println(jarraB);
        System.out.println();

        jarraB.llenarDesde(jarraA);
        System.out.println(jarraA);
        System.out.println(jarraB);
        System.out.println();
    }
}
