package clases.ExamenRecu;

public class Ej1 {

    public static String conjetura(int num){
        String res = "";
        int pasos = 0;
        while (num!=1){
            pasos++;
            if (num%2==0){
                res += num + "(par) -> ";
                num/=2;
            }else{
                res += num + "(impar) -> ";
                num = num * 3 + 1;
            }
        }
        res += num + "(" + pasos + " pasos)\n";
        return res;
    }

    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            System.out.println(conjetura(i));
        }
    }

}
