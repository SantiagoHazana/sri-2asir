public class UsaRacional {
    
    public static void main (String[] args){

        Racional n1 = new Racional(1);
        Racional n2 = new Racional(2);
        Racional n3 = new Racional(6);
        System.out.print(n1);
        System.out.print(n2);
        System.out.print(n3);
        System.out.print(Racional.mcd(8, 12));
        System.out.printf("%s + %s = $s /n",n3,n2,n3.suma(n2));
        System.out.prinln(new Racional(3,7).suma(new Racional(9,8)));
        System.out.printf("%s - %s = %s /n",n3,n2,n3.resta(n2));
        System.out.printf("%s * %s = %s /n",n3,n2,n3.multiplicacion(n2));
        System.out.printf("%s / %s = %s /n",n3,n2,n3.division(n2));

    }
}
