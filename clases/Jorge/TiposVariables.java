package clases.Jorge;

public class TiposVariables {

    // Java es un lenguaje tipado, es decir que las variables tienen un tipo definido y no puede cambiar

    // doble barra es un comentario de una sola linea

    /* Bloque de comentario
    * Poner varias lineas
    */

    public static void main(String[] args) {
        // Tipos de datos primitivos
        // numeros enteros - int - guarda en 32 bits
        int num = 5;
        num = 2;
        // num = 2.5; esto falla porque le quiero dar a num otro tipo de valor.
        // int num = 3; esto falla porque no pueden habre dos variables con el mismo nombre

        // long - guarda en 64 bits
        long numx = 5;

        // numeros con decimales - float
        float num1 = 5.5f; // se le pone la f para especificar que es un floar y no un double(decimal con el doble de precision)

        // double
        double num2 = 5.5; // aca podemos usar f porque el double incluye el float

        // caracter - char
        char unCaracter = 'a';

        // booleanos - true o false
        boolean soyGay = true;
        soyGay = false;

        // Cadena de caracteres - String - no es primitivo -  guarda muchos char
        String texto = "Mi nombre es Jorge de la jungla";

        // como mostramos por consola algo
        System.out.println("Hola Mundo!");

        // operador de asignacion - = - asigna valores a variables;

        // operadores aritmeticos - mates
        // suma, resta, multiplicacion +, -, *
        int n = 5;
        int n2 = 8;
        int res = n + n2; // lo mismo con resta y multiplicacion

        // division - / - sera entera si utilizo int y con decimales en lo contrario
        float res2 = 5/8; // esto al ser division de enteros, me da el resultado entero, para que sea con deciamles uno debe ser float

        // modulo - % - me da el resto de la division - para comprobar si un numero es par o impar - comprobar si un numero es divisor del otro

        // operadores comparadores
        // comparar dos valores - ==
        // mayor >
        // menor <
        // mayor igual >=
        // menor igual <=

        // control de flujo
        // if - else - else if
//        if (/*condicion*/){
//            // que hago si se cumple la condicion
//        }else if (otra condicion){
//
//        }else{
//            // opcion por defecto
//        }

    }



}
