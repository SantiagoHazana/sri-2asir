package clases.Marine;

public class SumaDigitos {

    public static int sumaDigitos(int num){
        if (num/10 == 0)
            return num;
        return num%10 + sumaDigitos(num/10);
    }

    public static void main(String[] args) {
        System.out.println(sumaDigitos(123));
        System.out.println(sumaDigitos(555));
        System.out.println(sumaDigitos(225));
        System.out.println(sumaDigitos(11111));
    }

}
