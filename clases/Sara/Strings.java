package clases.Sara;

public class Strings {
    static String nombre = "Sara";
    static String apellido = new String("Aguilera");
    static String nombre2 = new String(nombre);


    public static void main(String[] args) {
        // metodos del string

        // length()
        nombre.length();

        // charAt(int i), te devuelve la letra en la posicion dada
        nombre.charAt(2); // esto me devuelve la r
        apellido.charAt(apellido.length()-1); // me devuelve la ultima letra

        // subString(), te devuelve parte de tu string original
        // subString(int i), devuelve desde la posicion i hasta el final, i inclusive
        apellido.substring(3); // me devuelve ilera
        // subString(int i, int f), devuelve desde la posicion i hasta la posicion f, donde i es inclusive y f es exclusivo
        apellido.substring(0, 3); // me devuelve agu
        apellido.substring(1, 3); // me devuelve gu

        //toUpperCase(), lo pone todo en mayusculas
        nombre.toUpperCase(); // me da SARA
        //toLowerCase(), lo pone todo en minusculas
        nombre.toLowerCase(); // me da sara

        //trim(), te devuelve una copia del string, saca los espacios en blanco de los extremos, pero no los del medio
        "  Hola como estas      ".trim();// devuelve "Hola como estas"

        // replace(char viejo, char nuevo), reemplaza el caracter viejo por el nuevo
        apellido.replace('i', '1'); // me devuelve Agu1lera


        String frase = "Vamos a hackear esta frase";

        frase = frase.toLowerCase().replace('e', '3').replace('a', '4').replace('i', '1').replace('o', '0');
        System.out.println(frase);
    }


}
