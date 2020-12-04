package primeraEvaluacion.relaciones.relacion2_1;

public class ej9 {

    public static int divisionRestasSucesivas(int dividendo, int divisor){
        if (dividendo < divisor)
            return 0;
        else
            return 1 + divisionRestasSucesivas(dividendo-divisor,divisor);
    }

    public static void main(String[] args) {
        System.out.println(divisionRestasSucesivas(9, 3));
        System.out.println(divisionRestasSucesivas(10, 3));
        System.out.println(divisionRestasSucesivas(12, 3));
        System.out.println(divisionRestasSucesivas(50, 10));
        System.out.println(divisionRestasSucesivas(50, 9));
    }

}
