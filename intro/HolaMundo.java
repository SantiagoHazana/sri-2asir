package intro;

public class HolaMundo {
    public static void main(String[] args) {
        Persona marina = new Persona();
        marina.cambiarNombre("Marina");
        marina.apellidos = "Moreno";
        System.out.println(marina.dimeTuNombre());
    }
}
