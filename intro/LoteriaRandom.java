package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class LoteriaRandom {

    public static ArrayList<Integer> loteria1(){
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = (int)(Math.random()*49+1);
            if (nums.contains(num))
                i--;
            else
                nums.add(num);
        }
        nums.sort(Integer::compareTo);
        return nums;
    }

    public static ArrayList<Integer> loteria2(){
        Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(49)+1;
            if (nums.contains(num))
                i--;
            else
                nums.add(num);
        }
        nums.sort(Integer::compareTo);
        return nums;
    }
    public static ArrayList<Integer> loteria3(Random random){
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(49)+1;
            if (nums.contains(num))
                i--;
            else
                nums.add(num);
        }
        nums.sort(Integer::compareTo);
        return nums;
    }
    public static ArrayList<Integer> loteria4(Random random){
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(49)+1;
            if (nums.contains(num))
                i--;
            else
                nums.add(num);
        }
        nums.sort(Integer::compareTo);
        return nums;
    }

    public static void main(String[] args) {
        int simulations = -1;
        if (args.length==0){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (simulations<=0 || simulations>1000){
                try {
                    System.out.printf("Ingrese el numero de repeticiones: ");
                    simulations = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e){
                    System.out.println("Ingrese un numero!!!");
                }
            }
        }else{
            simulations = Integer.parseInt(args[0]);
        }

        Random random = new Random();
        long count = 0;
        ArrayList<ArrayList<Long>> data = new ArrayList<ArrayList<Long>>();
        ArrayList<Integer> numsLoteria;
        ArrayList<Integer> numsJugador = null;


        for (int i = 0; i < simulations; i++) {
            numsLoteria = loteria2();
            count=0;
//            System.out.printf("La combinacion ganadora es: %s\n", numsLoteria.toString());
            long startTime = System.currentTimeMillis();
            while (!numsLoteria.equals(numsJugador)) {
                numsJugador = loteria2();
                count++;
            }
            long endTime = System.currentTimeMillis();
            ArrayList<Long> newData = new ArrayList<>();
            newData.add(count);
            newData.add(endTime-startTime);
            data.add(i, newData);
            System.out.printf("%d Ganaste la loteria despues de %9d intentos. Combinacion: %s Tiempo %3.2f seg.\n", i+1, count, numsJugador.toString(), (float)(endTime - startTime) / 1000);
        }
        generateStatistics(data, simulations);
    }

    private static void generateStatistics(ArrayList<ArrayList<Long>> data, int tries) {
        long averageTries = 0;
        float averageTime = 0;
        ArrayList<Long> maxTry = data.get(0);
        ArrayList<Long> lowerTry = data.get(0);

        for (ArrayList<Long> datos : data) {
            averageTries += datos.get(0);
            averageTime += datos.get(1);
            if (datos.get(1) > maxTry.get(1))
                maxTry = datos;
            if (datos.get(1) < lowerTry.get(1))
                lowerTry = datos;
        }

        averageTries /= tries;
        averageTime /= tries;

        System.out.printf("Los intentos promedios son %d con tiempo promedio %4.2f seg\n", averageTries, averageTime/1000);
        System.out.printf("El intento que mas tardo fue de %d intentos y %3.2f seg\n", maxTry.get(0), (float)maxTry.get(1)/1000);
        System.out.printf("El intento que menos tardo fue de %d intentos y %3.2f seg\n", lowerTry.get(0), (float)lowerTry.get(1)/1000);
    }
}
