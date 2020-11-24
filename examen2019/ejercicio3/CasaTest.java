package examen2019.ejercicio3;

import java.util.ArrayList;

public class CasaTest {

    public static void main(String[] args) throws Exception {
        ArrayList<Casa> casas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            casas.add(new Casa());
            System.out.println(casas.get(i));
        }
    }
}
