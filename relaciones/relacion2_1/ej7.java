package relaciones.relacion2_1;

public class ej7 {

    public static void showDigits(String numStr){
        if (numStr.length()==0){
            return;
        } else {
            System.out.println(numStr.charAt(0));
            showDigits(numStr.substring(1));
        }
    }

    public static void main(String[] args) {
        showDigits("543201");
    }

}
