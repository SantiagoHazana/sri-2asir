package examen_SRI_27nov2020_SantiagoHazaña;

import java.util.ArrayList;

public class Ej2 {

    public static int sum_cuad_dig(int num){
        if (num/10 == 0)
            return num*num;
        return (int) (Math.pow(num%10, 2) + sum_cuad_dig(num/10));
    }

    public static int sum_cuad_dig_iter(int num){
        int resultado = 0;
        while (num != 0){
            resultado += num%10 * num%10;
            num /= 10;
        }
        return resultado;
    }

    public static boolean feliz(int num){
        ArrayList<Integer> resultados = new ArrayList<>();
        int sumCuad = sum_cuad_dig_iter(num);
        while (!resultados.contains(sumCuad)) {
            if (sumCuad == 1)
                return true;
            resultados.add(sumCuad);
            sumCuad = sum_cuad_dig_iter(sumCuad);
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

        System.out.println("Numero de numeros felices: " + felices.size());

    }

}
