package random.juegoDeLaVida;

import java.util.ArrayList;

public class JuegoDeLaVida {

    private Space[][] spaces;

    public JuegoDeLaVida(int size){
        spaces = new Space[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                spaces[i][j] = new Space();
            }
        }
    }

    public void randomSpaces(){
        for (Space[] space : spaces) {
            for (Space value : space) {
                value.setValue((int) (Math.random() * 2) == 1 ? " O " : "   ");
            }
        }
    }

    public void showSpaces(){
        for (Space[] space : spaces) {
            for (Space value : space) {
                System.out.printf(".%s", value);
            }
            System.out.print(".\n");
        }
    }

    public void checkSpaces(){
        for (int i = 0; i < spaces.length; i++) {
            for (int j = 0; j < spaces[i].length; j++) {
                if (spaces[i][j].isEmpty()){
                    if (i-1<0){

                    }else{

                    }
                }

            }
        }
    }


}
