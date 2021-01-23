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
        return (acumImpares-acumPares)==0 || (acumImpares-acumPares)==11;
    }

    public static boolean divisible_por_11(int num, boolean par, int acumPares, int acumImpares){
        if (num == 0)
            return (acumPares-acumImpares)%11==0;
        return par ? divisible_por_11(num/10, false, acumPares + num % 10, acumImpares):divisible_por_11(num/10, true, acumPares, acumImpares + num % 10);
    }

    public static void main(String[] args) {
        for (int i = 10000; i < 20000; i++) {
            if (divisible_por_11(i))
                System.out.println("Iter: " + i);
            if (divisible_por_11(i, true, 0, 0))
                System.out.println("Recu: " + i);
        }
    }
}
