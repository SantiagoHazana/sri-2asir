package primeraEvaluacion.relaciones.relacion2_1;

public class ej6 {

    public static void invertNumber(int num){

        if (num==0)
            return;
        else{
            System.out.print(num%10);
            invertNumber(num/10);
        }
    }

    public static void main(String[] args) {
        invertNumber(543201);
    }

}
