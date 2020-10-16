package intro;

import java.util.ArrayList;
import java.util.Random;

public class LoteriaRandom {

    public static ArrayList<Integer> loteria1(){
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            nums.add((int)(Math.random()*49+1));
        }
        nums.sort(Integer::compareTo);
        return nums;
    }

    public static ArrayList<Integer> loteria2(Random random){
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            nums.add(random.nextInt(49)+1);
        }
        nums.sort(Integer::compareTo);
        return nums;
    }
    public static ArrayList<Integer> loteria3(Random random){
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            nums.add(random.nextInt(49)+1);
        }
        nums.sort(Integer::compareTo);
        return nums;
    }
    public static ArrayList<Integer> loteria4(Random random){
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            nums.add(random.nextInt(49)+1);
        }
        nums.sort(Integer::compareTo);
        return nums;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Random random2 = new Random(1234);
        Random random3 = new Random(1234);

        System.out.printf("Los numeros con Math.random son: ");
        for (Integer i : loteria1()) {
            System.out.printf("%2d ", i);
        }

        System.out.println();

        System.out.printf("Los numeros con Random() son: ");
        for (Integer i : loteria2(random)) {
            System.out.printf("%2d ", i);
        }

        System.out.println();

        System.out.printf("Los numeros con Random(1234) son: ");
        for (Integer i : loteria3(random2)) {
            System.out.printf("%2d ", i);
        }

        System.out.println();

        System.out.printf("Los numeros con Random(1234) son: ");
        for (Integer i : loteria4(random3)) {
            System.out.printf("%2d ", i);
        }

    }
}
