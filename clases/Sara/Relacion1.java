package clases.Sara;

public class Relacion1 {

    public static long invertirNumMatematico(long n){
        long resultado = 0;
        while (n != 0){
            long digito = n%10;
            n = n/10;
            resultado = resultado*10 + digito;
        }
        return resultado;
    }

    public static long invertirNumString(long n){
        String num = Long.toString(n);
        String resultado = "";
        for (int i = num.length()-1; i >= 0; i--) {
            resultado += num.charAt(i);
        }
        return Long.parseLong(resultado);
    }

    public static void main(String[] args) {
        System.out.println(invertirNumString(12345));
    }

}
