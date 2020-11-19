package clases.Sara.susRelaciones.relacionejercicios3java.ejercicio3;

public class UsaReloj {

    public static void main(String[] arg) {

        Reloj reloj= new Reloj();
        Reloj reloj2= new Reloj(8, 14, 35);
        Reloj reloj3= new Reloj(14, 5, 4);

        //Dar la hora normal
        System.out.println(reloj.dameHora());
        System.out.println(reloj2.dameHora());
        System.out.println(reloj3.dameHora());

        System.out.println("");
        // Dar la hora en distintos formatos
        System.out.println(reloj.dameHora(true));
        System.out.println(reloj2.dameHora(false));
        System.out.println(reloj3.dameHora(false));

    }
    
}
