package clases.ExamenRecu;

public class Ej1 {

    public static String conjetura(int num){
        StringBuilder res = new StringBuilder();
        int pasos = 0;
        while (num!=1){
            pasos++;
            if (num%2==0){
                res.append(num).append("(par) -> ");
                num/=2;
            }else{
                res.append(num).append("(impar) -> ");
                num = num * 3 + 1;
            }
        }
        res.append(num).append("(").append(pasos).append(" pasos)\n");
        return res.toString();
    }

    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            System.out.println(conjetura(i));
        }
    }

}
