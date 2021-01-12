package clases.ExamenRecu;

public class Ej2 {

    public static boolean divisible_por_11(int num){
        int acumPares = 0;
        int acumImpares = 0;
        int count = 1;
        while (num != 0){
            if (count%2 == 0){
                acumPares += num%10;
            }else{
                acumImpares += num%10;
            }
            num/=10;
            count++;
        }
        return (acumImpares-acumPares)==0;
    }

    public static void main(String[] args) {
        for (int i = 10000; i < 20000; i++) {
            if (divisible_por_11(i))
                System.out.println(i);
        }
    }
}
