package clases.Sara.susRelaciones.relacionejercicios3java.ejercicio1;

public class UsaCoche {
    public static void main (String[] args){

        Coche coche = new Coche("345LFH6","Seat","Ibiza");
        System.out.println(coche);
        
        Coche coche1 = new Coche("345LFH6","Seat","Ibiza", Coche.MiColor.NEGRO,"familiar");
        System.out.println(coche1);

        

    }
    
}
