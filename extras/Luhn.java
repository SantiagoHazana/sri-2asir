package extras;

import java.util.ArrayList;

public class Luhn {

    ArrayList<Integer> numbers;

    public Luhn(){
        numbers = new ArrayList<>();
    }

    public boolean checkNumber(String number){
//        cutNumberDigits(Long.parseLong(number));
        cutNumbersString(number);
        for (int i = 1; i < numbers.size(); i+=2) {
            int num = numbers.get(i)*2;
            numbers.remove(i);
            numbers.add(i, num >= 10 ? (num%10)+(num/10):num);
        }
        return numbers.stream().mapToInt(n -> n).sum()%10 == 0;
    }

    public String getNextLuhn(String number){
        String next = number;
        for (int i = 1; i < 10; i++) {
            if (checkNumber(next.concat(String.valueOf(i))))
                return next.concat(String.valueOf(i));

            next = number;
        }
        return "No existe siguiente numero Luhn";
    }

    private void cutNumbersString(String number){
        numbers.clear();
        for (int i = 0; i < number.length(); i++) {
            numbers.add(Integer.parseInt(String.valueOf(number.charAt(i))));
        }
    }

    private void cutNumberDigits(long number){
        numbers.clear();
        while (number != 0){
            numbers.add((int) (number%10));
            number /= 10;
        }
    }

    private void printNumbers(ArrayList<Integer> numbers){
        for (Integer num :
                numbers) {
            System.out.printf("%d", num);
        }
        System.out.println("");
    }

}
