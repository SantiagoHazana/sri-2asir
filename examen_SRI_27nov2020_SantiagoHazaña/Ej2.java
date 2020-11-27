package examen_SRI_27nov2020_SantiagoHazaña;

import java.util.ArrayList;

public class Ej2 {

    public static int sum_cuad_dig(int num){
        if (num/10 == 0)
            return num*num;
        return (int) (Math.pow(num%10, 2) + sum_cuad_dig(num/10));
    }

    public static boolean feliz(int num){
        int sumCuad = sum_cuad_dig(num);
        for (int i = 0; i < 10; i++) {
            if (sumCuad == 1)
                return true;
            sumCuad = sum_cuad_dig(sumCuad);
        }
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> felices = new ArrayList<>();

        for (int i = 1; i <= 1000 ; i++) {
            if (feliz(i))
                felices.add(i);
        }

        for (Integer num : felices) {
            System.out.println(num);
        }

    }

}
