package clases.Marine.Estatico;

public class TestPersona {
    public static void main(String[] args) {
        Persona marine = new Persona("Marine", "Moreno");
        System.out.println(Persona.cuentaPersonas);
        Persona marine2 = new Persona("Marine", "Moreno");
        Persona marine3 = new Persona("Marine", "Moreno");
        System.out.println(Persona.cuentaPersonas);

    }
}
