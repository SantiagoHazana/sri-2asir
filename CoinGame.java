import java.util.Scanner;

public class CoinGame {

    public static void main(String[] args) {
        int coin = (int) (Math.random()*2);
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Desea tirar la moneda? Si/No");
        String option = scanner.next();
        if (option.toLowerCase().equals("si"))
            coin = (int) (Math.random()*2);

        coin = (int) (Math.random()*2);

        if (coin == 0){
            System.out.println("Ganaste!!!");
        }else
            System.out.println("Perdiste!!!");
    }

}
